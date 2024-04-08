package com.softtek.presentacion;

import com.softtek.modelo.Coche;
import com.softtek.modelo.Conductor;
import org.w3c.dom.ls.LSOutput;

public class Ej3 {
    public static void main(String[] args) {
        Coche coche1 = new Coche(3);
        Conductor c1 = new Conductor(coche1);


        System.out.println(c1.conducir());
        System.out.println(coche1.moverse());
    }




}
