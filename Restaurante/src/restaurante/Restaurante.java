/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc =new Scanner(System.in);
        
        char seleccion_menu = '@';
        int total_dinero = 0;
        double ISV = 0.0;
        int propina = 0;
        int costo_viaje = 0;
        double total_pago = 0;
        double costo_plato = 0;
        
        double subTotal = 0;
        
        
        System.out.println("Sean Bienvenidos a l Derlivery");
        System.out.println("     De progra      ");
        System.out.println("--------------------");
        
        System.out.println("Nuestro menu es el siguiente");
        
        System.out.println("A. Mariscos");
        System.out.println("B. Hamburguesas");
        System.out.println("C. Pollo");
        System.out.println("D. Baleadas");
        System.out.println("E. Sushi");
        System.out.printf("Dime tu seleccion: ");
        
        seleccion_menu = sc.nextLine().toUpperCase().charAt(0); // el numero dentro del parentesis indica la posision a leer de la palabra capturada
        System.out.print("Cuanto dinero andas para comprar: ");
        total_dinero = sc.nextInt();
        System.out.print("\n");
        
        // que es REGEX
        
        switch(seleccion_menu){
            case 'A':
                System.out.println("Seleccionaste Mariscos");
                costo_plato = 450;
                costo_viaje = 50;
                
                subTotal = costo_plato + costo_viaje;
                
                if (total_dinero < subTotal){
                    System.out.println("No hay suficiente dinero para comprar este plato");
                } else {
                    ISV = (costo_plato + costo_viaje) * 0.15;
                    System.out.print("Cuanto dejaras de propina: ");
                    propina = sc.nextInt();
                    
                    total_pago = costo_plato + costo_viaje + ISV + propina;
                    System.out.printf("Total a Pagar %.2f",total_pago);
                }

                break;
            case 'B':
                System.out.println("Seleccionaste Hamburguesas");
                costo_plato = 150;
                costo_viaje = 50;
                subTotal = costo_plato + costo_viaje;
                if (total_dinero < subTotal){
                    System.out.println("No hay suficiente dinero para comprar este plato");
                } else {
                    ISV = (costo_plato + costo_viaje) * 0.15;
                    System.out.print("Cuanto dejaras de propina: ");
                    propina = sc.nextInt();
                    total_pago = costo_plato + costo_viaje + ISV + propina;
                    System.out.printf("Total a Pagar %.2f",total_pago);
                }
                break;
            case 'C':
                System.out.println("Seleccionaste Pollo");
                costo_plato = 115;
                costo_viaje = 15;
                subTotal = costo_plato + costo_viaje;
                 if (total_dinero < subTotal){
                    System.out.println("No hay suficiente dinero para comprar este plato");
                } else {
                    ISV = (costo_plato + costo_viaje) * 0.15;
                    System.out.print("Cuanto dejaras de propina: ");
                    propina = sc.nextInt();
                    total_pago = costo_plato + costo_viaje + ISV + propina;
                    System.out.printf("Total a Pagar %.2f",total_pago);
                }
                break;
            case 'D':
                System.out.println("Seleccionaste Baleadas");
                costo_plato = 20;
                costo_viaje = 5;
                subTotal = costo_plato + costo_viaje;
                if (total_dinero < subTotal){
                    System.out.println("No hay suficiente dinero para comprar este plato");
                } else {
                    ISV = (costo_plato + costo_viaje) * 0.15;
                    System.out.print("Cuanto dejaras de propina: ");
                    propina = sc.nextInt();
                    total_pago = costo_plato + costo_viaje + ISV + propina;
                    System.out.printf("Total a Pagar %.2f",total_pago);
                }
                break;
            case 'E':
                System.out.println("Seleccionaste Sushi");
                costo_plato = 600;
                costo_viaje = 100;
                subTotal = costo_plato + costo_viaje;
                if (total_dinero < subTotal){
                    System.out.println("No hay suficiente dinero para comprar este plato");
                } else {
                    ISV = (costo_plato + costo_viaje) * 0.15;
                    System.out.print("Cuanto dejaras de propina: ");
                    propina = sc.nextInt();
                    total_pago = costo_plato + costo_viaje + ISV + propina;
                    System.out.printf("Total a Pagar %.2f",total_pago);
                }
                
                break;
                
            default:
                System.out.println("Seleccion no valida");   
        }
    }
    
}
