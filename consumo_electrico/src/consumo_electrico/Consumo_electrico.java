/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumo_electrico;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Consumo_electrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double watts = 0;
        double horas = 0;
        double consumoDiario = 0;
        double consumoMensual = 0;
        double costo = 0;

        // 1. Captura
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Marca del electrodomestico: ");
        String marca = sc.nextLine();

        System.out.print("Consumo en Watts: ");
        watts = sc.nextDouble();

        System.out.print("Horas de uso al dia: ");
        horas = sc.nextDouble();

        // 2. Procesamiento
        consumoDiario = (watts * horas) / 1000;
        consumoMensual = consumoDiario * 30;
        costo = consumoMensual * 0.15;

        // 3. Impresión
        System.out.println("\n========= REPORTE =========");
        System.out.printf("%-25s %s%n", "Usuario:", nombre);
        System.out.printf("%-25s %s%n", "Electrodomestico:", marca);
        System.out.printf("%-25s %.2f kWh%n", "Consumo diario:", consumoDiario);
        System.out.printf("%-25s %.2f kWh%n", "Consumo mensual:", consumoMensual);
        System.out.printf("%-25s L. %.2f%n", "Total a pagar:", costo);
    }
}