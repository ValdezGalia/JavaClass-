import java.util.LinkedList;

public class ListaLibros {
    /*
    *   CRUD
    * */

    private LinkedList<Libro> libros;

    public ListaLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }
}
