/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiro_parabolico_implificado;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class tiro_parabolico_simplificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        final double G = 9.81;
        double velocidad_inicial = 0.0;
        double angulo_grados = 0.0;
        double angulo_radio = 0.0;
        double distancia = 0.0;

        System.out.print("Ingrese la velocidad inicial (m/s): ");
        velocidad_inicial = sc.nextDouble();

        System.out.print("Ingrese el angulo de lanzamiento (grados): ");
        angulo_grados = sc.nextDouble();

        angulo_radio = Math.toRadians(angulo_grados);

        distancia = (Math.pow(velocidad_inicial, 2) * Math.sin(2 * angulo_radio)) / G;
        
        System.out.println("\n========= RESULTADO =========");
        System.out.printf("Velocidad: %.2f m/s%n", velocidad_inicial);
        System.out.printf("Angulo: %.2f grados%n", angulo_grados);
        System.out.printf("Distancia alcanzada: %.2f metros%n", distancia);
    }
}