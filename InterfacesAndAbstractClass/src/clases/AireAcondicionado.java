package clases;

public class AireAcondicionado extends Dispositivo{

    public AireAcondicionado(boolean encender, boolean apagar) {
        super(encender, apagar);
    }

    @Override
    public String config() {
        return "La temperatura del aire acondicionado se ha ajustado correctamente";
    }
}
