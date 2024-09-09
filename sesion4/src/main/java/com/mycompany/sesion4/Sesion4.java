package com.mycompany.sesion4;
import java.util.Scanner;

/**
 * @author Keyla Jimenez
 * Crear un programa que permita ingresar un número (1-5) entero. Visualizar el
   número ingresado en palabra
 */

public class Sesion4 {
    public static void main(String[] args) {
        //Declarando las variables a utilizar:
        int number = 0;
        String palabra = " ";
        //Instanciando el objeto de lectura:
        Scanner lectura = new Scanner(System.in);
        //Solicitando Ingreso de datos:
        System.out.println("Hola! Por favor, ingresa un número del 1 al 5");
        number = lectura.nextInt(); 
        switch (number){
            case 1:
                palabra = "uno";
                break;
            case 2:
                palabra = "dos";
                break;
            case 3:
                palabra = "tres";
                break;
            case 4:
                palabra = "cuatro";
                break;
            case 5:
                palabra = "cinco";
                break;
            default: 
                palabra = Integer.toString(number);
                System.out.println("El numero que ingresaste no está dentro del 1 al 5 porque ingresaste el: " + palabra);
                
        }
        if(number>0 && number <6){
            System.out.println("El numero que ingresaste es el numero " + palabra);
        }else{
            System.out.println(" ");
        }
        
        
    }
}
