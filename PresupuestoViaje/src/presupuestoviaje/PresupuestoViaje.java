/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presupuestoviaje;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class PresupuestoViaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String pais = "hn";
        int duracion_vacaciones = 0;
        double costo_vuelo = 0;
        double presupuesto_gasto_diario = 0;
        double gastos_de_viaje = 0;
        double total_viaje_vuelo = 0;
        // TODO code application logic here
        
        System.out.println("-------------------------------------------------");
        System.out.println("Hola\tEstas frete la aplicaion \tAventura Express");
        System.out.println("-------------------------------------------------");
        
        //2da Tarea:Captura del Destino
        System.out.printf("Dime tu lugar de viaje: ");
        pais = scan.nextLine();
        System.out.println("Pais: " + pais);
        
        //3ra Tarea: Duración del Viaje
        System.out.printf("Duracion del viaje en dias: ");
        duracion_vacaciones = scan.nextInt();
        System.out.println("Duracion en dias: " + duracion_vacaciones);
        
        //4ta Tarea: Captura de Costo del Vuelo
        System.out.printf("Cues es tu presupuesto para el vuelo: ");
        costo_vuelo = scan.nextDouble();
        System.out.println("presupuesto: " + costo_vuelo);
        
        System.out.printf("Cues es tu presupuesto para el viaje: ");
        presupuesto_gasto_diario = scan.nextDouble();
        System.out.println("presupuesto: " + presupuesto_gasto_diario);
        
        /*5ta Tarea: Calculo de Costo
        Cálculo de Estancia Calcula el costo total de la 
        estancia multiplicando los días por el gasto diario. 
        Guarda el resultado en una nueva variable decimal 
        llamada costoEstancia.
        */
        System.out.println("\n");        
        gastos_de_viaje = duracion_vacaciones * presupuesto_gasto_diario;
        System.out.println("El total de gastos para el viaje: " + gastos_de_viaje);
        
        
        //Tarea 6: Subtotal del Viaje
        //Calcula la suma del costoEstancia y el precio del vuelo.
        total_viaje_vuelo = gastos_de_viaje + costo_vuelo;
        System.out.println("El total general de gastos para el viaje: " + total_viaje_vuelo);
        
        // Tarea 7. y tarea 9
        //Impuesto de reservacion
        // Gastos totales
        
        double impuesto_reservacion = 0.05;
        double calculo_impuesto_reservacion = 0;
        double total_mas_impuesto = 0;
        
        calculo_impuesto_reservacion = total_viaje_vuelo * impuesto_reservacion;
        System.out.println("El total de impuesto es: " + calculo_impuesto_reservacion);
         
        total_mas_impuesto = total_viaje_vuelo + calculo_impuesto_reservacion;
        System.out.println("El total a pagar con el impuesto es de " + total_mas_impuesto);
         
        // Tarea 10
       /* System.out.println("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Resumen de gastos ");
        System.out.println("-------------------------------------------------");
        System.out.printf("%nSu destino es: %s", pais);
        System.out.printf("%nSus dias de vaiaje son: %d", duracion_vacaciones);
        System.out.printf("%nEl costo de estancia es: %.2f", gastos_de_viaje);
        System.out.printf("%nSu costo de vuelo es: %.2f %n", costo_vuelo);
        System.out.println("El total de impuesto es: " + calculo_impuesto_reservacion);
        System.out.printf("%nEl total a pagar es: %.2f%n", total_mas_impuesto);
        System.out.println("-------------------------------------------------");*/
        
        System.out.println("\n\n");
        System.out.println("-------------------------------------");
        System.out.println("Resumen de gastos");
        System.out.println("-------------------------------------");

        System.out.printf("%-25s %10s%n", "Su destino es:", pais);
        System.out.printf("%-25s %10d%n", "Sus dias de viaje son:", duracion_vacaciones);
        System.out.printf("%-25s %10.2f%n", "El costo de estancia es:", gastos_de_viaje);
        System.out.printf("%-25s %10.2f%n", "Su costo de vuelo es:", costo_vuelo);
        System.out.printf("%-25s %10.2f%n", "El total de impuesto es:", calculo_impuesto_reservacion);
        System.out.printf("%-25s %10.2f%n", "El total a pagar es:", total_mas_impuesto);
        System.out.println("-------------------------------------");

    }
    
}
