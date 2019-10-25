/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicioDos {
    /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombre
    ingreso de ciudad de nacimiento
    ingreso de edad
    ingreso de costo de matricula
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Datos Personales:
    Nombre:
    Apellido:
    Ciudad de Nacimiento:
    Edad:
    Matricula:
    */
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        String ciudadNacimiento;
        int edad;
        double matricula;
        
        System.out.println("Ingrese sus nombres");
        nombres = entrada.nextLine();
        System.out.println("Ingrese sus ciudad de nacimiento");
        ciudadNacimiento = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese su valor de matrícula");
        matricula = entrada.nextDouble(); // ingreso de decimales
        
        System.out.printf("Datos Personales:\nNombres: %s\nCiudad de nacimiento"
                + ": %s\nEdad: %d\nMatricula: %f\n", nombres, ciudadNacimiento,
                edad, matricula);
        
        
        
        
            
        
        
             
        
        
       
    
    }    
    
    
}
