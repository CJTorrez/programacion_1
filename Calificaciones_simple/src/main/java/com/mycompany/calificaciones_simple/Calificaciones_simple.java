/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificaciones_simple;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Calificaciones_simple {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int nota1 = 0;
    int nota2 = 0;
    int nota3 = 0;
    
    System.out.println("Biemvenidos a su sistema de notas");
    
    System.out.println("Dime cunato fue tu 1ra nota");
    nota1 = scan.nextInt();
    
    if(nota1 >= 70){
        System.out.println("Aprobado");
        System.out.println("Tu 1ra nota .. muy bien");
        System.out.println("Sgue asi");
    }
    
    
    // Segunda
    System.out.println("Dime cunato fue tu 2ra nota");
    nota2 = scan.nextInt();
    
    if(nota2 >= 70){
        System.out.println("Aprobado");
        System.out.println("Tu 2ra nota .. muy bien");
        System.out.println("Sgue asi");
    }
    
    // Tercera
    System.out.println("Dime cunato fue tu 3ra nota");
    nota3 = scan.nextInt();
    
    if(nota3 >= 70){
        System.out.println("Aprobado");
        System.out.println("Tu 3ra nota .. muy bien");
        System.out.println("Sgue asi");
    }
    
    
    
    }
}
