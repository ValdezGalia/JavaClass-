import edu.ucab.poo.SeniorProgramador;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static String input(String tipoNombre){
        Scanner sc = new Scanner(System.in);
        System.out.print(tipoNombre);
        String input = sc.nextLine();
        return input;
    }

    public static double inputDouble(String tipoNombre){
        Scanner sc = new Scanner(System.in);
        System.out.print(tipoNombre);
        double inputDouble = sc.nextDouble();
        return inputDouble;
    }

    public static int inputInt(String tipoNombre){
        Scanner sc = new Scanner(System.in);
        System.out.print(tipoNombre);
        int inputInt = sc.nextInt();
        return inputInt;
    }

    public static boolean remoto(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Trabaja de forma remota?\n1) Si\n2) No\n>");
        int opcion = sc.nextInt();
        return opcion == 1 ? true : false;
    }

    public static String equipo(){
        LinkedList<String> equipos = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        equipos.add("Frontend");
        equipos.add("Backend");
        equipos.add("DevOps");

        System.out.println("Equipos:");
        int contador = 0;

        for( String equipo : equipos ){
            System.out.println(contador + ") " + equipo);
            contador++;
        }
        System.out.print("> ");
        int opcion = sc.nextInt();

        String equipoElegido = equipos.get(opcion);
        return equipoElegido;
    }

    public static void main(String[] args) {
        String nombre = input("Nombre empleado: ");
        String lenguajeProgramacion = input("Lenguaje de programacion: ");
        String equipo = equipo();
        double salario = inputDouble("Salario del empleado: ");
        boolean trabajaRemoto = remoto();
        int aniosExperiencia = inputInt("Años de experiencia: ");


        SeniorProgramador senior = new SeniorProgramador(nombre, salario, lenguajeProgramacion, trabajaRemoto, equipo, aniosExperiencia);

        System.out.println("========== Datos del Senior ==========");
        senior.registrarIngreso();
        senior.mostrarInformacion();
        senior.calcularBonificacion();
        senior.liderarSprint();
        senior.revisarCodigo();
        senior.codificar();
        senior.asistirDaily();


    }

}