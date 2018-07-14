/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.List;


/**
 *
 * @author jnino
 */
public class JavaBasico {
    
    private ListaArrays listaArray;
    
    
    public void simpleList(){
        ListaSimple listaSimple = new ListaSimple();
        for (int i = 0; i < 10; i++) {
            listaSimple.agregarNodo(Integer.toString(i));
        }
        listaSimple.getElementosLista();
    }
    
    public void crearArrayList(){
        this.listaArray = new ListaArrays();
        this.listaArray.insertElements();
    }
    
    public void sortDescList(){
        this.listaArray.sortDescList();
        this.listaArray.printElements();
    }
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JavaBasico javaBasico = new JavaBasico();
        //System.out.println("*** Simple List ****\n");
        //javaBasico.simpleList();
        System.out.println("\n*** ArrayList ****\n");
        javaBasico.crearArrayList();
        System.out.println("\n*** ArrayList Order Desc ****\n");
        javaBasico.sortDescList();
        
        

        
    }

}
