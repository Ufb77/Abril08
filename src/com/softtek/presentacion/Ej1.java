package com.softtek.presentacion;

import com.softtek.modelo.*;

public class Ej1 {

    public static void main(String[] args) {
        Animal a1 = new Perro();
        Animal a2 = new Pez();
        Animal a3 = new Pajaro();
        Animal a4 = new Gusano();
        Animal [] listaAnimales = {
                a1,
                a2,
                a3,
                a4
        };

        for (Animal animales: listaAnimales
             ) {
            System.out.println(animales.comer());
            System.out.println(animales.moverse());

        }





    }
}
