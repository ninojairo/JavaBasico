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
public class ListaSimple {

    Nodo primerElemento;

    public ListaSimple() {
        this.primerElemento = null;
    }

    public void agregarNodo(Object dato) throws TipoDatoException{

        /*try {
            Nodo nuevoElemento = new Nodo(dato);
            if (dato instanceof String) {
                if (this.primerElemento == null) {
                    this.primerElemento = nuevoElemento;

                } else {
                    nuevoElemento.siguiente = primerElemento;
                    primerElemento = nuevoElemento;
                }

            } else {
                throw new TipoDatoException("Dato no es string");

            }
        } catch (TipoDatoException tde) {
            System.out.println("Error");
        }*/
        
            Nodo nuevoElemento = new Nodo(dato);
            if (dato instanceof String) {
                if (this.primerElemento == null) {
                    this.primerElemento = nuevoElemento;

                } else {
                    nuevoElemento.siguiente = primerElemento;
                    primerElemento = nuevoElemento;
                }

            } else {
                throw new TipoDatoException("Dato no es string");
            }
        
        
        
        

    }

    public void getElementosLista() {

        Nodo elementoAuxiliar = primerElemento;

        while (elementoAuxiliar != null) {
            System.out.println("Elemento: " + elementoAuxiliar.dato);
            elementoAuxiliar = elementoAuxiliar.getSiguiente();
        }

    }

    /*for (int i = 0; i < tamanoLista; i++) {
            getElemento(i);
            System.out.println("Lista: " + primerNodo.getDato());
        }*/
}

/*public void imprimirLista() {
        System.out.println("Lista: " + primerNodo.getDato());
    }

    public void agregarElementoEnPosicion(int pos, Object dato) {
    }*/
