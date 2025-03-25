package umg.edu.progra.listas;

import doblementeEnlazada.DoblementeEnlazada;

/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        /*Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);
        
        lista.visualizar();        
        
        
        System.out.println("\n");
        System.out.println("primero: " + lista.leerPrimero());
        
        
        
        lista.eliminar(3);
        System.out.println("lista: " + lista);
        
        System.out.println("\n");
        
        Nodo dato = lista.buscarLista(4);  
        System.out.println("dato: " + dato);
        
        lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);
        
        dato = lista.buscarLista(5);        
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);
        
        System.out.println("lista " + lista);
        
        lista.visualizar();
        
        
        /**
         * Ejercicio 1: Ordernar la lista de forma ascendente
         * Ejercicio 2: Unir dos listas enlazadas
         * Ejercicio 3: Separa numeros pares e impares en dos listas enlazadas diferentes
         
        

        //Ejercicio 1
        

        System.out.println("Lista antes de ordenar:");
        lista.visualizar();

        lista.ordenarLista();

        System.out.println("\nLista después de ordenar:");
        lista.visualizar();*/
    	
    	//Metodo para contar el tamano de la lista
    	
    	DoblementeEnlazada lista = new DoblementeEnlazada();
    	
    	lista.insertAtEnd(0);
    	lista.insertAtEnd(1);
    	lista.insertAtEnd(2);
    	lista.insertAtEnd(3);
    	lista.insertAtEnd(4);
    	lista.insertAtEnd(5);
    	
    	lista.displayForward();
    	
    	System.out.println("El tamano de la lista es de: " + lista.tamano());
    	
    	lista.delete(0);
    	lista.delete(5);
    	
    	System.out.println("El tamano de la lista es de: " + lista.tamano());
    	
    	//Metodo para insertar en un lugar deseado
    	
    	lista.insertarEnMedio(78,2);
    	
    	lista.displayForward();
    	
    	System.out.println("El tamano de la lista es de: " + lista.tamano());
    	
    	//Metodo para invertir la lista
    	
    	lista.revertir();
    	lista.displayForward();
        
    }

}
