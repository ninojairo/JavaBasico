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
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Lista Simple
        ListaSimple listaSimple = new ListaSimple();
        Nodo nodo =new Nodo();
        for (int i = 0; i < 10; i++) {
            nodo.setDato(Integer.toString(i));
            listaSimple.agregarNodo(nodo);
            
            listaSimple.imprimirLista();
        
        
            
        }
        
        listaSimple.imprimirLista();
        
        
                
        
        
    }
    
}
