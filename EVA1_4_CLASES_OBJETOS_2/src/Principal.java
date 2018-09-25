
import java.util.Scanner;



/**
 *
 * @author Brandon Heriberto Gaytán Erives
 */
	public class Principal {
		public static Scanner scan = new Scanner(System.in);

	/**
	 * @param args the command line arguments
	 */
		public static void main(String[] args) {
			// Instanciar la clase persona -->
			// 1.- Los objetos son identificadores (variables)
			//int val; // Declara
			//Persona pPersona1; // Declaración
			// Instanciar = Asignar valor (memoria)  -> new 
			//val = 10;
			
			// Declaración y uso de Persona 1
			//pPersona1 = new Persona(); // El objeto existe
			//System.out.println("Introducir nombre: ");
			//pPersona1.Nombre = scan.nextLine();
			//System.out.println(pPersona1.Nombre); // Aquí si podemos usarlos
			
			
			Persona pPersona2 = new Persona(); // Declaración de una segunda persona
			System.out.println("Introducir nombre: ");
			pPersona2.Nombre = scan.nextLine();
			System.out.println("Introducir apellido: ");
			pPersona2.Apellido = scan.nextLine();
			pPersona2.showName();
			
		}
		
		public static void LimpiarScanner(){
			scan = new Scanner(System.in);
		}
	
	}

	class Persona{
		
		// Atributos de la clase
		// Determinan el estado del objeto
		
		String Nombre;
		String Apellido;
		int Edad;
		String RFC;
		String Genero;
		int EstadoNac;
		String EdoCivil;
		String Ciudad;
		
		// Comportamiento de las clases
		// Métodos y/o funciones
		// Nivel de acceso | Valor de retorno | Nombre (Argumentos)
		
		public void showName(){
			System.out.println("El nombre es " + Nombre + " " + Apellido);
		}
		
	}
