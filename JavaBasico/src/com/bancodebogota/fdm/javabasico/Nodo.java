/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

/**
 *
 * @author jnino
 */
public class Nodo {

    Nodo siguiente;
    String dato;

    public Nodo(String nuevoDato) {
        this.dato = nuevoDato;
        this.siguiente = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Object getDato() {
        return dato;
    }

}
