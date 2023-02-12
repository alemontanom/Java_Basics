/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package retoclase;
import java.util.Scanner;

/**
 *
 * @author alemontano
 * Alejandra Montaño Murrieta 
 * A01024946
 * El programa deberá quitarle los espacios a un enunciado e imprimirlo e imprimir el número Ascii del enunciado (los números ascii de cada caracter sumados)
 */
public class RetoClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entrada; //enunciado que dará el usuario 
        char car [] = new char [300]; //vector de chars para que guarde por separado cada caracter del string 
        int count, suma = 0, i; //count sirve para el for, para saber cuantos caracteres tiene el string, suma sirve para ir sumando los numeros ascii e i es el marcador del for
        Scanner kb = new Scanner (System.in); // Declara el teclado como un objeto de entrada
        System.out.println("Ingrese un enunciado"); // le pide al usuario su enunciado
        entrada = kb.nextLine(); //el enunciado se saca del teclado
        count = entrada.length(); //cuenta el numero de caracteres en el string
        for (i=0;i<count;i++){ //i empieza en cero y se le suma uno mientras que sea menor al numero de caracteres en el string 
            car[i] = entrada.charAt(i); // toma el caracter del string en posición i y lo convierte a char
            int castAscii = (int) car[i]; //saca el valor ascii del caracter char en posición i
            suma = suma + castAscii; //va sumando cada valor ascii 
        }
        entrada = entrada.replaceAll("\\s",""); //le quita los espacios al string 
        System.out.println("Su enunciado sin espacios es " + entrada); //imprime el enunciado sin espacios
        System.out.println("El número ascii resultante de su enunciado es " + suma); //imprime la suma total del valor ascii del enunciado
        
    }
    
}
