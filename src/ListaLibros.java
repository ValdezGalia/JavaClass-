import java.util.LinkedList;

public class ListaLibros {
    /*
     *   CRUD
     * */

    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    private LinkedList<Libro> libros = null;

    public ListaLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    /*
    *   Retorna el puntero de tipo Libro
    * */
    public LinkedList<Libro> getLibros() {
        return libros;
    }

    /*
    *   Agrega un elemento al puntero de tipo Libro
    * */
    public void Agregar(Libro libro) {
        this.libros.add(libro);
    }

    /*
    *   Muestra los libros sin la cantidad total de los mismos
    * */
    public void MostrarLibros() {
        int contador = 1;
        for (Libro libro : this.libros) {
            System.out.println(GREEN + "Libro #" + RESET + contador + " - " + GREEN + "Escrito por: " + RESET + libro.getAutor().getNombre_completo());
            System.out.println("Titulo del libro: " + libro.getTitulo());
            System.out.println("Año de publicación: " + libro.getAnio_publicacion());
            System.out.println();
            contador++;
        }
    }

    /*
    *   Imprime en pantalla la lista de libros disponibles y los lista de forma enumerada
    * */
    public void ListarLibros(){
        int contador = 1;
        System.out.println(GREEN + "Libros disponibles: " + RESET + this.libros.size());
        for (Libro libro: this.libros){
            System.out.println(GREEN + "Libro #" + RESET + contador + " - " + GREEN + "Titulo: " + RESET +  libro.getTitulo());
            contador++;
        }
    }

    /*
    *   Buscar un elemento de lista libro por el titulo del libro y returna el libro encontrado
    * */
    public Libro Buscar(String titulo){
        Libro libroEncontrado = null;
        for( Libro libro: this.libros ){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                libroEncontrado = libro;
            }
        }

        return libroEncontrado;
    }

    /*
    *   Actualiza los datos de un elemento en el puntero de tipo Libro
    * */
    public void Actualizar(int index, Libro data_libro){
        try {
            Libro libroEncontrado = this.libros.get(index);
            if( libroEncontrado == null ) return;
            this.libros.set(index, data_libro);
        } catch (Exception e) {
            System.out.println("El indice del libro: " + index +", no existe dentro de la lista");
            System.out.println(e.getLocalizedMessage());
        }
    }


    /*
    *   Eliminar un elemento del puntero por el nombre del titulo del libro
    * */
    public void Eliminar(String titulo){
        for (Libro libro: this.libros){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                this.libros.remove(libro);
            }
        }
    }

    /*
     *   Eliminar un elemento del puntero por el indice del mismo partiendo de 0
     * */
    public void Eliminar(int index){
        Libro LibroEncontrado = this.libros.get(index);
        this.libros.remove(LibroEncontrado);
    }
}
