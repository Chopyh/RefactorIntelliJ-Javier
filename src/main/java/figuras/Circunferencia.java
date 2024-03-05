package figuras;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        String color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
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

