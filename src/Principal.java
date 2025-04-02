import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Autor autor1 = new Autor("Miguel de Cervantes", "Española");
        Autor autor2 = new Autor("Juan del Encina", "Salamanca");

        Libro libro2 = new Libro("Entremeses de Cervantes", 1615, autor1);
        Libro libro1 = new Libro("la de Plácida y Vitoriano", 1513, autor2);

//        LinkedList<Libro> libros = new LinkedList<>();
//        libros.add(libro1);
//        libros.add(libro2);

        LinkedList<Libro> listaDeLibros = new LinkedList<>();
        ListaLibros listaLibros = new ListaLibros(listaDeLibros);
        listaLibros.Agregar(new Libro("Popeye", 2005, new Autor("Popeye", "Alemana")));
        listaLibros.Agregar(libro1);
        listaLibros.Agregar(libro2);

        listaLibros.ListarLibros();
        listaLibros.Actualizar(0, libro1);

        listaLibros.ListarLibros();


    }
}