package com.softtek.modelo;

public class SeguroCoche {

    private lTaller taller;
    private String aseguradora;

    public SeguroCoche() {
    }

    public SeguroCoche(lTaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public String reparar(CocheEj4 coche){
        return taller.reparar(coche);
    }
}
