/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1info2;
import java.util.*; 
/**
 *
 * @author alemontano
 */
public class Ejercicio1Info2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cal, sumc, sumf, respc, respf; 
        int fal, mat; 
        sumc=0;
        sumf=0; 
        mat=0; 
         Scanner keyboard = new Scanner (System.in);
         while (0<=mat && mat<5){
             System.out.println("Ingrese su calificación");
             cal=keyboard.nextFloat(); 
             while (cal<0 || cal>10) {
                 System.out.println("Calificación inválida. Por favor ingrese un número entre 0 y 10.");
                 cal=keyboard.nextFloat(); }
             System.out.println("Ingrese las faltas que tuvo en esa materia");
             fal=keyboard.nextInt(); 
              while (fal<=0 || fal>101) {
                 System.out.println("Ingrese un número de faltas verdadero");
                 fal=keyboard.nextInt(); }
             sumc=sumc+cal; 
             sumf=sumf+fal; 
             mat=mat+1; }
         respc=sumc/5;
         respf=sumf/5; 
         System.out.print("Su promedio de calificaciones es de " + respc);
         if (respc>9)
             System.out.println(", es extraordinariamente bueno. ¡Felicidades!"); 
         else if (respc>7.5)
             System.out.println(", es mediocre");
         else 
             System.out.println(", es asqueroso. Échele ganas joven...");
         System.out.println("Por otro lado, su promedio de faltas es de " + respf);
         
         
         
             
         
         
        // TODO code application logic here
    }
    
}
