package claabstractas;

public abstract class Figura {
    protected double posicionX; // Posicion en X
    protected double posicionY; // Posicion en Y

    protected Figura() {

    }

    protected Figura(double posicionX, double posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public abstract double calcularArea();
}
