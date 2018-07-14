/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jnino
 */
public class ListaArrays {

    private final int TAMANO = 8;
    private List<String> arrayList;
   
    public ListaArrays() {
        this.arrayList = new ArrayList<String>(TAMANO);
    }

    public void insertElements() {
        for (int i = 0; i < TAMANO; i++) {
            this.arrayList.add(Integer.toString(i));
        }
        
    }

    public void printElements(ListaArrays listaArray) {
        Iterator <String> iterator = arrayList.iterator();
        
        while (iterator.hasNext()){
            System.out.println("Lista: " + iterator.next());
        }
     }

}
