package edu.gt.rodrigocardenas.umg.models;

public class Ventana {
    public int ventana;
    public int ubicacion;
    public int tamanho;

    public Ventana() {}

    public Ventana(int ventana, int ubicacion, int tamanho) {
        this.ventana = ventana;
        this.ubicacion = ubicacion;
        this.tamanho = tamanho;
    }

    public void abrir(boolean abrir) {
        if (abrir) {
            System.out.println("Ventana " + ventana + " abierta");
        } else {
            System.out.println("Ventana " + ventana + " cerrada");
        }
    }
} 