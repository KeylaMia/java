package com.mycompany.javasesion3;

import java.util.Scanner;

/**
 * @author keyla
 * el ejercicio solicitara que el usuario ingrese tres lados de un triangulo y el programa
 * le debe indicar que tipo de triangulo es
 */

public class JavaSesion3b {
    public static void main(String[] args) {
    //declarando las variables
    String name; 
    double lado1=0;
    double lado2=0;
    double lado3=0;

    //instanciando objeto scanner 
    Scanner lectura = new Scanner(System.in);

    //solicitar datos a usuario 
    System.out.print("Ingrese su Nombre: ");
    name = lectura.nextLine();
    //solicitar el primer lado del triángulo
    System.out.print("Hola "+ name +" ingrese el primer lado del triangulo: ");
    //validación del número ingresado
    while(lectura.hasNext()){
        if(lectura.hasNextDouble()){
            lado1 = lectura.nextDouble();  
            break;
        }else{
            System.out.print("Por favor, ingrese un número valido:");
            lectura.nextLine();
        }

    }
    
    System.out.print("ahora ingrese el segundo lado del triangulo: ");
    //validación del elemento final del intervalo
    while(lectura.hasNext()){
        if(lectura.hasNextDouble()){
            lado2 = lectura.nextDouble();  
            break;
        }else{
            System.out.print("Por favor, ingrese un numero valido:");
            lectura.nextLine();
        }
    }
       
    System.out.print("ahora ingrese el tercer lado del triangulo: ");
    while(lectura.hasNext()){
        if(lectura.hasNextDouble()){
            lado3 = lectura.nextDouble();  
            break;
        }else{
            System.out.print("Por favor, ingrese un numero valido:");
            lectura.nextLine();
        }
    }
    
    if( lado1 == lado2 && lado1== lado3 ){
      System.out.print(name + ", el triangulo es: TRIANGULO EQUILATERO"); 
    }else if( lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
       System.out.print(name + ", el triangulo es: TRIANGULO ISOSCELES"); 
    }else {
       System.out.print(name + ", el triangulo es: TRIANGULO ESCALENO"); 
    }
    
}
}
