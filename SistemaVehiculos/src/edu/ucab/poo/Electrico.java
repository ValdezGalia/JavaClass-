package edu.ucab.poo;

public class Electrico extends Automovil{
    private double porcentajeBateria;
    private int tiempoCargaMinutos;

    public Electrico(String marca, String modelo, int anio, int numeroPuertas, boolean tieneAireAcondicionado, double porcentajeBateria, int tiempoCargaMinutos) {
        super(marca, modelo, anio, numeroPuertas, tieneAireAcondicionado);
        this.porcentajeBateria = porcentajeBateria;
        this.tiempoCargaMinutos = tiempoCargaMinutos;
    }

    public void cargarBateria(){
        System.out.println("Cargando bateria...");
        this.porcentajeBateria += this.tiempoCargaMinutos;
    }

    public void mostrarAutonomia(){
        int kilometros = (int) (this.porcentajeBateria / 1000.0);
        System.out.println("La autonomia del carro: " + kilometros);
    }
}
