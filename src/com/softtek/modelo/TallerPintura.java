package com.softtek.modelo;

public class TallerPintura implements lTaller {

    public TallerPintura() {
    }

    @Override
    public String reparar(CocheEj4 coche) {
        return "El coche con matrícula " + coche.getMatricula() +
                " y modelo " + coche.getModelo() + " ha sido pintado";
    }
}
