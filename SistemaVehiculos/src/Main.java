import edu.ucab.poo.Electrico;
import edu.ucab.poo.Vehiculo;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static boolean aireAcondicionado(int opcion){
        return opcion == 1 ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = sc.nextLine();
        System.out.print("Ingrese el modelo del vehiculo: ");
        String modelo = sc.nextLine();
        System.out.print("Ingresa el año del vehiculo: ");
        int anio = sc.nextInt();
        System.out.print("Ingresa el numero de puertas: ");
        int numeroPuertas = sc.nextInt();
        System.out.print("Tiene aire acondicionado\n1) Si\n2) No\n> ");
        boolean tieneAireAcondicionado = aireAcondicionado(sc.nextInt());
        System.out.print("Indique el porcentaje del vehiculo: ");
        double porcentajeBateria = sc.nextDouble();

        Electrico electrico = new Electrico(marca, modelo, anio, numeroPuertas, tieneAireAcondicionado, porcentajeBateria, 60);
        electrico.registrarVehiculo();
        electrico.mostrarDatos();
        electrico.calcularImpuesto();
        electrico.encenderMotor();
        electrico.verificarComodidad();
        electrico.cargarBateria();
        electrico.mostrarAutonomia();
    }
}