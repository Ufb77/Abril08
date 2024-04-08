package com.softtek.modelo;

public class Conductor {

    private lVehiculo vehiculo;

    public Conductor() {
    }

    public Conductor(lVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String conducir(){
        return "El conductor conduce" + this.vehiculo.getClass();
    }

}
