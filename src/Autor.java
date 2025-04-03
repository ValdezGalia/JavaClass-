import java.util.LinkedList;

public class Autor {
    private String nombre_completo;
    private String nacionalidad;

    public Autor(String nombre_completo, String nacionalidad) {
        this.nombre_completo = nombre_completo;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
