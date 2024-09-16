package Sesion1;
import java.util.Scanner;
/**@author keyla*/
public class Programa2 {
    public static void main(String[] args) {
        //declarando las variables
        int cantidad =0;
        //instanciando objeto scanner 
        Scanner lectura = new Scanner(System.in);
        //solicitar datos a usuario 
        System.out.print("Ingrese la cantidad de sueldos a ingresar: ");
        //validación del número ingresado
        while(lectura.hasNext()){
            if(lectura.hasNextInt()){
                cantidad = lectura.nextInt();  
                break;
            }else{
                System.out.print("Por favor, ingrese un número valido:");
                lectura.nextLine();
            }
        }
        double sueldo = 0; 
        double totalSueldo = 0;
        double promedio = 0; 
        for(int i = 1 ; i <= cantidad; i++){
            System.out.print("ahora ingrese el sueldo n" + i + " : ");
            while(lectura.hasNext()){
                if(lectura.hasNextDouble()){
                    sueldo = lectura.nextDouble();  
                    break;
                }else{
                    System.out.print("Por favor, ingrese un número valido:");
                    lectura.nextLine();
                }
            }
            //operando
            totalSueldo += sueldo;
            promedio = totalSueldo/i; 
        }
        //salida de informacion 
        System.out.print( " La cantidad de sueldos  es: " + cantidad  + "\n");
        System.out.print( " El total de sueldos es: " + totalSueldo + "\n");
        System.out.print( " El promedio de sueldos es: " + promedio);
    }
}
