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
        double d = 2 * radio;
        System.out.println("Di�metro: " + d);
        System.out.println("Color: " + color);
        double area = calcularArea();
        System.out.println(area);
    }

    private double calcularArea() {
        double area = 2 * PI * this.radio * this.radio;
        return area;
    }

    public boolean esIgual(Circunferencia otro, boolean conDecimales) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (conDecimales) {
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

