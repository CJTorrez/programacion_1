/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suministrosenmarte;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class SuministrosEnMarte {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // 1. Captura
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Marca del electrodomestico: ");
        String marca = sc.nextLine();

        System.out.print("Consumo en Watts: ");
        double watts = sc.nextDouble();

        System.out.print("Horas de uso al dia: ");
        double horas = sc.nextDouble();

        // 2. Procesamiento
        double consumoDiario = (watts * horas) / 1000;
        double consumoMensual = consumoDiario * 30;
        double costo = consumoMensual * 0.15;

        // 3. Impresión
        System.out.println("\n========= REPORTE =========");
        System.out.printf("%-25s %s%n", "Usuario:", nombre);
        System.out.printf("%-25s %s%n", "Electrodomestico:", marca);
        System.out.printf("%-25s %.2f kWh%n", "Consumo diario:", consumoDiario);
        System.out.printf("%-25s %.2f kWh%n", "Consumo mensual:", consumoMensual);
        System.out.printf("%-25s $%.2f%n", "Total a pagar:", costo);
    }
}
