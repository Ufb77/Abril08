package com.softtek.presentacion;

import com.softtek.modelo.AccesoDesarrollo;
import com.softtek.modelo.AccesoProduccion;
import com.softtek.modelo.Cliente;
import com.softtek.modelo.ClienteDao;

public class Ej6 {

    public static void main(String[] args) {
        AccesoDesarrollo ad = new AccesoDesarrollo();
        AccesoProduccion ap = new AccesoProduccion();
        Cliente c1 = new Cliente();
        ClienteDao cd1 = new ClienteDao(ad);
        ClienteDao cd2 = new ClienteDao(ap);

        System.out.println(cd1.insertar(c1));
        System.out.println(cd2.insertar(c1));
    }


}
