package com.softtek.modelo;

public class Barcaza extends Vehiculo implements Nautico{
    @Override
    public String atracar() {
        return this.getClass() + " atraca";
    }

    @Override
    public String navegar() {
        return this.getClass() + " navega";
    }
}
