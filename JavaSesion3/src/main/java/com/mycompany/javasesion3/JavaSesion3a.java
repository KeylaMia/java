package com.mycompany.javasesion3;
import java.util.Scanner;

/**
 * @author keyla
 * En el ejercicio el estudiante ingresará sus notas y se le indicará mediante el promedio 
 * resultante si ha aprobado o no. 
 */

public class JavaSesion3a {
    public static void main(String[] args) {
    //declarando las variables
    String name; 
    int numeroCursos = 0; 

    //instanciando objeto scanner 
    Scanner lectura = new Scanner(System.in);

    //solicitar datos a usuario 
    System.out.print("Ingrese su Nombre: ");
    name = lectura.nextLine();
    //solicitar la cantidad de cursos del estudiante
    System.out.print("Hola "+ name +" ingrese la cantidad de cursos que esta cursando: ");
    //validación del número ingresado
    while(lectura.hasNext()){
        if(lectura.hasNextInt()){
            numeroCursos = lectura.nextInt();  
            break;
        }else{
            System.out.print("Por favor, ingrese un número de cursos valido:");
            lectura.nextLine();
        }

    }
    double nota = 0; 
    double credito = 0; 
    double promedio = 0;
    double subTotalPromedio =0;
    double totalPromedio = 0; 
    double totalPonderado = 0; 
    String mensaje ;
    String[] mensaje2 = {"Debes repasar mas", "Estas con un puntaje muy bajo. Debes poner mas empeño", " Muy bien, Excelente!"};
    
    for(int i=1; i <= numeroCursos; i++){
        System.out.print("ahora ingrese la " + i +" nota que ha obtenido: ");
        //validación del elemento final del intervalo
        while(lectura.hasNext()){
            if(lectura.hasNextDouble()){
                nota = lectura.nextDouble();  
                break;
            }else{
                System.out.print("Por favor, ingrese un numero valido:");
                lectura.nextLine();
            }
        }
        System.out.print("ahora ingrese la cantidad de creditos del curso: ");
        while(lectura.hasNext()){
            if(lectura.hasNextInt()){
                credito = lectura.nextInt();  
                break;
            }else{
                System.out.print("Por favor, ingrese un número entero valido:");
                lectura.nextLine();
            }
        }
        promedio = credito * nota;
        totalPonderado += credito;
        subTotalPromedio +=  promedio;
        totalPromedio = subTotalPromedio/totalPonderado;
    }
    
    if( totalPromedio > 13 ){
      mensaje = "APROBADO";
      System.out.print(name +", tu promedio ponderado es: " + totalPromedio); 
      System.out.print(" Por la nota ponderada que ha obtenido, usted ha  " + mensaje + " " ); 
      System.out.print(mensaje2[2]);
    }else if(totalPromedio<13 && totalPromedio >11.50 ){
       mensaje = "APROBADO-";
       System.out.print(name +", tu promedio ponderado es: " + totalPromedio); 
       System.out.print(" Por la nota ponderada que ha obtenido, usted ha  " + mensaje + " "); 
       System.out.print(mensaje2[0]); 
    }else {
       mensaje = "DESAPROBADO";
       System.out.print(name +", tu promedio ponderado es: " + totalPromedio); 
       System.out.print(" Por la nota ponderada que ha obtenido, usted ha  " + mensaje + " " ); 
       System.out.print(mensaje2[1]); 
    }
    
}
}
