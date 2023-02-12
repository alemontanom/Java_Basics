/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guiasp;
import javax.swing.JOptionPane;

/** 
 * Alejandra Montaño Murrieta, A01024946
 * Cuatro programas que resuelven diferentes problemas divididos en métodos 
 * @author alemontano
 */
public class GuiaSP {

    public static void main(String[] args) {
        // TODO code application logic here
        int op; 
        op = Integer.parseInt(JOptionPane.showInputDialog("¿Qué programa quiere correr (1, 2, 3, 4 o 5)?")); //los programas están numerados en el orden que se establecieron en la guía
        switch (op){ // te redirige al método del programa que hayas elegido
            case 1:
                GuiaSP.uno(); 
                break;
            case 2:
                GuiaSP.dos();
                break;  
            case 3:
                GuiaSP.tres();
                break;
            case 4: 
                GuiaSP.cuatro();
                break; 
            case 5:
                GuiaSP.cinco(); 
                break; 
            default: 
                System.out.println("Esa opción no es válida"); //lo que pasa si el usuario no ingresa una de las opciones
        }
    }

    private static void uno() {
        // inicio del programa 1: resolver ecuaciones de segundo grado, sacar notificación si las soluciones son imaginarias
        double a,b,c,x1,x2; //considerando una ecuación de segundo grado como f(x)=ax^2+bx+c y las soluciones de x se dan cuando f(x)=0
            a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de c"));
            x1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a); //fórmula cuadrática con las variables
            x2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            if (Math.pow(b,2)-4*a*c<0) // si la raíz es negativa se va a mandar una notificación de soluciones imaginarias
                JOptionPane.showMessageDialog(null, "Soluciones imaginarias."); //muestra el resultado. Null es un requerimiento de la función 
            else 
                JOptionPane.showMessageDialog(null, "x1 = " + x1 + " y x2 = "+ x2); // Le da al usuario las soluciones
    }

    private static void dos() {
        //inicio del programa 2: Se requiere de un convertidor de pesos cuya entrada sea en libras y me entregue el resultado en kg, onzas y toneladas. 
        double kg, lbs, onz, ton; 
        lbs = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso (en libras) que quiere convertir")); // pide el peso en librs
        kg = lbs/2.204; //lo convierte a kg
        onz = lbs*16; // convierte a onzas
        ton = lbs/2204.6; //convierte a toneladas 
        JOptionPane.showMessageDialog(null, "El peso que ingreso convertido a las diferentes unidades es de:\n" + kg + " kg\n" + onz + " onzas\n" + ton + " toneladas"); // muestra los 3 resultados 
    }

    private static void tres() {
        //inicio del programa 3: A una persona le piden calcular en segundos cualquier tiempo. Para lo anterior pide por separado las horas, minutos y segundos, realiza las operaciones necesarias y entrega cuantos segundos en total pasaron. 
        double hrs = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas que pasaron")); //pide las horas y las asigna a una variable double
        double min = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los minutos que pasaron"));// hace lo mismo con los minutos
        double seg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los segundos que pasaron"));//lo mismo con segundos
        double total = (hrs*3600) + (min*60) + seg; //convierte todo a segundos y lo suma 
        JOptionPane.showMessageDialog(null, "El tiempo transcurrido en segundos es de " + total); //muestra el resultado
    }

    private static void cuatro() {
        // inicio del programa 4: Realice el promedio de calificaciones de una persona, considerando como datos de entrada 7 materias o más (el usuario escoge). Debe calcular el promedio, mostrar las calificaciones iniciales e indicar si se debe repetir el curso, para lo cual con que repruebe una materia, o el promedio sea menor a 85, se debe repetir.
        boolean repetir = false; 
        int cal = 0; 
        int nummat = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas materias quiere promediar?")); 
        while (nummat<7)
            nummat = Integer.parseInt(JOptionPane.showInputDialog("El número mínimo de materias es 7. Ingrese el número de materias que cursó, mínimo 7"));
        int mat[] = new int [nummat + 1]; 
        for (int c=1;c<=nummat;c++){ // se llevará a cabo hasta que se llegue al número de materias que estableció el usuario
            mat[c] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación de su materia "+c));//pide la calificación de tantas materias como haya dicho que quiere
            while (mat[c]<0 || mat[c]>100)//pasa si el usuario no ingresa una calificación valida 
                mat [c] = Integer.parseInt(JOptionPane.showInputDialog("La calificación debe de ser entre 0 y 100. Ingrese la calificación de su materia "+c));//vuelve a pedir la calificación hasta que sea valida
            if (mat[c]<70)
                repetir = true; 
            cal = cal + mat[c]; 
        }// acaba el for
        double prom = cal/nummat; 
        for (int c=1;c<=nummat;c++)
            JOptionPane.showMessageDialog(null, "La calificación de su materia " + c + " es " + mat[c]);
        JOptionPane.showMessageDialog(null, "El promedio de calificaciones es de " + prom);
        if (prom<85 || repetir==true)
            JOptionPane.showMessageDialog(null, "Se debe repetir el curso");
        else 
            JOptionPane.showMessageDialog(null, "El curso ha sido aprobado");
    }

    private static void cinco() { //inicio del programa 5: Una persona le piden medir su consumo calorífico. Para lo anterior, se requiere saber el sexo de la persona para poder aplicar la fórmula correspondiente
        int sexo; 
        double MB = 0; 
        double peso= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kilogramos")); //le pide el peso
        double altura= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en cm"));//le pide la altura
        double edad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su edad en años"));//le pide su edad
        do 
           sexo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sexo, solo se acepta hombre (1) o mujer (2), conteste con 1 o 2"));
        while (sexo!=1 && sexo!=2); 
        switch (sexo){
            case 1: 
                MB = 66 + (13.7*peso) + (5*altura) - (6.5*edad);
                break; 
            case 2: 
                MB = 655 + (9.6 * peso) + (1.8 * altura) - (4.7 * edad);
                break; 
        }
        JOptionPane.showMessageDialog(null, "Su consumo calorífico es de " + MB);
    }
    
}