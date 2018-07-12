/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.ArrayList;

/**
 *
 * @author jnino
 */
public class ListaArrays {

    private final int TAMANO = 8;
    private ArrayList<String> arrayList;
    private ArrayList<String> arrayListDoble;
    private int size=0;
    

    public ListaArrays() {
        this.arrayList = new ArrayList<String>(TAMANO);
    }

    public void insertElements() {
        int j=0;
        for (int i = 0; i < TAMANO; i++) {
            this.arrayList.add(Integer.toString(i));
            
            if (this.arrayList.size()>=TAMANO/2) {
                ArrayList<String> arrayListDoble = new ArrayList<String>(TAMANO*2);
                arrayListDoble.addAll(arrayList);
                System.out.println("ListaS: " + arrayList.size());
                System.out.println("Lista Doble: " + arrayListDoble);
        
        
            } 
            
        }
        System.out.println("Lista: " + arrayList);
        System.out.println("Lista Doble: " + arrayListDoble);
        
    }

    public void printElements(ArrayList arrayList) {
        System.out.println("Lista: " + arrayList);

    }

}
