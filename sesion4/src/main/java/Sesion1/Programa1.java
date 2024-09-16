package Sesion1;
import java.util.Scanner;
/**@author keyla*/
public class Programa1 {
    public static void main(String[] args) {
        //declarando las variables
        String name; 
        String producto;
        double precio=0;
        int cantidad =0;
        double igv;
        double subTotal;
        double total; 
        //instanciando objeto scanner 
        Scanner lectura = new Scanner(System.in);
        //solicitar datos a usuario 
        System.out.print("Ingrese su Nombre: ");
        name = lectura.nextLine();
        //solicitar nombre de producto
        System.out.print("Hola "+ name +" ingrese el nombre del producto: ");
        producto = lectura.nextLine();
        //solicitar el precio del producto
        System.out.print(name + " ingrese el precio del producto: ");
        //validación del número ingresado
        while(lectura.hasNext()){
            if(lectura.hasNextDouble()){
                precio = lectura.nextDouble();  
                break;
            }else{
                System.out.print("Por favor, ingrese un número valido:");
                lectura.nextLine();
            }
        }
        System.out.print("ahora ingrese la cantidad del producto ingresado: ");
        //validación del elemento ingresado
        while(lectura.hasNext()){
            if(lectura.hasNextInt()){
                cantidad = lectura.nextInt();  
                break;
            }else{
                System.out.print("Por favor, ingrese un numero valido:");
                lectura.nextLine();
            }
        }
        //realizando operaciones
        subTotal = cantidad * precio;
        igv = (subTotal * 18) /100;
        total = subTotal - igv ; 
        //salida de informacion 
        System.out.print( name + " El subtotal es: " + subTotal  + "\n");
        System.out.print( name + " El igv es: " + igv + "\n");
        System.out.print( name + " El total es: " + total);

    }
    
}
