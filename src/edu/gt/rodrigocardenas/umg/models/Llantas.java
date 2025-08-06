package edu.gt.rodrigocardenas.umg.models;

public class Llantas {
    public int rin;
    public int perfil;
    public String marca;

    public Llantas() {
        this.rin = 15;
        this.perfil = 65;
        this.marca = "Genérica";
    }

    public Llantas(int rin,int perfil,String marca){
        this.rin = rin;
        this.perfil = perfil;
        this.marca = marca;
    }
}
