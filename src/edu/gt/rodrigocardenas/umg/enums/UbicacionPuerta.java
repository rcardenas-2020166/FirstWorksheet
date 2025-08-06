package edu.gt.rodrigocardenas.umg.enums;

public enum UbicacionPuerta {
    DELANTERA_IZQUIERDA(1),
    DELANTERA_DERECHA(2),
    TRASERA_IZQUIERDA(3),
    TRASERA_DERECHA(4);
    
    private final int numero;
    
    UbicacionPuerta(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public static UbicacionPuerta porNumero(int numero) {
        for (UbicacionPuerta ubicacion : values()) {
            if (ubicacion.numero == numero) {
                return ubicacion;
            }
        }
        throw new IllegalArgumentException("Número de ubicación inválido: " + numero);
    }
}