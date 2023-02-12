/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurascontrol;
import javax.swing.JOptionPane; 
/**
 * Alejandra Montaño Murrieta y Alejandro Christlieb Picazo 
 * A01024946, A01025343
 * Estructuras de control-> tres diferentes programas, divididos en clases 
 * @author alemontano
 */
public class EstructurasControl { 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Inicio código con tres programas
        int op; 
        op = Integer.parseInt(JOptionPane.showInputDialog("¿Qué programa quiere correr (1, 2 o 3)?")); //los programas están numerados como se establecieron en blackboard
        switch (op){ // te redirige a la clase del programa que hayas elegido
            case 1:
                EstructurasControl.uno(); 
                break;
            case 2:
                EstructurasControl.dos();
                break;  
            case 3:
                EstructurasControl.tres();
                break;
            default: 
                System.out.println("Esa opción no es válida"); //lo que pasa si el usuario no ingresa una de las opciones
        }
       }
    private static void uno() {
        // inicio del programa 1: resolver ecuaciones de segundo grado, sacar notificación si las soluciones son imaginarias
         boolean choice; // esta variale determinará si el usuario quiere resolver más de una ecuación 
        double a,b,c,x1,x2; //considerando una ecuación de segundo grado como f(x)=ax^2+bx+c y las soluciones de x se dan cuando f(x)=0
        do { //Se va a ejecutar una vez al menos
            a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de c"));
            x1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a); //fórmula cuadrática con las variables
            x2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            if (Math.pow(b,2)-4*a*c<0) // si la raíz es negativa se va a mandar una notificación de soluciones imaginarias
                JOptionPane.showMessageDialog(null, "Soluciones imaginarias."); //muestra el resultado. Null es un requerimiento del método
            else 
                JOptionPane.showMessageDialog(null, "x1 = " + x1 + " y x2 = "+ x2); // Le da al usuario las soluciones
            
            choice = Boolean.parseBoolean(JOptionPane.showInputDialog("Desea resolver otra ecuación cuadrática? Escriba true para sí"));//Preguntará al usuario si seguir 
            
        }
        while (choice == true);
   
    }

    private static void dos() {
        // inicio problema dos: separar una cantidad de entre 0 a 9999 en miles, centenas, decenas y unidades
        int ing, mil, cen, dec, uni; 
        ing = Integer.parseInt(JOptionPane.showInputDialog("Cantidad")); //pide la cantidad que quiere dividir en miles, centenas, decenas y unidades
        while (ing<0 || ing>9999) 
            ing = Integer.parseInt(JOptionPane.showInputDialog("Ese número no es válido, por favor ingrese una cantidad entre 0-9999 \n Cantidad:"));
        // ciclo para que la cantidad que ingrese el usuario entre en los parámetros establecidos y le siga preguntando una cantidad hasta que le pique cancelar
        mil = ing/1000; //como las variables son int te da solo el número entero de la división, no incluye el residuo 
        cen = (ing - (mil*1000))/100; //no se consideran las centenas que hacen las milesimas (o el equivalente para cada división), por lo tanto se resta la cantidad que ya se consideró en la categoría anterior
        dec = (ing - (mil*1000) - (cen*100))/10; 
        uni = (ing - (mil*1000) - (cen*100) - (dec*10));
        System.out.printf("Miles = " + mil + "\nCentenas = " + cen + "\nDecenas = " + dec + "\nUnidades = " + uni); // imprime los resultados 
    }

    private static void tres() {
        // inicio programa 3: sacar la serie Fibonacci hasta el número de términos que pida el usuario 
        int fib[] = new int [21474] ; // arreglo unidimensional para guardar los términos de la serie Fibonacci, el número entre corchetes define cuantos lugares podría tener, se pone un número grande que quepa en int y en la memoria de la mac
        int ent, i; 
        ent = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de términos que quiere de la serie Fibonacci")); //va a definir cuantos términos se muestran 
        fib[0] = 0; 
        fib[1] = 1;  
        fib[2] = fib[1] + fib[0]; //inicializa los primeros términos para que no se trabaje con números negativos y funcione
        if (ent>=3){ // como los primeros dos términos son 1, con esos términos no funciona la estructura del for, así que se excluyen 
            System.out.printf(fib[1] + " " + fib[2] + " "); // imprime los primeros dos términos para que la serie este completa y no empiece a partir del tercer término, perose pone fuera del for para que no pnga los primeros dos términos entre cada término
            for (i=3;i<=ent;i++) { //empieza en 3 por lo mismo y pasa hasta que llega al número de términos que el usuario pidió 
                fib[i] = fib[i-1] + fib[i-2];  //fib[i]= a la suma de los dos términos pasados
                System.out.printf(fib[i] + " "); 
                } 
        }
        else if (ent==1)
            System.out.printf("1 "); //primer término
        else 
            System.out.printf(fib[1] + " " + fib[2]); // segundo término 
       
    }
}
