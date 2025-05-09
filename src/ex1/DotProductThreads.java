package ex1;

public class DotProductThreads extends Thread {
    private int[] v1;
    private int[] v2;
    private int dot = 0;

    public DotProductThreads(int[] v1, int[] v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public void run(){
        int temp = 0;
        if(this.v1.length != this.v2.length)
            throw new IllegalArgumentException("Arrays haben nicht gleiche länge!");
        for (int i = 0; i < v1.length; i++){
            temp += v1[i]*v2[i];
        }
        dot = temp;
    }

    public int getDot(){
        return dot;
    }
    public void setV2(int[] v2){
        this.v2 = v2;
    }
    public int[] getV2(){
        return v2;
    }
    public int[] getV1() {
        return v1;
    }
    public void setV1(int[] v1) {
        this.v1 = v1;
    }


}
