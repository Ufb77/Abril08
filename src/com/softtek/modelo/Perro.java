package com.softtek.modelo;

public class Perro extends Animal{
    @Override
    public String comer() {
        return "el perro come";
    }

    @Override
    public String moverse() {
        return "el perro se mueve";
    }
}
