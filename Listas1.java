/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas1;
import java.util.*; 

/**
 *
 * @author alemontano
 */
public class Listas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner (System.in); 
    }
class elemento {
    Scanner kb = new Scanner (System.in); 
    String nombre, prop; 
    int orbitasBohr; 
    double peso; 
    int numatom; 
    
    elemento(){
        this.nombre=setnombre(); 
        this.orbitasBohr=setorbita(); 
        this.peso=setpeso(); 
        this.numatom=setnumatom(); 
     }
    private String setnombre(){
        System.out.println("Escriba el nombre del elemento");
        String nom = kb.nextLine(); 
        return nom; 
    }
    private String prop(){
        System.out.println("Escriba las propiedades de su elemento");
        String prop = kb.nextLine(); 
        return prop; 
    } 
    private int setorbita(){
        System.out.println("Escriba el número de orbitas de Bohr");
        int orb = kb.nextInt(); 
        return orb; 

    }
    private double setpeso(){
        System.out.println("Escriba el número atómico");
        double num = kb.nextDouble(); 
        return num; 
    }
} 
    
   
    
}
