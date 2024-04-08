package com.softtek.modelo;

public abstract class Animal {

    public abstract String comer();
    public abstract String moverse();

    //¿Qué ocurre si no implemento todos los métodos?
    //Hay un error dado que se deben implementar

    //¿Puedo crear instancias igualmente?
    //De animal no, del resto sí, pero solo con los métodos
    //ya desarrollados

    //¿Puedo modificar parte de la definición de los métodos abstractos?
    //La definición sí, pero la cabecera no debe cambiar

    //¿Puedo utilizar polimorfismo?
    //Sí

    //¿También son abstractas estas clases?
    //No, no lo son
}
