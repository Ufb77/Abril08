package com.softtek.modelo;

public class ClienteDao {

    lDAO conexion;

    public ClienteDao() {
    }

    public ClienteDao(lDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }
}
