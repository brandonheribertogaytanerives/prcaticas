
import java.util.Scanner;

/*
 * Práctica del examen de diagnóstico
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
        
        char cSalir = 'n';                    //Declaración de variable para opción de terminar el programa
        int eNum;                                 // Declaración de la variable que se usará para guardar el número ingresado por el usuario
        Scanner sCaptu = new Scanner(System.in); // Variable para captura del teclado
        // Scanner es una clase para facilitar la lectura del teclado
        // System.in es la entrada de perifericos de Java
        do{
        System.out.println("Ingrese un número"); // Indicación para el usuario
        eNum = sCaptu.nextInt(); // Convierte a entero cualquier texto o número que el usuario ingrese.
        switch(eNum){ // Identificando el número
            case 1:
                System.out.println("Enero");
                System.out.println("¿Desea ingresar otro número? (s/n)"); //Indicación para repetir el programa o terminarlo
                break;
            case 2:
                System.out.println("Febrero");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 3:
                System.out.println("Marzo");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 4:
                System.out.println("Abril");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 5:
                System.out.println("Mayo");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 6:
                System.out.println("Junio");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 7:
                System.out.println("Julio");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 8:
                System.out.println("Agosto");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 9:
                System.out.println("Septiembre");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 10:
                System.out.println("Octubre");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 11:
                System.out.println("Noviembre");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            case 12:
                System.out.println("Diciembre");
                System.out.println("¿Desea ingresar otro número? (s/n)");
                break;
            default:
                System.out.println("Número ingresado incorrecto, intentelo de nuevo");
                break;
        }
        }while(eNum == 'S'|| eNum == 's');
    }
    
}
