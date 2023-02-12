/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora.buena;

import javax.swing.JOptionPane;

/**
 *
 * @author alemontano
 * Alejandra Montaño Murrieta 
 * A01024946
 * Problema que resuelve: calcular los resultados de operaciones matemáticas básicas con dos números
 */
public class CalculadoraBuena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // clase principal -> subdivisiones
        int op = 1;
        while (op != 7)//mientras no sea 7
        {
            System.out.println("Menú de operaciones");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Potencia");
            System.out.println("7. Salir");
            op = Integer.parseInt(JOptionPane.showInputDialog("Elije una opción"));//notificador donde se ingresan valores-> parse convierte tipos de datos
            Calculadorita.menu(op); // nos manda a la otra clase
        }
    }
    
}

// clase que divide el código en subsecciones->dependiendo de la operación seleccionada
class Calculadorita {
    public static void menu (int op){ //void no regresa resultado
        double num1, num2;
        double y=0;
        // Si la opción es menor o igual a 0 e igual o mayor a 7 no va a hacer nada
        if (op <= 0 || op >= 7)  
            return;
        // Si sí seleccionan una opción se redirecciona
        num1 = Calculadorita.entrada();
        num2 = Calculadorita.entrada();
        //El switch te va a direccionar a las clases de abajo dependiendo de la selección
        switch (op){
            case 1:
                y = Calculadorita.suma(num1,num2);
                break;
            case 2:
                y= Calculadorita.resta(num1,num2);
                break;  
            case 3:
                y = Calculadorita.multiplicacion(num1,num2);
                break;
            case 4:
                y = Calculadorita.division(num1,num2);
                break;
            case 5:
                y= Calculadorita.modulo(num1,num2);
                break;
            case 6:
                y = Calculadorita.potencia(num1,num2);
                break;
                
        }
        Calculadorita.salida(y);// se va al método de salida con el valor de y 
    }
    public static double entrada (){
        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número"));
        return x;// se asignan los valores para hacer las operaciones
    }
 
    public static double suma (double a, double b) {
        return a+b;//Regresará la suma de los valores
    }
    
    public static double resta (double a, double b) {  
        return a-b;
    }
    
    public static double multiplicacion (double a, double b) { 
        return a*b;
    }
    
    public static double division (double a, double b) {    
        return a/b;
    }
    
    public static double modulo (double a, double b) { 
        return a%b;
    }
        
    public static double potencia  (double a, double b) {  
        return Math.pow(a,b);
    }
    
    public static void salida (double y) {
        JOptionPane.showMessageDialog(null, y);//JOptionPane funciona para habilitar el notificador
    }
}
    

