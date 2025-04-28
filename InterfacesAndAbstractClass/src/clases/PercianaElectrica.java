package clases;

public class PercianaElectrica extends Dispositivo{
    public PercianaElectrica(boolean encender, boolean apagar) {
        super(encender, apagar);
    }

    @Override
    public String config() {
        return "Las percianas se han movido a su posicion intermedia";
    }
}
