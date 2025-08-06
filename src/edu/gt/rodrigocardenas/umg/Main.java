package edu.gt.rodrigocardenas.umg;

import edu.gt.rodrigocardenas.umg.models.Carro;

public class Main {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("P923JYF", "Mazda", "3", 2024);
        
        carro1.motor.tamanho = 2500;
        carro1.motor.gasolina = true;
        carro1.motor.marca = "Mazda";
        
        carro1.enllantar();
        
        System.out.println("\n=== PROBANDO FUNCIONALIDADES DEL CARRO ===");
        
        carro1.arrancar();
        
        carro1.puertaAbrir();
        
        carro1.acelerar();
        
        System.out.println("\n=== PROBANDO 4 VENTANAS DEL CARRO (ABRIR) ===");
        for(int i = 0; i < carro1.ventanas.length; i++) {
            carro1.ventanas[i].abrir(true);
        }
        
        System.out.println("\n=== PROBANDO 4 VENTANAS DEL CARRO (CERRAR) ===");
        for(int i = 0; i < carro1.ventanas.length; i++) {
            carro1.ventanas[i].abrir(false);
        }
        
        System.out.println("\n=== PROBANDO 4 PUERTAS DEL CARRO ===");
        
        System.out.println("-- Abriendo todas las puertas --");
        for(int i = 0; i < carro1.puertas.length; i++) {
            carro1.puertas[i].abrirPuerta();
        }
        
        System.out.println("\n-- Probando ventanas de las puertas --");
        for(int i = 0; i < carro1.puertas.length; i++) {
            carro1.puertas[i].bajarVentana();
            carro1.puertas[i].subirVentana();
        }
        
        System.out.println("\n-- Cerrando todas las puertas --");
        for(int i = 0; i < carro1.puertas.length; i++) {
            carro1.puertas[i].cerrarPuerta();
        }
        
        System.out.println("\n-- Estado de las puertas --");
        for(int i = 0; i < carro1.puertas.length; i++) {
            System.out.println(carro1.puertas[i].getEstadoPuerta());
        }
        
        System.out.println("\n=== INFORMACIÓN DEL CARRO ===");
        System.out.println("Placa: " + carro1.placa);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Línea: " + carro1.linea);
        System.out.println("Año: " + carro1.anio);
        System.out.println("Motor: " + carro1.motor.marca + " - " + carro1.motor.tamanho + "cc");
        System.out.println("Combustible: " + (carro1.motor.gasolina ? "Gasolina" : "Diésel"));
        System.out.println("Número de llantas: " + carro1.llantas.length);
        System.out.println("Número de ventanas: " + carro1.ventanas.length);
        System.out.println("Número de puertas: " + carro1.puertas.length);
        
        System.out.println("\n=== INFORMACIÓN DE LLANTAS ===");
        for(int i = 0; i < carro1.llantas.length; i++) {
            System.out.println("Llanta " + (i+1) + ": Rin " + carro1.llantas[i].rin + 
                             ", Perfil " + carro1.llantas[i].perfil + 
                             ", Marca " + carro1.llantas[i].marca);
        }
    }
}