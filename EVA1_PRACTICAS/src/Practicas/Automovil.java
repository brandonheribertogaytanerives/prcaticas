/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

/**
 *
 * @author Brandon Heriberto Gaytán Erives
 */
public class Automovil {
	private String Modelo;
	private int Año;
	private String Marca;
	private String Color;
	private int Cilindros;
	private boolean Automatico;
	private boolean Electrico;
	private String Pais;
	private int Combustible;
	private int TamañoRin;
	private int Kilometraje;

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public int getAño() {
		return Año;
	}

	public String setAño(int Año) {
		if(Año < 1000){
			return "Año ingresado incorrecto, intentelo de nuevo";
		}
		else{
		this.Año = Año;
		return null;
		}
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String Color) {
		this.Color = Color;
	}

	public int getCilindros() {
		return Cilindros;
	}

	public void setCilindros(int Cilindros) {
		this.Cilindros = Cilindros;
	}

	public boolean isAutomatico() {
		return Automatico;
	}

	public void setAutomatico(char Automatico) {
		switch (Automatico) {
			case 's':
				this.Automatico = true;
				break;
			case 'n':
				this.Automatico = false;
				break;
			default:
				System.out.println("Presione 's' para indicar Si, presione 'n' para indicar No, intentelo de nuevo");
				break;
		}
	}

	public boolean isElectrico() {
		return Electrico;
	}

	public void setElectrico(char Electrico) {
		switch (Electrico) {
			case 's':
				this.Electrico = true;
				break;
			case 'n':
				this.Electrico = false;
				break;
			default:
				System.out.println("Presione 's' para indicar Si, presione 'n' para indicar No, intentelo de nuevo");
				break;
		}
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String Pais) {
		this.Pais = Pais;
	}

	public int getCombustible() {
		return Combustible;
	}

	public void setCombustible(int Combustible) {
		this.Combustible = Combustible;
	}

	public int getTamañoRin() {
		return TamañoRin;
	}

	public void setTamañoRin(int TamañoRin) {
		this.TamañoRin = TamañoRin;
	}

	public int getKilometraje() {
		return Kilometraje;
	}

	public void setKilometraje(int Kilometraje) {
		this.Kilometraje = Kilometraje;
	}
	
	
}
