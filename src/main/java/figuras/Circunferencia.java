package figuras;

public class Circunferencia {
    public static final double PI = 3.1416;
    private double radio;
    private String color;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area1 = 2 * PI * this.radio * this.radio;
        double area = area1;
        System.out.println(area);
    }

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            return radio1 == radio2;
        } else {
            return Math.abs(radio1 - radio2) < 1;
        }
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

