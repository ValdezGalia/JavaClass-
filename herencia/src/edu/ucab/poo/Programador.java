package edu.ucab.poo;

public class Programador extends Empleado{
    private String lenguajeProgramacion;
    private boolean trabajaRemoto;

    public Programador(String nombre, double salario, String lenguajeProgramacion, boolean trabajaRemoto) {
        super(nombre, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.trabajaRemoto = trabajaRemoto;
    }

    public void codificar(){
        System.out.println("El programador esta codificando en " + this.lenguajeProgramacion);
    }

    public void asistirDaily(){
        // imprime si el programador asistió a la reunión
        //“daily” según si trabaja remoto

    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public boolean isTrabajaRemoto() {
        return trabajaRemoto;
    }

    public void setTrabajaRemoto(boolean trabajaRemoto) {
        this.trabajaRemoto = trabajaRemoto;
    }
}
