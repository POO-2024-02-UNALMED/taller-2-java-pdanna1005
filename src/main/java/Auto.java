package test;

import test.Asiento;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    void cantidadAsientos(int asientos) {
        for (Asiento asiento : asientos) {
            asiento.toString();
        }
        ;
    }

    public String verificarIntegridad(boolean u) {
        if (motor.getRegistro() != this.registro){
            return "Las piezas no son originales";
        }
        for (Asiento asiento: asientos){
            if (asiento.getRegistro() != this.registro){
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
        }
    }
}
