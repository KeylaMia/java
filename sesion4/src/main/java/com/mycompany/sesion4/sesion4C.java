package com.mycompany.sesion4;
import java.util.Scanner;


/**
 * @Keyla Jimenez
 * Crear un programa que permita ingresar un número (1-6) entero. Visualizar el
   número en inglés.
 */

public class sesion4C {
     public static void main(String[] args) {
        //Declarando las variables a utilizar:
        int number = 0;
        String ingles = " ";
        //Instanciando el objeto de lectura:
        Scanner lectura = new Scanner(System.in);
        //Solicitando Ingreso de datos:
        System.out.println("Hola! Por favor, ingresa un número del 1 al 6");
        number = lectura.nextInt(); 
        switch (number){
            case 1:
                ingles = "ONE";
                break;
            case 2:
                ingles = "TWO";
                break;
            case 3:
                ingles = "THREE";
                break;
            case 4:
                ingles = "FOUR";
                break;
            case 5:
                ingles = "FIVE";
                break;
            case 6:
                ingles = "SIX";
                break;
            default: 
                ingles = Integer.toString(number);
                System.out.println("El numero que ingresaste no está dentro del 1 al 6 porque ingresaste el: " + ingles);
                
        }
        if(number>0 && number <7){
            System.out.println("El numero que ingresaste se escribe en ingles así: " + ingles);
        }else{
            System.out.println(" ");
        }   
    }
}
