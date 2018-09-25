/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Momentum;

/**
 *
 * @author  Brandon Heriberto Gaytán Erives
 */
public class MejorBanco {
	// Atributos de la clase
	// Siempre tienen que ser privados
	private String Nombre;
	private double Saldo;
	private String Contraseña;
	
	// Siempre debe existir un intermediario con los datos
	// Intermediario son métodos: get(Lectura) y set(Escritura)
	// Metodos:
	// Nivel de acceso - Valor de retorno - Nombre (Variables de entrada)
	// Leer datos de nuestra clase

	public String getNombre(String Contraseña) {
		if(Contraseña.equals(this.Contraseña)){
		return Nombre;
		}
		return null;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public void setContraseña(String Contraseña){
		this.Contraseña = Contraseña;
	}

	public double getSaldo(String Contraseña){
		if(Contraseña.equals(this.Contraseña)){
		return Saldo;	
		}
		return -1;
	}

	public void setSaldo(double Saldo) {
		this.Saldo = Saldo;
	}

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
