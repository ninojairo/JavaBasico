/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jnino
 */
public class ListaArrays {

    private final int TAMANO = 20;
    private List <String> listaNumeros;
    //private Iterator <String> iterator;
    
   
    public ListaArrays() {
        this.listaNumeros = new ArrayList();
        //iterator = listaNumeros.iterator();
    }

    public void insertElements() {
        for (int i = 0; i < TAMANO; i++) {
            this.listaNumeros.add(Integer.toString(i));
        }
    }

    public void sortDescList(){
        Collections.sort(listaNumeros, Collections.reverseOrder());
        System.out.println("Ordenado");
    }
    public void printElements() {
        for(String s: listaNumeros){
            System.out.println("Element: " +s);
        }
        

    }
    
}
