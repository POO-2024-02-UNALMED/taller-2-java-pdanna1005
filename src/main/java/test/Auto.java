package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos() {
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento instanceof Asiento) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public String verificarIntegridad() {
        if (motor.getRegistro() != this.registro) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento.getRegistro() != this.registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
