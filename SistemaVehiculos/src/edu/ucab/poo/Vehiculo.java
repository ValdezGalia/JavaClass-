package edu.ucab.poo;

import java.util.Random;

public class Vehiculo {
    private final String numeroChasis = generarChasis();//ID
    private String marca;
    private String modelo;
    int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public final void registrarVehiculo() {
        System.out.println("Vehiculo registrado en el sistema nacional de transito.");
    }

    public void mostrarDatos(){
        System.out.println("Numero chasis: " + numeroChasis + "\nMarca: " + marca + "\nModelo: " + modelo);
    }

    public void calcularImpuesto(){
        System.out.println("h");
    }

    private String generarChasis(){
        Random rand = new Random(System.currentTimeMillis());
        String[] digitChasis = new String[5];
        digitChasis[0] = "VE";
        digitChasis[1] = "4";
        digitChasis[2] = "T";
        digitChasis[3] = "W";
        digitChasis[4] = "77";
        String chasis = "";

        for( int i = 0; i != digitChasis.length; i++){
            int index = rand.nextInt(5);
            chasis = chasis + digitChasis[index];
        }

        return chasis;
    }
}
