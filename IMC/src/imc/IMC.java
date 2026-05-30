/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class IMC {

    /**
     * @param args the command line arguments
     * Calcular el Indice dee masa Corporal
     * Edad, peso, estatura
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad = 0;
        int peso = 0;
        double estatura = 0;
        double IMC = 0;
        
        edad = IngresoDatos("Edad");
        peso = IngresoDatos("Peso");
        estatura = IngresoDatos("estatura");
        
        IMC = peso / Math.pow(estatura, 2);
        System.out.printf("tu IMC es: %.2f",IMC);
        
        /*do{
         System.out.print("Ingrese tu edad");
         edad = sc.nextInt();
            if(edad<0){
                System.out.println("Valor tiene que ser mayor a cero");
                System.out.println("ingrese nuevamente");
                }
        } while(edad<0);
          
        do{
            System.out.print("Ingresa tu peso");
            peso = sc.nextInt();
            if(peso<0){
                System.out.println("Valor tiene que ser mayor a cero");
                System.out.println("ingrese nuevamente");
                }
        } while(peso<0);
          
         do{
            System.out.print("Ingresa tu estatura");
            estatura = sc.nextDouble();
            if(estatura<0){
                System.out.println("Valor tiene que ser mayor a cero");
                System.out.println("ingrese nuevamente");
                }
        } while(estatura<0);
        */
            
    }
    
    public static int IngresoDatos(String palabra){
        Scanner scan  = new Scanner(System.in);
        int datoTemporal = 0;
        
        do{
            System.out.printf("Ingresa tu %s:",palabra);
            datoTemporal = scan.nextInt();
            if(datoTemporal<0){
                System.out.println("Valor tiene que ser mayor a cero");
                System.out.println("ingrese nuevamente");
            }
        }while(datoTemporal<0);
        
        return datoTemporal;
    }
    
}//Fina de Class
