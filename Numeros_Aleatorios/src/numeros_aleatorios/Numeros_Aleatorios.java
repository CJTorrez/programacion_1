/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros_aleatorios;

import java.util.Random;

/**
 *
 * @author javier
 */
public class Numeros_Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();

        int numero = 0;

        int sumaPares = 0;
        int sumaImpares = 0;

        int contadorPares = 0;
        int contadorImpares = 0;

        int contador = 1;

        do {
            numero = rd.nextInt(10) + 1;
            System.out.println("Numero generado: " + numero);

            if (numero % 2 == 0) {
                sumaPares += numero;
                contadorPares++;

            } else {
                sumaImpares += numero;
                contadorImpares++;
            }

            contador++;

        } while (contador <= 25);

        System.out.println("------------- RESULTADOS---------");

        System.out.println("Cantidad de numeros pares: " + contadorPares);
        System.out.println("Suma de pares: " + sumaPares);

        System.out.println("--------------------------------");

        System.out.println("Cantidad de numeros impares: " + contadorImpares);
        System.out.println("Suma de impares: " + sumaImpares);
    }
}