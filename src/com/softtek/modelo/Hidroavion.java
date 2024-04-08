package com.softtek.modelo;

public class Hidroavion extends Avion implements Nautico{
    @Override
    public String atracar() {
        return this.getClass() + " atraca";
    }

    @Override
    public String navegar() {
        return this.getClass() + " navega";
    }
}
