package edu.ucab.poo;

public class SeniorProgramador extends Programador {
    /*
    *   TODO: Atributos
    * */
    private String equipoAsignado; // "Frontend", "Backend", "DevOps"
    private int aniosExperiencia;

    /*
     *   TODO: Constructor
     * */

    public SeniorProgramador(String nombre, double salario, String lenguajeProgramacion, boolean trabajaRemoto, String equipoAsignado, int aniosExperiencia){
        super(nombre, salario, lenguajeProgramacion, trabajaRemoto);
        this.equipoAsignado = equipoAsignado;
        this.aniosExperiencia = aniosExperiencia;
    }

    /*
     *   TODO: Metodos
     * */

    public void liderarSprint(){
        System.out.println("El Senior lidera el sprint del equipo " + this.equipoAsignado);
    }

    public void revisarCodigo(){
        System.out.println("Revisando codigo del equipo...");
    }

    public String getEquipoAsignado() {
        return equipoAsignado;
    }

    public void setEquipoAsignado(String equipoAsignado) {
        this.equipoAsignado = equipoAsignado;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
