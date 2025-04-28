package clases;

import clases.interfaces.IDispositivo;

import java.util.Random;

public abstract class Dispositivo implements IDispositivo {
    private boolean encender = IDispositivo.encender;
    private boolean apagar = IDispositivo.apagar;
    private final String serialDispositivo = generateSerial() + "-" + generateSerial() + "-" + generateSerial();
    private final boolean estado_general = true;

    public Dispositivo(boolean encender, boolean apagar) {
        this.encender = encender;
        this.apagar = apagar;
    }

    public boolean isEncender() {
        return encender;
    }

    public void setEncender(boolean encender) {
        this.encender = encender;
        this.apagar = !encender;
    }

    public boolean isApagar() {
        return apagar;
    }

    public void setApagar(boolean apagar) {
        this.apagar = apagar;
        this.encender = !apagar;
    }

    public String getSerialDispositivo() {
        return serialDispositivo;
    }

    public boolean isEstado_general() {
        return estado_general;
    }

    private int generateSerial(){
        Random rd = new Random();
        return rd.nextInt(1000);
    }
}
