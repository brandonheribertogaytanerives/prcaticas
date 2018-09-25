
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
		double base,altura;
		Scanner scan = new Scanner(System.in);
		System.out.println("Calcular área de un triángulo");
		System.out.print("Ingresa la base: ");
		base = scan.nextDouble();
		System.out.print("Ingresa la altura: ");
		altura = scan.nextDouble();
		System.out.println("El área es: " + AreaTriangulo(base,altura));
	}
	
	public static double AreaTriangulo(double base, double altura){	// Declaración o cabecera de la función
		// Implementación de la función
		double area = (base*altura)/2;
		return area;
	}
	
}
