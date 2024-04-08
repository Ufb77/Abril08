package com.softtek.modelo;

public class Avion extends Vehiculo implements  ObjetoVolador{
    @Override
    public String despegar() {
        return this.getClass() + " despega";
    }

    @Override
    public String aterrizar() {
        return this.getClass() + " aterriza";
    }

    @Override
    public String volar() {
        return this.getClass() + " vuela";
    }
}
