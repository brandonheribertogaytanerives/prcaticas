
import NewPackage.Main;

/*
 * Demostración de niveles de acceso
*	Public | Private | Protected | Default
 */

/**
 *
 * @author Brandon Heriberto Gaytán Erives
 */
public class Principal {
	
	public int Atributo1 = 10;
	private int Atributo2 = 20;
	protected int Atributo3 = 30;
	int Atributo4 = 40;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		// <Default - Package>
		Principal pPrincipal = new Principal();
		System.out.println(pPrincipal.Atributo1);
		System.out.println(pPrincipal.Atributo2);
		System.out.println(pPrincipal.Atributo3);
		System.out.println(pPrincipal.Atributo4);
		
		Default dDefault = new Default();
		System.out.println(dDefault.Atributo1);
		System.out.println(dDefault.Atributo3);
		System.out.println(dDefault.Atributo4);
		
		Secundaria sSecundaria = new Secundaria();
		System.out.println(sSecundaria.Atributo1);
		System.out.println(sSecundaria.Atributo3);
		System.out.println(sSecundaria.Atributo4);
		
		DefaultSecun dDefaultSecun = new DefaultSecun();
		System.out.println(dDefaultSecun.Atributo1);
		System.out.println(dDefaultSecun.Atributo3);
		System.out.println(dDefaultSecun.Atributo4);
		
		// <NewPackage>
		Main mMain = new Main();
		System.out.println(mMain.Atributo1);
		
		DefaultMain dDefaultMain = new DefaultMain();
		
		
		
		
		
		
	}
	
}

class Default{
	
	public int Atributo1 = 10;
	private int Atributo2 = 20;
	protected int Atributo3 = 30;
	int Atributo4 = 40;
}
