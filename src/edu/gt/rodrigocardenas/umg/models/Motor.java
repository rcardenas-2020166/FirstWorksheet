package edu.gt.rodrigocardenas.umg.models;

public class Motor {
    public int tamanho;
    public boolean gasolina;
    public String marca;

    public Motor() {
        this.tamanho = 2000;
        this.gasolina = true;
        this.marca = "Genérico";
    }

    public Motor(int tamanho, boolean gasolina, String marca) {
        this.tamanho = tamanho;
        this.gasolina = gasolina;
        this.marca = marca;
    }

    public void acelerar() {
        System.out.println("Motor " + marca + " acelerando");
    }
} 