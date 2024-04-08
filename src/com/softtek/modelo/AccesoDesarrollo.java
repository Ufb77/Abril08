package com.softtek.modelo;

public class AccesoDesarrollo implements lDAO{
    @Override
    public String insertar(Cliente c1) {
        return "El cliente " + c1.getClass() + " tiene" +
                " acceso a desarrollo";
    }
}
