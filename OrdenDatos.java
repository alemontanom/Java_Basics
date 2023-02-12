/*
 * Hacer un vector con numeros enteros, que limite la entrada a mínimo 5 y máximo 15 números y que 
 * ordene de menor a mayor o de mayor a menor segun la decisión del usuario. Condiciones:
1. Arreglo de entrada y arreglo de salida
2. Revisión cíclica
3. Usar al menos dos métodos
*/
package ordendatos;
import java.util.Scanner; //se necesita para usar el teclado como input
// import java.util.Arrays; se necesita para poder usar el arrays que acomoda el vector, pero en este programa se hará manualmente
/**
 *
 * @author Alejandro Christlieb & Alejandra Montaño
 * a01025343 y a01024946 
 */
public class OrdenDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;//variable que determinará cuantos valores (posiciones) puede tener el vector
        Scanner kb = new Scanner (System.in); //inicializa el scaneo del teclado 
        System.out.println("¿Cuántos números quiere en su vector? Mínimo 5, máximo 15");
        x = kb.nextInt(); //establece el tamaño del vector, cuantas posiciones puede tener 
        while (x<5 || x>15) { //ciclo para que si el usuario no pueda tener un vector de menos de 5 posiciones o más de 15
            System.out.println("Ingrese un número correcto. Mínimo 5, máximo 15");
            x = kb.nextInt(); //mueve x a lo que ingrese el usuario
        }
        int i = 0; //marcador para las posiciones del vector
        int vector [] = new int [x]; //la x entre corchetes establece que será tan grande como haya establecido previamente el usuario
        while (i<x) { //ciclo para que solo se pidan la cantidad de números que estableció el usuario a través de x
            System.out.println("Ingrese el número " + i + " para su vector");
            vector [i] = kb.nextInt();
            i++;
        }
        System.out.println("El vector que ingresó es: "); 
        for (i=0;i<x;i++) //va a imprimir todas las posiciones del vector en una linea 
            System.out.print(vector[i] + " "); 
        ordena(vector, x); 
    }
    private static void ordena(int[] vector, int x) { 
        char choice; //se usará para que el usuario decida en qué orden quiere su acomodo
        int w; 
        for (int c=0;c<=x-2;c++) //va comparando las posiciones del vector y si el número en esa posición es mayor a el de la siguiente le intercambia los lugares
            for (int j=c+1;j<=x-1;j++)
                if (vector[j]<vector[c]){
                    w = vector[c];
                    vector[c] = vector [j]; 
                    vector [j] = w; 
                }
        Scanner kb = new Scanner (System.in); 
        System.out.println("\nDesea arreglar su vector de menor a mayor (A), o de mayor a menor (B). Ingrese la letra mostrada entre paréntesis de su opción. ");
        //le pide al usuario cómo lo quiere acomodar
        choice = kb.next().charAt(0);//recibe un char del teclado y lo asigna a choice 
        switch (choice) { //switch que mandará al programa al método correspondiente 
            case 'A': 
                menor(vector, x);//el método menor se abrirá con las variables vector y x
                break; 
            case 'B':
                mayor(vector, x); //el método mayor se abrirá con las variables vector y x
                break; 
            default: 
                System.out.println("Esa opción no es válida"); //lo que saca el programa si se ingresa como choice algo que no sea A o B
        }
    }
    
    private static void menor(int[] vector, int x) { //jala las dos variables de otro método que se necesitan 
        System.out.println("\nEl arreglo acomodado de menor a mayor es: ");
        for (int d=0;d<x;d++)
            System.out.print(vector[d] + " "); 
        //Arrays.sort(vector); --> función que acomoda el vector de menor a mayor
    }
    private static void mayor(int[] vector, int x) {//jala las dos variables que necesita del otro método
        //Arrays.sort(vector);-->función que acomoda el vector de menor a mayor 
        System.out.println("\nEl arreglo acomodado de mayor a menor es: "); 
        for (int i=x-1;i>=0;i--)//empieza con el i más grande y va tomando la posición anterior para que se impirma al revés 
            System.out.print(vector[i] + " "); 
    }
}
