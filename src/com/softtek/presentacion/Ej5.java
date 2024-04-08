package com.softtek.presentacion;

import com.softtek.modelo.*;

public class Ej5 {

    public static void main(String[] args) {

        InformeTrimestre1 informe1 = new InformeTrimestre1();
        InformeTrimestre2 informe2 = new InformeTrimestre2();

        Jefe j1 = new Jefe(informe1);
        Director d1 = new Director(informe2);
        Secretario s1 = new Secretario(informe1, "Softtek","@softtek.com");

        System.out.println(j1.getTareas() +"\n" + j1.getInforme());
        System.out.println(d1.getTareas() +"\n" + d1.getInforme());
        System.out.println(s1.getTareas() +"\n" + s1.getInforme());

        s1.setInforme(informe2);
        System.out.println(s1.getInforme());
    }


}
