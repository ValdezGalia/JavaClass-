import java.util.LinkedList;

public class Libro{
    private String titulo;
    private int anio_publicacion;
    private Autor autor;

    public Libro(String titulo, int anio_publicacion, Autor autor) {
        this.titulo = titulo;
        this.anio_publicacion = anio_publicacion;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
