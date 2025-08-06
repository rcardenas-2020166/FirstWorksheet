package edu.gt.rodrigocardenas.umg.models;

public class Carro {
    private static final int CANTIDAD_LLANTAS = 5;
    private static final int CANTIDAD_PUERTAS = 4;
    private static final int CANTIDAD_VENTANAS = 4;
    
    public String placa;
    public String marca;
    public String linea;
    public int anio;
    public Llantas[] llantas = new Llantas[CANTIDAD_LLANTAS];
    public Ventana[] ventanas = new Ventana[CANTIDAD_VENTANAS];
    public Puerta[] puertas = new Puerta[CANTIDAD_PUERTAS];
    public Motor motor;

    public Carro(){
        System.out.println("Iniciando Empty Carro");
        inicializarComponentes();
    }

    public Carro(String placa, String marca, String linea, int anio){
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("La placa no puede estar vacía");
        }
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía");
        }
        if (linea == null || linea.trim().isEmpty()) {
            throw new IllegalArgumentException("La línea no puede estar vacía");
        }
        if (anio < 1900 || anio > 2030) {
            throw new IllegalArgumentException("El año debe estar entre 1900 y 2030");
        }
        
        this.placa = placa;
        this.marca = marca;
        this.linea = linea;
        this.anio = anio;
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        for(int i = 0; i < CANTIDAD_LLANTAS; i++) {
            llantas[i] = new Llantas();
        }
        
        for(int i = 0; i < CANTIDAD_VENTANAS; i++) {
            ventanas[i] = new Ventana(i+1, i+1, 50);
        }
        
        for(int i = 0; i < CANTIDAD_PUERTAS; i++) {
            puertas[i] = new Puerta(i+1, i+1, true);
        }
        
        motor = new Motor();
    }

    public void arrancar(){
        System.out.println("Arranca " + this.placa);
    }

    public void enllantar() {
        System.out.println("Enllantando Vehículo");
        for(int i = 0; i < CANTIDAD_LLANTAS; i++){
            this.llantas[i] = new Llantas(12, 12, "GoodYear");
        }
        System.out.println("Vehículo Enllantado");
    }

    public boolean puertaAbrir() {
        System.out.println("Abriendo todas las puertas del carro " + placa);
        for(int i = 0; i < CANTIDAD_PUERTAS; i++) {
            puertas[i].abrirPuerta();
        }
        return true;
    }
    
    public boolean puertaAbrir(int numeroPuerta) {
        if(numeroPuerta >= 1 && numeroPuerta <= CANTIDAD_PUERTAS) {
            System.out.println("Abriendo puerta " + numeroPuerta + " del carro " + placa);
            return puertas[numeroPuerta-1].abrirPuerta();
        }
        System.out.println("Número de puerta inválido. Debe ser entre 1 y " + CANTIDAD_PUERTAS);
        return false;
    }

    public void acelerar() {
        System.out.println("Carro " + placa + " acelerando");
        motor.acelerar();
    }
}
