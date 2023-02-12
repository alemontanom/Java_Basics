/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pila;
import java.util.Stack; 
/**
 *
 * @author alemontano
 */
class Pila{
	//pop- obtiene el último valor y lo borra
	//push-ingresa valores al final de la pila
	//empty-checa si la pila está vacía 
	//peek-muestra el último valor ingresado
	public static void main(String[] args) {
		Stack pila = new Stack(); //crea el objeto 
		pila.push(0); //mete los datos a la pila: (0)
		pila.push(1); 
		pila.push(2); 
		pila.push(3); 
		pila.push("cuatro"); 

		System.out.println("ultimo valor:"+pila.peek()); //muestra último valor
		while (pila.empty()==false){
			System.out.println(pila.pop()); //si hay un valor lo borra
		}
	}
}