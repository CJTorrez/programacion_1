/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajerosupermercado;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class CajeroSupermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);

        double precio = 0;
        double subtotal = 0;
        double isv = 0;
        double total = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese el precio del producto: L ");
            precio = sc.nextDouble();

            subtotal += precio;

            System.out.printf("Subtotal actual: L %.2f%n", subtotal);
            System.out.println("--------------------------------");
        }

        isv = subtotal * 0.15;
        total = subtotal + isv;

        System.out.println("\n========= FACTURA =========");
        System.out.printf("Subtotal: L %.2f%n", subtotal);
        System.out.printf("ISV (15%%): L %.2f%n", isv);
        System.out.printf("Total a pagar: L %.2f%n", total);
    }
    
}