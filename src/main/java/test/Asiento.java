package test;

public class Asiento {
    String color;
    int precio;
    int registro;
    static String[] colorPermitidoEn = { "rojo", "verde", "amarillo", "blanco", "negro" };

    void cambiarColor(String nuevoColor) {
        for (String color : colorPermitidoEn) {
            if (color.equals(nuevoColor)) {
                this.color = nuevoColor;
            }
        }
    }

    public int getRegistro() {
        return registro;
    }
}
