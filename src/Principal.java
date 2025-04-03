import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static boolean AutoresIsEmpty(LinkedList<Autor> autores){
        return autores.isEmpty();
    }

    public static void menu(){
        System.out.println(GREEN + "1. " + RESET +  "Agregar Autor");
        System.out.println(GREEN + "2. " + RESET +  "Agregar Libro");
        System.out.println(GREEN + "3. " + RESET +  "Mostrar Libros agregados");
        System.out.println(GREEN + "4. " + RESET +  "Autores disponibles");
        System.out.println(GREEN + "5. " + RESET +  "Salir");
        System.out.print("> ");
    }

    public static int numberInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String Input(String mensaje){
        System.out.print(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void main(String[] args) {
        boolean ejecutando = true;
        LinkedList<Autor> autores = new LinkedList<>();
        LinkedList<Libro> listaDeLibros = new LinkedList<>();
        ListaLibros listaLibros = new ListaLibros(listaDeLibros);

        while(ejecutando){
            menu();
            int opcion = numberInput();

            switch (opcion){
                case 1:
                    System.out.println("Nuevo Autor");
                    String nombreCompleto = Input("Ingrese el nombre del Autor: ");
                    String nacionalidad = Input("Ingrese el nacionalidad del Autor: ");
                    autores.add(new Autor(nombreCompleto, nacionalidad));
                    System.out.println("Autor agregado correctamente!");
                    Input("Presione enter para continuar: ");
                break;

                case 2:
                    System.out.println("Nuevo Libro");
                    if(autores.isEmpty()) {
                        System.out.println("Tienes que tener autores para poder agregar un libro!");
                        break;
                    };

                    String titulo = Input("Ingrese el titulo del libro: ");
                    System.out.print("Ingrese el año de publicacion del libro: ");

                    int anioPublicacion = numberInput();
                    int contador = 0;

                    System.out.println(GREEN + "Autores disponibles: " + RESET);


                    for( Autor autor : autores){
                        System.out.println(GREEN + contador + ". " + RESET + autor.getNombre_completo());
                        contador++;
                    }

                    System.out.print("> ");
                    int indexAutor = numberInput();

                    Autor autorSeleccionado = autores.get(indexAutor);
                    listaLibros.Agregar(new Libro(titulo, anioPublicacion, autorSeleccionado));
                break;

                case 3:
                    listaLibros.MostrarLibros();
                    Input("Presiona enter para continuar: ");
                break;

                case 4:
                    if(AutoresIsEmpty(autores)){
                        System.out.println("No hay autores");
                        break;
                    }
                    contador = 0;
                    System.out.println(GREEN + "Autores disponibles: " + RESET);
                    for( Autor autor : autores ){
                        System.out.println(GREEN + contador + ". " + RESET + autor.getNombre_completo());
                        contador++;
                    }
                    Input("Presione enter...");
                break;

                case 5:
                    ejecutando = false;
                    System.out.println("Vuelva pronto!");
                break;

            }
        }



//        Autor autor1 = new Autor("Miguel de Cervantes", "Española");
//        Autor autor2 = new Autor("Juan del Encina", "Salamanca");
//
//        Libro libro2 = new Libro("Entremeses de Cervantes", 1615, autor1);
//        Libro libro1 = new Libro("la de Plácida y Vitoriano", 1513, autor2);
//
////        LinkedList<Libro> libros = new LinkedList<>();
////        libros.add(libro1);
////        libros.add(libro2);
//
//        listaLibros.Agregar(new Libro("Popeye", 2005, new Autor("Popeye", "Alemana")));
//        listaLibros.Agregar(libro1);
//        listaLibros.Agregar(libro2);
//
//        listaLibros.ListarLibros();
//        listaLibros.Actualizar(0, libro1);
//
//        listaLibros.ListarLibros();


    }
}