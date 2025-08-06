package edu.gt.rodrigocardenas.umg.models;

public class Puerta {
    int numeroPuerta;
    int ubicacion;
    boolean electrica;
    boolean abierta;
    boolean ventanaAbierta;

    public Puerta() {
        this.numeroPuerta = 1;
        this.ubicacion = 1;
        this.electrica = true;
        this.abierta = false;
        this.ventanaAbierta = false;
    }

    public Puerta(int numeroPuerta, int ubicacion, boolean electrica) {
        if (numeroPuerta < 1 || numeroPuerta > 4) {
            throw new IllegalArgumentException("El número de puerta debe estar entre 1 y 4");
        }
        this.numeroPuerta = numeroPuerta;
        this.ubicacion = ubicacion;
        this.electrica = electrica;
        this.abierta = false;
        this.ventanaAbierta = false;
    }

    public boolean abrirPuerta() {
        this.abierta = true;
        System.out.println("Abriendo puerta " + numeroPuerta);
        return true;
    }

    public boolean cerrarPuerta() {
        this.abierta = false;
        System.out.println("Cerrando puerta " + numeroPuerta);
        return true;
    }

    public boolean subirVentana() {
        this.ventanaAbierta = false;
        System.out.println("Subiendo ventana de puerta " + numeroPuerta);
        return true;
    }

    public boolean bajarVentana() {
        this.ventanaAbierta = true;
        System.out.println("Bajando ventana de puerta " + numeroPuerta);
        return true;
    }

    public String getEstadoPuerta() {
        return "Puerta " + numeroPuerta + " - " + (abierta ? "Abierta" : "Cerrada") + ", Ventana: " + (ventanaAbierta ? "Abierta" : "Cerrada");
    }
} 