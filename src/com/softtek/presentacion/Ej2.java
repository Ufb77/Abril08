package com.softtek.presentacion;

import com.softtek.modelo.*;

public class Ej2 {
    public static void main(String[] args) {
        Barcaza b1 = new Barcaza();
        Avion a1 = new Avion();
        Hidroavion h1 = new Hidroavion();
        Helicoptero heli1 = new Helicoptero();


        System.out.println(b1.navegar());
        System.out.println(b1.atracar());

        System.out.println(a1.aterrizar());
        System.out.println(a1.despegar());
        System.out.println(a1.volar());

        System.out.println(h1.atracar());
        System.out.println(h1.navegar());

    }
}
