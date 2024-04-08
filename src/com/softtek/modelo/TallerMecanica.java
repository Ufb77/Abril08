package com.softtek.modelo;

public class TallerMecanica implements lTaller {

    public TallerMecanica() {
    }

    @Override
    public String reparar(CocheEj4 coche) {
        return "El coche con matrícula " + coche.getMatricula() +
               " y modelo " + coche.getModelo() + " ha sido reparado";


    }
}
