package com.softtek.modelo;

public class Jefe implements  Empleado{
    private lInforme informe;

    public Jefe() {
    }

    public Jefe(lInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "El jefe ha obtenido tareas";
    }

    @Override
    public String getInforme() {
        return "Jefe ha obtenido" + this.informe.getInforme();
    }
}
