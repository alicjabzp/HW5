package ex1;

public class MatrixMultMainsolution {

    public static void main(String[] args) {
        int[][] A = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] B = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = matrixProductThreads(A, B);
    }

    public static int[][] matrixProductThreads(int[][] A, int[][] B){
        int[][] bTransp = transpose(B);
        if (A[0].length!=B[0].length) return new int[0][0];
        int[][] result = new int [A.length][B[0].length];
        for(int i = 0; i < A.length; i++) {
            for (int j = 0; j < bTransp.length; j++) {
                DotProductThreads current = new DotProductThreads(A[i], bTransp[j]);
                current.run();
                //current.start();
                result[i][j] = current.getDot();
            }
        }
        return result;
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
