package edu.ucab.poo;
import java.util.Random;

public class Empleado {
    private final String idEmpleado = generarID(6) + "";
    private String nombre;
    private double salario;

    public final void registrarIngreso(){
        System.out.println("Empleado registrado mediante huella digital");
    }

    public void mostrarInformacion(){
        System.out.println("Id Empleado: " + this.idEmpleado + " - Nombre empleado: " + this.nombre);
    }

    public void calcularBonificacion(){
        // Imprime bonificacion general del 5% del salario
        double bonificacion = this.salario * 0.05;
        System.out.println("Bonificacion general del 5% del salario: " + bonificacion + "$");
    }

    private int generarID(int cantNumeros){
        return (int) (Math.random() * cantNumeros) + 1;
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
