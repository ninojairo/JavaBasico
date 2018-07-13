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
public class JavaBasico {
    
    
    public void SimpleList(){
        ListaSimple listaSimple = new ListaSimple();
        for (int i = 0; i < 10; i++) {
            //listaSimple.agregarNodo(Integer.toString(i));
            try {
                listaSimple.agregarNodo(i);
            } catch (TipoDatoException tde) {
                System.out.println("Error Tipo Dato");
            }
            
        }
        listaSimple.getElementosLista();
    }
    public void ArrayList(){
        ListaArrays listaArrays = new ListaArrays();
        listaArrays.insertElements();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JavaBasico javaBasico = new JavaBasico();
        System.out.println("*** Simple List ****\n");
        javaBasico.SimpleList();
        //System.out.println("\n*** ArrayList ****\n");
        javaBasico.ArrayList();

        
    }

}
