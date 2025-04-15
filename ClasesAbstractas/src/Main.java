import claabstractas.Circulo;
import claabstractas.Cuadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1) Calcular el area de un cuadrado\n2) Calcular el area de un circulo\n> ");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingrese el valor del lado del cuadrado para calcular su area: ");
                double lado = sc.nextDouble();
                Cuadrado cuadrado1 = new Cuadrado(lado);
                System.out.println("El area del cuadrado es: " + cuadrado1.calcularArea());
            break;

            case 2:
                System.out.print("Ingrese el valor del radio del circulo para calcular su area: ");
                double radio = sc.nextDouble();
                Circulo circulo1 = new Circulo(radio);
                System.out.println("El area de su circulo es: " + circulo1.calcularArea());
            break;

        }
    }
}