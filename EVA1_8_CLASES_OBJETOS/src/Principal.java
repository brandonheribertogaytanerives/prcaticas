
import java.util.Scanner;
import misClases.Persona;

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
	static Scanner scan = new Scanner(System.in);
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Persona persona = new Persona();
		
		System.out.println("Ingresa tu nombre: ");
		persona.setNombre(scan.nextLine());
		System.out.println("Ingresa tu apellido paterno: ");
		persona.setApellidoP(scan.nextLine());
		System.out.println("Ingresa tu apellido materno: ");
		persona.setApellidoM(scan.nextLine());
		LimpiarEscaner();
		System.out.println("Ingresa tu edad: ");
		persona.setEdad(scan.nextInt());
		LimpiarEscaner();
		System.out.println("Ingresa tu genero (F/M): ");
		persona.setGenero(scan.nextLine().charAt(0));
		LimpiarEscaner();
		System.out.println("Ingresa tu RFC: ");
		persona.setRFC(scan.nextLine());
		System.out.println("Ingresa el nombre de tu calle: ");
		persona.setCalle(scan.nextLine());
		LimpiarEscaner();
		System.out.println("Ingresa el número de tu casa: ");
		persona.setNumeroCasa(scan.nextInt());
		LimpiarEscaner();
		System.out.println("Ingresa el nombre de tu colonia: ");
		persona.setColonia(scan.nextLine());
		System.out.println("Ingresa el nombre de tu ciudad: ");
		persona.setCiudad(scan.nextLine());
		System.out.println("Ingresa el nombre de tu estado: ");
		
		System.out.println("Ingresa tu estado civil: ");
		persona.setEstadoCivil(scan.nextLine());
		System.out.println("Ingresa tu nivel de estudio: ");
		persona.setNivelEstudio(scan.nextLine());
		System.out.println("Ingresa tu salario: ");
		persona.setSalario(scan.nextDouble());
		
		
		
		System.out.println("Los datos son: \n" + "Nombre: " + persona.getNombre() +" "+persona.getApellidoP()+" "+persona.getApellidoM()+ "\n"+
				     "Edad: " + persona.getEdad() + "\n" + "Genero: " + persona.getGenero() + "\n" + "RFC: " + persona.getRFC() + "\n" + 
				   "Dirección: " + persona.getCalle() + " " + persona.getNumeroCasa()+" "+persona.getColonia()+" "+persona.getCiudad()+" "+
				    persona.getEstado() + "\n" + "Estado civil: " + persona.getEstadoCivil() + "\n" + "Nivel de estudio: " + persona.getNivelEstudio());
	}
	
	public static void LimpiarEscaner(){
		scan = new Scanner(System.in);
	}
	
}
