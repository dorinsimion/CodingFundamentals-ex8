package com.company;

public class Cilindru {
    private double raza;
    private double inaltime;


        public Cilindru(double raza, double inaltime) {
            this.raza = raza;
            this.inaltime = inaltime;}

    public double calculeazaSuprafata(){
        return 2* Math.PI*raza*(raza+inaltime);
    }

    public double calculeazaVolumul(){
        return Math.PI*Math.pow(raza,2)*inaltime;
    }

    public String toString(){
        return "Cilindrul cu raza "+raza +" si "+inaltime;
    }
}
