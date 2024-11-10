package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String tipoMotor) {
        if (tipoMotor == "electrico" || tipoMotor == "gasolina") {
            this.tipo = tipoMotor;
        }
    }
}
