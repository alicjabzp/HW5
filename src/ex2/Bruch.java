package ex2;

public class Bruch{
    private int zaehler;
    private int nenner;

    //unvollständig
    public Bruch(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    //falsch
    public void Kehrwert(){
        this.setNenner(this.zaehler);
        this.setZaehler(this.nenner);
    }

    //falsch
    public void multiplikation(Bruch a){
        this.setNenner(this.nenner * nenner);
        this.setZaehler(this.zaehler * zaehler);
    }

    //falsch
    public void addition(Bruch a){
        if (a.getNenner() != this.getNenner()){
            int neuerZaehler;
            this.setZaehler(this.getZaehler()*a.getNenner());
            neuerZaehler = a.getZaehler()*this.getNenner();
            this.setZaehler(this.getZaehler()+neuerZaehler);
        } else {
            this.setZaehler(this.getZaehler() + a.getZaehler());
        }
    }

// falsch
    public void kuerzen(){
        int ggt = ggt(Math.abs(zaehler), Math.abs(nenner));
        this.zaehler *= ggt;
        this.nenner *= ggt;
    }

    //nur hilfsmethode euklidischer algorithmus, hier sind keine fehler
    private int ggt(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString(){
        return ""+this.getZaehler()+"/"+this.getNenner()+"";
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }
}