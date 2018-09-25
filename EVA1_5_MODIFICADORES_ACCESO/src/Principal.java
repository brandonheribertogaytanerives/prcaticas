/*
 * 
*		Modificadores de acceso;
		Público    ----->    bacanal      ------> Todos tienen acceso
		Privado    ----->    acceso limitado dentro de la clase
		Protected  ----->    Acceso por herencia  (dentro de la clase y subclases)
		Default    ----->    Acceso a nivel de paquete
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
		
		// Crear un objeto (crear una instancia de la clase)
		Banco bBank = new Banco();
		
		bBank.sNombreCliente = "Brandon Heriberto Gaytán Erives";
		bBank.dSaldoCuenta = 100000000;
		System.out.println("Cliente: " + bBank.sNombreCliente);
		System.out.println("Saldo: " + bBank.dSaldoCuenta);
		
		bBank.dSaldoCuenta = 0;
		System.out.println("Cliente: " + bBank.sNombreCliente);
		System.out.println("Saldo: " + bBank.dSaldoCuenta);
	}
	
}
     // Forma de representar un banco
class Banco{
	// En general, los atributos de una clase son privados
	private String sNombreCliente;
	private double dSaldoCuenta;
}