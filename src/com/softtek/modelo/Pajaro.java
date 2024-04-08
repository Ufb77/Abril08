package com.softtek.modelo;

public class Pajaro extends Animal{
    @Override
    public String comer() {
        return "el pájaro come";
    }

    @Override
    public String moverse() {
        return "el pájaro se mueve";
    }
}
