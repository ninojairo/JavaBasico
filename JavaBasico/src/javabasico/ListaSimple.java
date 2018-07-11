/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

/**
 *
 * @author jnino
 */
public class ListaSimple {

    Nodo primerNodo;
    Nodo siguienteNodo;
    Nodo nodo;
    int tamanoLista = 0;

    public int getTamano() {
        return tamanoLista;
    }

    public Object getElemento(int pos) {

        if (pos == 0) {
            return primerNodo.getDato();

        } else {
            Nodo auxiliar = primerNodo;
            for (int i = 0; i < pos; i++) {
                auxiliar.getSiguiente();
            }
            return auxiliar.getDato();
        }
    }

    public Nodo getPrimerElemento() {
        Nodo nodo = new Nodo();
        return nodo;
    }

    public void agregarNodo(Nodo nodo) {
        if (primerNodo == null) {
            primerNodo = nodo;

        } else {
            siguienteNodo = nodo;
        }
        tamanoLista++;

    }

    public void getElementosLista() {

        for (int i = 0; i < tamanoLista; i++) {
            getElemento(i);
            System.out.println("Lista: " + primerNodo.getDato());
        }

    }

    public void imprimirLista() {
        System.out.println("Lista: " + primerNodo.getDato());
    }

    public void agregarElementoEnPosicion(int pos, Object dato) {
    }

}
