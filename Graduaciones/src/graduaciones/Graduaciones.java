/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graduaciones;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Graduaciones {

    /**
     * @param args the command line arguments
     */
    /* Desarrollar una algoritmo que tenga la capasidad que tenga la capaacidad de sacar el promedio final de tres asignaturas 
    diferentes, para cada asignatura debera de ingresar una nota acumulativa y una nota de exaamen
    
    nota acumalativo 40 notaa examen 30
    
    determinar si esta aprobado con 65 minimo
     con las notas finales sacar el promedio final del perido, si el promedio final es arriba de 95 mensaje "Suma CumLaude"
    90 Magna CumLaude
    85 Cumlaude
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

        String clase;
        double notaAcumulativo;
        double notaExamen;
        double notaFinal;
        double sumaNotas = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.print("Ingrese el nombre de la clase: ");
            clase = sc.next();

            System.out.print("Ingrese nota acumulativa: ");
            notaAcumulativo = sc.nextDouble();

            System.out.print("Ingrese nota examen: ");
            notaExamen = sc.nextDouble();

            notaFinal = notaAcumulativo + notaExamen;

            System.out.println("La nota final de " + clase + " es: " + notaFinal);

            if (notaFinal >= 65) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }

            sumaNotas = sumaNotas + notaFinal;
        }

        double promedioFinal = sumaNotas / 3;

        System.out.println("\nPromedio final del periodo: " + promedioFinal);

        if (promedioFinal >= 95) {
            System.out.println("Suma Cum Laude");
        } else if (promedioFinal >= 90) {
            System.out.println("Magna Cum Laude");
        } else if (promedioFinal >= 85) {
            System.out.println("Cum Laude");
        } else {
            System.out.println("Sin mension honorifica");
        }

    }
}




/*  // Echa con una IA
import java.util.Scanner;

public class PromedioFinalAsignaturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String clase;
        double notaAcumulativo;
        double notaExamen;
        double notaFinal;
        double sumaNotasFinales = 0;
        double promedioFinal;

        final int NOTA_MINIMA = 65;

        for (int i = 1; i <= 3; i++) {

            System.out.println("\n=================================");
            System.out.println("Ingreso de datos de la clase #" + i);
            System.out.println("=================================");

            System.out.print("Ingrese el nombre de la clase: ");
            clase = sc.next();

            // Validación nota acumulativa
            do {
                System.out.print("Ingrese la nota acumulativa (0 - 60): ");
                notaAcumulativo = sc.nextDouble();

                if (notaAcumulativo < 0 || notaAcumulativo > 60) {
                    System.out.println("Error: la nota acumulativa debe estar entre 0 y 60.");
                }

            } while (notaAcumulativo < 0 || notaAcumulativo > 60);

            // Validación nota examen
            do {
                System.out.print("Ingrese la nota de examen (0 - 40): ");
                notaExamen = sc.nextDouble();

                if (notaExamen < 0 || notaExamen > 40) {
                    System.out.println("Error: la nota de examen debe estar entre 0 y 40.");
                }

            } while (notaExamen < 0 || notaExamen > 40);

            // Cálculo nota final
            notaFinal = notaAcumulativo + notaExamen;

            System.out.printf("La nota final de %s es: %.2f%n", clase, notaFinal);

            // Validar aprobado o reprobado
            if (notaFinal >= NOTA_MINIMA) {
                System.out.println("Estado: APROBADO");
            } else {
                System.out.println("Estado: REPROBADO");
            }

            sumaNotasFinales += notaFinal;
        }

        // Promedio final del periodo
        promedioFinal = sumaNotasFinales / 3;

        System.out.println("\n=================================");
        System.out.printf("Promedio final del periodo: %.2f%n", promedioFinal);

        // Reconocimiento académico
        if (promedioFinal >= 95) {
            System.out.println("Reconocimiento: Suma Cum Laude");
        } else if (promedioFinal >= 90) {
            System.out.println("Reconocimiento: Magna Cum Laude");
        } else if (promedioFinal >= 85) {
            System.out.println("Reconocimiento: Cum Laude");
        } else {
            System.out.println("Reconocimiento: Ninguno");
        }

        System.out.println("=================================");

        sc.close();
    }
}*/