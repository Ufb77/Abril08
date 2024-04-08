package com.softtek.modelo;

public class Coche implements lVehiculo {

    private int deposito;

    public Coche() {
    }

    public Coche(int deposito) {
        this.deposito = deposito;

    }

    @Override
    public String moverse() {
        String respuesta = "";

        if(deposito > 0){
            respuesta = this.getClass() + " se mueve";
        }else{
            respuesta = this.getClass() + " no se mueve";
        }
        return respuesta;
    }
}
