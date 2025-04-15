package claabstractas;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double posicionX, double posicionY, double radio) {
        super(posicionX, posicionY);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
//        double resultado = Math.PI * Math.pow(radio, 2); // TODO: Se puede hacer de esta manera el calculo del area del circulo
        final double PI = Math.PI;
        return PI * this.radio * this.radio;
    }
}
