package claabstractas;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double posicionX, double posicionY, double lado) {
        super(posicionX, posicionY);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = this.lado * this.lado;
        return resultado;
    }
}
