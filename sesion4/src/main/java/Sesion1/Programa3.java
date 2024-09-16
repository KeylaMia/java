package Sesion1;
import java.util.Scanner;
/**@author keyla*/
public class Programa3 {
    public static void main(String[] args) {
        //declarando las variables
        String name; 
        String cargo;
        double ingreso =0;
        double gasto=0;
        double ahorroMensual;
        double ahorroBimestral; 
        double ahorroSemestral; 
        double ahorroAnual; 
        //instanciando objeto scanner 
        Scanner lectura = new Scanner(System.in);
        //solicitar datos a usuario 
        System.out.print("Ingrese su Nombre: ");
        name = lectura.nextLine();
        //solicitar nombre de producto
        System.out.print("Hola "+ name +" ingrese el cargo que tiene: ");
        cargo = lectura.nextLine();
        //solicitar el precio del producto
        System.out.print(name + ", ingrese sus ingresos mensuales: ");
        //validación del número ingresado
        while(lectura.hasNext()){
            if(lectura.hasNextDouble()){
                ingreso = lectura.nextDouble();  
                break;
            }else{
                System.out.print("Por favor, ingrese un número valido:");
                lectura.nextLine();
            }
        }
        System.out.print("ahora ingrese su gasto mensual: ");
        //validación del elemento ingresado
        while(lectura.hasNext()){
            if(lectura.hasNextDouble()){
                gasto = lectura.nextDouble();  
                break;
            }else{
                System.out.print("Por favor, ingrese un numero valido:");
                lectura.nextLine();
            }
        }
        //realizando operaciones
        ahorroMensual = ingreso - gasto;
        ahorroBimestral = ahorroMensual*2;
        ahorroSemestral = ahorroMensual*6 ; 
        ahorroAnual = ahorroMensual*12; 
        //salida de informacion 
        System.out.print( name + ", su ahorro mensual es: " + ahorroMensual + "\n");
        System.out.print( name + ", su ahorro bimestral es: " + ahorroBimestral + "\n");
        System.out.print( name + ", su ahorro semestral es: " + ahorroSemestral + "\n");
        System.out.print( name + ", su ahorro anual es: " + ahorroAnual + "\n");
    }
    
    
}
