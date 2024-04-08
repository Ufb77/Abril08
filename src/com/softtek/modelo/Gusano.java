package com.softtek.modelo;

public class Gusano extends Animal{
    @Override
    public String comer() {
        return "el gusano come";
    }

    @Override
    public String moverse() {
        return "el gusano se mueve";
    }
}
