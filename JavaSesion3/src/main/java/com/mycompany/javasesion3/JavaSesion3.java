package com.mycompany.javasesion3;
import java.util.Scanner;
/**
 * @author keyla Jimenez Gallegos
 * Este ejercicio busca indicar el promedio final de un estudiante solicitando el ponderado
 * y el valor de cada curso
 */

public class JavaSesion3 {

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
        System.out.print("Hola "+ name +" ingrese la cantidad de cursos que esta cursando ");
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
        for(int i=1; i <= numeroCursos; i++){
            System.out.print("ahora ingrese la " + i +" nota que ha obtenido: ");
            //validación del elemento final del intervalo
            while(lectura.hasNext()){
                if(lectura.hasNextDouble()){
                    nota = lectura.nextDouble();  
                    break;
                }else{
                    System.out.print("Por favor, ingrese un número valido:");
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
        System.out.print(name +", tu promedio ponderado es " + totalPromedio);
    }
}
