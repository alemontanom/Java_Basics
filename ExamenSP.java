/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examensp;
import java.util.*; 
import java.util.Random; 

/**
 *Alejandra Montaño Murrieta
 * A01024946
 * Pide al usuario el número de datos con los que va a trabajar y con ellos calcula el promedio, la desviación estandar y los ordena de menor a mayor
 * Despliega los resultados 
 * @author alemontano
 */
public class ExamenSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N, i;
        double suma=0; 
        Random aleatorio = new Random(); 
        Scanner keyboard = new Scanner (System.in);
        do {
            System.out.print("Ingrese con cuántos datos quiere trabajar. Mínimo 10, máximo 15.");
            N = keyboard.nextInt(); }
        while (N<10||N>15); 
        int datos[] = new int [15]; 
        for (i=0;i<=N;i++){
            datos[i] = aleatorio.nextInt(999); 
            suma = suma + datos[i]; 
        } 
        double prom=suma/N; 
        double sumade=0; 
        for (i=0;i<=N;i++){
            double sumaind=Math.pow((datos[i]-prom), 2); 
            sumade = sumade + sumaind; 
        }
        double a = sumade/(N-1); 
        double DE = Math.pow(a,0.5); 
        //Arrays.sort(datos);
        System.out.print("El promedio de los datos creados es: "+prom+"\nSu desviación estándar es: "+DE+"\nLos datos ordenados de menor a mayor son: "); 
        for (i=0;i<=N-1;i++){ //va comparando las posiciones del vector y si el número en esa posición es mayor a el de la siguiente le intercambia los lugares
            for (int j=i+1;j<=N-1;j++)
                if (datos[j]<datos[i]){
                    int w = datos[i];
                    datos[i] = datos [j]; 
                    datos [j] = w; 
                }
            System.out.print(datos[i] + " "); 
        }        
        
    }
}    
    

