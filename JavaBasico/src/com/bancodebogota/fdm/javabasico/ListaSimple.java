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
public class ListaSimple<T> {

    Nodo primerElemento;

    public ListaSimple() {
        this.primerElemento = null;
    }
    
    public void agregarNodo(String dato) {
        
        Nodo nuevoElemento = new Nodo(dato);
        if (this.primerElemento==null) {
            this.primerElemento = nuevoElemento;
            
        } else {
            nuevoElemento.siguiente=primerElemento;
            primerElemento = nuevoElemento;
            
        }
    }
    
    public void getElementosLista() {

        Nodo elementoAuxiliar = primerElemento;
        
        while (elementoAuxiliar !=null){
            System.out.println("Elemento: "+ elementoAuxiliar.dato);
            elementoAuxiliar = elementoAuxiliar.getSiguiente();
        }
        
    }
}

    

