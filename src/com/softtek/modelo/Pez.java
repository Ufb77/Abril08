package com.softtek.modelo;

public class Pez extends Animal{

    @Override
    public String comer() {
        return "el pez come";
    }

    @Override
    public String moverse() {
        return "el pez se mueve";
    }
}
