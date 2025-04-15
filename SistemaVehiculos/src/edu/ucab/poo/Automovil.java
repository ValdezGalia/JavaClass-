package edu.ucab.poo;

public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;

    public Automovil(String marca, String modelo, int anio, int numeroPuertas, boolean tieneAireAcondicionado) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public void encenderMotor(){
        System.out.println("El vehiculo ha sido encendido.");
    }

    public void verificarComodidad(){
        System.out.println("Cantidad de puertas: " + this.numeroPuertas + "\nTiene aire acondicionado: " + ( this.tieneAireAcondicionado ? "Si" : "No"));
    }

}
