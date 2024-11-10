package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    void cantidadAsientos(int cantidadAsientos) {
        for (Asiento asiento : asientos) {
            asiento.toString();
        }
        ;
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
