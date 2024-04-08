package com.softtek.presentacion;

import com.softtek.modelo.CocheEj4;
import com.softtek.modelo.SeguroCoche;
import com.softtek.modelo.TallerMecanica;
import com.softtek.modelo.TallerPintura;

public class Ej4 {

    public static void main(String[] args) {
        CocheEj4 c1 = new CocheEj4("aaa", "Scenic");
        TallerMecanica tm1 = new TallerMecanica();
        TallerPintura tp1 = new TallerPintura();

        SeguroCoche sc1 = new SeguroCoche(tm1, "bbb");
        SeguroCoche sc2 = new SeguroCoche(tp1, "ccc");
        System.out.println(sc1.reparar(c1));
        System.out.println(sc2.reparar(c1));
    }


}
