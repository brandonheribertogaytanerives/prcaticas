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
public class Circulo {
	private double Radio;
	private double Perimetro;

	public double getRadio() {
		return Radio;
	}

	public String setRadio(double Radio) {
		if(Radio <=0){
			return "Valor ingresado incorrecto, intentelo de nuevo";
		}
		else{
			this.Radio = Radio;
			return null;
		}
	}

	public double getPerimetro() {
		return Perimetro;
	}

	public String setPerimetro(double Perimetro) {
		if(Perimetro <= 0){
			return "Valor ingresado incorrecto, intentelo de nuevo";
		}
		else{
			this.Perimetro = Perimetro;
			return null;
		}
	}
	
	public double GetArea(){
		double area = Math.PI*Math.pow(this.Radio,2);
		return area;
	}
	
	public double GetPerimetro(){
		double perimetro = 2*Math.PI*this.Radio;
		return perimetro;
	}
	
	public double GetArea(double valor,String tipo){
		switch (tipo) {
			case "Perimetro":
			{
				double perimetro = valor;
				this.Radio = perimetro/(2*Math.PI);
				double area = GetArea();
				return area;
			}
			case "Radio":
			{
				this.Radio = valor;
				double area = GetArea();
				return area;
			}
			default:
				System.out.println("El tipo ingresado no es válido, intente de nuevo");
				return -1;
		}
	}
	
	
}
