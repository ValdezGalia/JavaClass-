package clases;

public class BombilloInteligente extends Dispositivo{

    public BombilloInteligente(boolean encender, boolean apagar) {
        super(encender, apagar);
    }

    @Override
    public String config() {
        return "Se ha ajustado la intensidad de la luz";
    }
}
