/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control_de_acceso;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Control_de_acceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        int edad;
        int autorizacion;

        System.out.println("-----------------------------------");
        System.out.println("CONTROL DE ACCESO AL EDIFICIO");
        System.out.println("-----------------------------------");

        System.out.print("Ingrese la edad de la persona: ");
        edad = sc.nextInt();

         System.out.print("Tiene autorizacion (1 = si / 0 = no): ");
        autorizacion = sc.nextInt();

        if (edad >= 18) {
            System.out.println("\nLa persona es mayor de edad.");
        } else {
            System.out.println("\nLa persona es menor de edad.");
        }
        if (edad >= 18) {
            System.out.println("Puede intentar ingresar al edificio.");
        } else {
            System.out.println("Acceso restringido.");
        }
        
        System.out.println("\n--------- RESULTADO---------");

        if (edad < 18) {
            System.out.println("Acceso denegado por ser menor de edad.");
        } else if (edad >= 18 && autorizacion == 1) {
            System.out.println("Acceso permitido.");
        } else if (edad >= 18 && autorizacion == 0 ) {
            System.out.println("Acceso denegado por falta de permiso.");
        } else {
            System.out.println("No tienes autorización.");
        }
    }
}
