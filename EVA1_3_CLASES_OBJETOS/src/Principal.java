
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
        // Crear objetos de clases: Instanciación
        // Similar a declarar variables
        // Nombre de la clase, nombre del objeto
        
        Principal pObjetoPpal; // Declarando el objeto de tipo Principal (Clase)
        
        // Asignación de memoria (Crear la instancia)
        pObjetoPpal = new Principal(); // Constructor
        
        System.out.println("El objeto tiene: " + pObjetoPpal);  // Imprime la dirección de memoria en donde se encuentra almacenado
        Principal pObj2 = new Principal(); // Instanciación
        
        Simple pObjSim1 = new Simple(); // Instanciación de un objeto de tipo Simple (Clase)
        
        Scanner scan = new Scanner(System.in); // Instanciación de un objeto de tipo Scanner // Dentro de los paréntesis se envian los datos hacia el objeto
        // Para crear un objeto siempre debe ser usada la instrucción new
    }
    
}
// Clase sin estado (Variables)
// Sin comportamiento (Métodos)
class Simple{
    
}
