
import Momentum.Banco;
import Momentum.MejorBanco;

/*
 * Clase Banco para ejemplificar uso de atributos métodos y modificadores de acceso
 */

/**
 *
 * @author  Brandon Heriberto Gaytán Erives
 */
public class Principal {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		Banco bMiCuenta = new Banco();
		//bMiCuenta.Nombre = "Rogelio Antonio Chacón Alfaro";
		//bMiCuenta.saldo = 100000;
		//System.out.println("INFORMACIÓN DE LA CUENTA");
		//System.out.println("Titular: " + bMiCuenta.Nombre);
		//System.out.println("Saldo: " + bMiCuenta.saldo);
		
		MejorBanco mbMiMejorCuenta = new MejorBanco();
		mbMiMejorCuenta.setNombre("Brandon Heriberto Gaytán Erives");
		mbMiMejorCuenta.setSaldo(1000000);
		
		System.out.println("Información de la cuenta");
		System.out.println("Titular: " + mbMiMejorCuenta.getNombre());
		System.out.println("Saldo: " + mbMiMejorCuenta.getSaldo());
                
	}
	
}
