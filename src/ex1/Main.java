package ex1;

public class Main{
    public static void main(String[] args) {
        int[][] A = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] B = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = matrixProduct(A, B);
        System.out.println(result[0][2]);


    }

    public static int[][] matrixProductThreads(int[][] A, int[][] B){
        int[][] bTransp = transpose(B);
        if (A[0].length!=B[0].length) return new int[0][0];
        int[][] result = new int [A.length][B[0].length];
        long start = System.nanoTime();
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < bTransp.length; j++){
                DotProductThreads current = new DotProductThreads(A[i],bTransp[j]);
                current.run();
                //current.start();
                result[i][j] = current.getDot();
            }
        }
        long timeNeeded = System.nanoTime() - start;
        System.out.println(timeNeeded);
        return result;
    }

    public static int[][] matrixProduct(int[][] A, int[][] B){
        int zeilenA = A.length;
        int spaltenA = A[0].length;
        int zeilenB = B.length;
        int spaltenB = B[0].length;

        if (spaltenA != zeilenB) {
            throw new IllegalArgumentException("Spalten von A müssen gleich Zeilen von B sein.");
        }

        int[][] ergebnis = new int[zeilenA][spaltenB];

        for (int i = 0; i < zeilenA; i++) {
            for (int j = 0; j < spaltenB; j++) {
                for (int k = 0; k < spaltenA; k++) {
                    ergebnis[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return ergebnis;
    }

    public static int[][] transpose(int[][] A){
        int zeilen = A.length;
        int spalten = A[0].length;

        int[][] transp = new int[spalten][zeilen];
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                transp[j][i] = A[i][j];
            }
        }
        return transp;
    }


}