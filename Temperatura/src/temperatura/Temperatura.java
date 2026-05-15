/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     * Desarrollar un algoritmo que permita hacer la comversion de  temperatura ingresada en grados celsius para saver su valor en grados farenheit
     * de esta manera se puede llevar un control general de la temperaturas registradas a lo largo de semana y optener el promedio general
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
                 
         double celsius = 0.0;
         double farenheit = 0.0;
                  
         double temperaturaSemana = 0.0;
         double temperaturaPromedio = 0.0;
         int diasContador = 0;
                         
         System.out.println("Hola este un coversor de temperaturas");
         System.out.println("Ingrese el numero de dias");
         diasContador = sc.nextInt();
         
         
        // for (int dias = 1; dias <= 7; dias++) {
         for (int dias = 1; dias <= diasContador; dias++) {

            System.out.print("ingrese cual es laa pemperatura en farenheit: ");
            farenheit = sc.nextDouble();
            celsius = ((farenheit - 32) / 1.8);
            System.out.printf("La temperatura en Celsius es: %.2f%n", celsius);
            
            temperaturaSemana = temperaturaSemana + celsius;
            temperaturaPromedio = temperaturaSemana / dias;
        }     
        System.out.printf("La temperatura promedio de la semana es: %.2f C%n", temperaturaPromedio);
        
       /* 
        int numWhile = 10;
        System.out.println("Ciclo while");
        while (numWhile<5){
        System.out.println(""+numWhile);
        numWhile++;
        }
        do{
            System.out.println(""+numWhile);
            numWhile++;
        }while (numWhile<5);
        */
    }  
}
