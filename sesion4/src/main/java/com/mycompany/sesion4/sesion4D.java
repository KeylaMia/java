package com.mycompany.sesion4;
import java.util.Scanner;

/**
 * @Keyla Jimenez 
 * Crear un programa que permita ingresar un número (1,2,3,4,6,12) entero. Visualizar
   el nombre del periodo
 */

public class sesion4D {
    public static void main(String[] args) {
        //Declarando las variables a utilizar:
        int number = 0;
        String periodo= " ";
        //Instanciando el objeto de lectura:
        Scanner lectura = new Scanner(System.in);
        //Solicitando Ingreso de datos:
        System.out.println("Hola! Por favor, ingresa uno de estos numeros 1,2,3,4,6,12 para conocer el nombre del periodo: ");
        number = lectura.nextInt(); 
        switch (number){
            case 1:
                periodo = "MENSUAL";
                System.out.println("El nombre del periodo se llama: " + periodo);
                break;
            case 2:
                periodo = "BIMESTRAL";
                System.out.println("El nombre del periodo se llama: " + periodo);
                break;
            case 3:
                periodo = "TRIMESTRAL";
                System.out.println("El nombre del periodo se llama: " + periodo);
                break;
            case 4:
                periodo = "CUATRIMESTRAL";
                System.out.println("El nombre del periodo se llama: " + periodo);
                break;
            case 6:
                periodo = "SEMESTRE";
                System.out.println("El nombre del periodo se llama: " + periodo);
                break;
            case 12:
                periodo = "ANUAL";
                System.out.println("El nombre del periodo se llama: " + periodo);
                break;
            default: 
                periodo = Integer.toString(number);
                System.out.println("El numero que ingresaste no está dentro de las opciones porque ingresaste el: " + periodo);
                
        } 
    }
}
