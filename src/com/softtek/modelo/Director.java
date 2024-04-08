package com.softtek.modelo;

public class Director implements Empleado {
    private lInforme informe;

    public Director() {
    }

    public Director(lInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Director ha obtenido tareas";
    }

    @Override
    public String getInforme() {
        return "Director ha obtenido" + this.informe.getInforme();
    }
}
