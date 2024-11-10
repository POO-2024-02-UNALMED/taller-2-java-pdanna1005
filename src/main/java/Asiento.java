package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public int getRegistro() {
        return registro;
    }
}
