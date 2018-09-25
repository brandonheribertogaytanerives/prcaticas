
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon Heriberto Gaytán Erives
 */
public class Principal {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//Llamada a función
		Saludo();
		
		//Ejemplo 2:
		String name = setName();
		PrintName(name);
		
		//Simplificado
		PrintName(setName());
	}
	
	public static void Saludo(){
		String name = setName();
		PrintName(name);
	}
	
	public static String setName(){
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuál es tu nombre?");
		String name = scan.nextLine();
		return name;
	}
	
	public static void PrintName(String name){
		System.out.println("Hola " + name);
	}
	
	public static void recursividad(){
		System.out.println("Ups");
		//recursividad();
	}
	
}
