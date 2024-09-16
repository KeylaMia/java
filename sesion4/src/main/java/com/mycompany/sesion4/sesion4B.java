package com.mycompany.sesion4;
import java.util.Scanner;


/**
 * 
 * @Keyla Jimenez
 * Crear un programa que permita ingresar un número (1-10) entero. Visualizar el
   número en romanos.
 */

public class sesion4B {
    public static void main(String[] args) {
        //Declarando las variables a utilizar:
        int number = 0;
        String romano = " ";
        //Instanciando el objeto de lectura:
        Scanner lectura = new Scanner(System.in);
        //Solicitando Ingreso de datos:
        System.out.println("Hola! Por favor, ingresa un número del 1 al 10");
        number = lectura.nextInt(); 
        switch (number){
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
            default: 
                romano = Integer.toString(number);
                System.out.println("El numero que ingresaste no está dentro del 1 al 10 porque ingresaste el: " + romano);
                
        }
        if(number>0 && number <11){
            System.out.println("El numero que ingresaste se escribe en numeros romanos así: " + romano);
        }else{
            System.out.println(" ");
        }   
    }
    
}
