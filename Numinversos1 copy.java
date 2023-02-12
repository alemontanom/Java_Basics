/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numinversos;
import javax.swing.JOptionPane;

/**
 * Alejandra Montaño Murrieta 
 * A01024946
 * Aprender el uso de arreglos unidimensionales, con vector de entrada para imprimir y reacomodar en orden inverso los números que ingresa el usuario
 * @author alemontano
 */
public class Numinversos1 {

    /** Declaración de variables globales
     * 
     * @param args
     */
    
    
    public static void main(String[] args) {
        // Declaramos variables locales
        int i, count, a; 
        int ent[] = new int [20]; //arreglo unidimensional->guarda información del mismo tipo (en este caso tipo int). El "[20]" limita que solo se puedan meter hasta 20 números
        double b; 
        count = Integer.parseInt(JOptionPane.showInputDialog("Cantidad = ")); 
        for (i=0;i<=count-1;i++) { //condición inicial (establece el valor inicial de i)-> condición final-> paso (lo que se hace mientras i quepa en las condiciones)-- se separan con ;
            ent[i] = Integer.parseInt(JOptionPane.showInputDialog("Número " + i + " = "));
            b = ent[i]%2; //modulo del número ingresado para ver si es par
            if (b!=0) { //Si no hay residuo se imprime
                 System.out.print(ent[i] + " "); //imprime con un espacio 
                 
            }
        }
        System.out.print("\nEl arreglo invertido es: \n"); 
        for (i=count-1;i>=0;i--) {//lo mismo pero al revés para que vaya de regreso
            b = ent[i]%2; 
            if(b!=0) { //Si no hay residuo se imprime
                 System.out.print(ent[i] + " "); //imprime con un espacio 
                 
            }
        }
        System.out.print("\nNos vemos ");
        
        
    }
}

