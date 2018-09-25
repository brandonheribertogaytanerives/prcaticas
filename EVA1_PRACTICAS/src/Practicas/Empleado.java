/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

/**
 *
 * @author  Brandon Heriberto Gaytán Erives
 */
public class Empleado {
	private String Nombre;
	private String ApellidoP;
	private String ApellidoM;
	private int Edad;
	private String EdoCivil;
	private String Dirección;
	private double SalarioDiario;
	private int Hijos;
	private String RFC;
	private String nSeguroSocial;
	private String Puesto;
	private String Clave;
	private int NoEmp;

	public int getNoEmp() {
		return NoEmp;
	}

	public boolean setNoEmp(int NoEmp) {
		if(NoEmp < 0){
			System.out.println("Número de empleado incorrecto, intentelo de nuevo");
			return false;
		}
		else{
			this.NoEmp = NoEmp;
			return true;
		}
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellidoP() {
		return ApellidoP;
	}

	public void setApellidoP(String ApellidoP) {
		this.ApellidoP = ApellidoP;
	}

	public String getApellidoM() {
		return ApellidoM;
	}

	public void setApellidoM(String ApellidoM) {
		this.ApellidoM = ApellidoM;
	}

	public int getEdad() {
		return Edad;
	}

	public boolean setEdad(int Edad) {
		if(Edad >= 18 && Edad <= 70){
			
		this.Edad = Edad;
		return true;
		}
		else{
			System.out.println("Edad ingresada incorrecta, intente de nuevo");
			return false;
		}
	}

	public String getEdoCivil() {
		return EdoCivil;
	}

	public void setEdoCivil(String EdoCivil) {
		this.EdoCivil = EdoCivil;
	}

	public String getDirección() {
		return Dirección;
	}

	public void setDirección(String Dirección) {
		this.Dirección = Dirección;
	}

	public boolean setSalarioDiario(double SalarioDiario) {
		if(SalarioDiario <= 0){
			System.out.println("El salario ingresado es incorrecto, intentelo de nuevo");
			return false;
		}
		else{
			this.SalarioDiario = SalarioDiario;
			return true;
		}
	}

	public int getHijos() {
		return Hijos;
	}

	public boolean setHijos(int Hijos) {
		if(Hijos < 0){
			System.out.println("Valor ingresado incorrecto, intentelo de nuevo");
			return false;
		}
		else{
			
		this.Hijos = Hijos;
		return true;
		}
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String RFC) {
		this.RFC = RFC;
	}

	public String getnSeguroSocial() {
		return nSeguroSocial;
	}

	public void setnSeguroSocial(String nSeguroSocial) {
		this.nSeguroSocial = nSeguroSocial;
	}

	public String getPuesto() {
		return Puesto;
	}

	public void setPuesto(String Puesto) {
		this.Puesto = Puesto;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String Clave) {
		this.Clave = Clave;
	}
	
	public double getSalario(char tipo,String clave,String NoEmpleado){
		if(clave.equals(this.Clave) && NoEmpleado.equals(this.NoEmp)){
		double Salsem,Salmen,Salan;
		Salsem = this.SalarioDiario*7;
		Salmen = Salsem*4;
		Salan = Salmen*12;
		
		switch (tipo) {
			case 'D':
				return this.SalarioDiario;
			case 'S':
				return Salsem;
			case 'M':
				return Salmen;
			case 'A':
				return Salan;
			default:
				System.out.println("Opción no válida, intente de nuevo");
				return -1;
		}
		}
		else{
			System.out.println("Datos incorrectos, intente de nuevo");
		}
		return -1;
	}
	
	public void DescripcionEmpleado(String clave, String NoEmpleado){
		
		if(clave.equals(this.Clave) && NoEmpleado.equals(this.NoEmp)){
		System.out.print("Nombre: "); System.out.println(this.Nombre + " " + this.ApellidoP + " " + this.ApellidoM);
			System.out.println("No. Empleado: "); System.out.println(this.NoEmp);
		System.out.println("Puesto: "); System.out.println(this.Puesto);
		System.out.println("Salario diario: "); System.out.println(this.SalarioDiario);
		System.out.println("RFC: "); System.out.println(this.RFC);
		System.out.println("No. Seguro Social: "); System.out.println(this.nSeguroSocial);
		System.out.println("Edad: "); System.out.println(this.Edad);
		System.out.println("Estado Civil: "); System.out.println(this.EdoCivil);
		System.out.println("Hijos: "); System.out.println(this.Hijos);
		System.out.println("Dirección: "); System.out.println(this.Dirección);
		}
		else{
			System.out.println("Datos incorrectos, intente de nuevo.");
		}
	}
	
}

