/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actclasestringtochar;
import java.util.Scanner; //sirve para ingresar datos por el teclado, es una librería de scanner que se manda a llamr 

/**
 *
 * @author alemontano
 * Alejandra Montaño Murrieta
 * A01024946
 * Este programa convertirá un String que da el usuario a un vector de caracteres, lo precesará de forma inversa y mostrará los resultados 
 */
public class ActClaseStringtoChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena; //variable donde se ingresa el string 
        char resultado[] = new char [100]; //vector donde se guardarán los caracteres char 
        int count, i; //variable para contar el número de elementos en el string
        Scanner kb = new Scanner (System.in); // Declara el teclado como un objeto de entrada
        System.out.println("Ingresa una palabra");//le pide al usuario la cadena de string 
        cadena = kb.nextLine(); //Función del evento Scanner que permite tomar los datos ingresados en la siguiente línea y lo asigna como tu variable
        count = cadena.length(); // Esta función cuenta el número de carácteres en un String.
        System.out.println("\nLa palabra que ingresó es:");
        for (i=0; i<count; i++) { // i solo se inicializa para el for, empieza como 0 y para cuando ya se llego al número de caracteres del string
            resultado[i] = cadena.charAt(i); //charAt indica el caracter en la posición entre corchetes. Función de String
            System.out.print(resultado[i]); // Imprime el resultado
        }
        
        System.out.println(" \n \nLa palabra que introdujo al revés es:"); //se debe invertir el vector
        i = count-1; //Como iniciamos en 0 el for de arriba, i = count es un número 
        while (i >= 0) { // Este while sirve para imprimir el vector de atrás a adelante
            System.out.print(resultado[i]);
            i--; // se resta uno a i cada vez.
        }
        
        i=0; //Establecer i a 0 porque si no está en -1 
        System.out.println("\n \nLas consonantes de la palabra son:"); 
        while (i < count){ // se usa el while para imprimir SOLO las consonantes del string 
            if (resultado[i] != 'a' && resultado[i] != 'e' && resultado[i]!='i' && resultado[i]!='o' && resultado[i] !='u'){ 
                System.out.print(resultado[i]);//Si i no es igual a nignuna vocal se imprime
            }
            i++; // Se suma 1 cada vez que pasa el ciclo para que se corra para el número de caracteres que se tienen contados en count
        }
        
    }
    
}
