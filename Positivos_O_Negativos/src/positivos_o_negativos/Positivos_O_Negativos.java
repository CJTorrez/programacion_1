/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivos_o_negativos;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Positivos_O_Negativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        int numero = 1;

        int positivos = 0;
        int negativos = 0;

        while (numero != 0) {

            System.out.print("Ingrese un numero o (0 para salir): ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("---------- RESULTADOS ---------");
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
    }
}