/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarifallamada;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Tarifallamada {

    /**
     * @param args the command line arguments
     *El desarrolllo de uh algoritmo que determine la cantidad monetaria quee se tiene que pagar dee acuerdo
     * al tiempo que se estuvo en llamada y la zona (Local, nacional, internacional)
     * 
     * Mostrar los resultados obtenidos.
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int totalMinutos = 0;
        char tipoLlamada = '@';
        double costoLlamada = 0;
        
        MensajeEntrada();
        
        System.out.println("El costo de la llamada depende de la zona y el tiempo");
        System.out.println("Llamadas locales (L) -> Lps 0.05 x min");
        System.out.println("Llamadas nacionales (N) -> Lps 0.15 x min");
        System.out.println("Lamadas internacionales (I) -> Pls 0.32 x min");
        
        System.out.print("Cuanto duro la llamada: ");
        totalMinutos = sc.nextInt();
        System.out.print("tipo de llamada (L,N,I): ");
        tipoLlamada = sc.next().toUpperCase().charAt(0);
        
        costoLlamada = CalculoConstoLlamada(totalMinutos, tipoLlamada);
        ResultadoFactura(costoLlamada);
        
    }
    
    public static void MensajeEntrada(){
        System.out.println("Esta llamanod al sistema nacional");
        System.out.println("[ara llamadas locales, nacionales, internacionales");
    }
    
    public static double CalculoConstoLlamada(int minutos, char zona){
        double totalTemporal = 0;
        
        switch(zona){
            case 'L':
                 totalTemporal = minutos * 0.05;
                  break;
             case 'N':
                 totalTemporal = minutos * 0.15;
                  break;
             case 'I':
                 totalTemporal = minutos * 0.32;
                  break;
             default:
                 totalTemporal = 0;
                  break;
        }
        return totalTemporal;  
    }

    public static void ResultadoFactura(double costo){
    System.out.println("Esta es tu factura de llamada");
    System.out.println("El valor refleja de acuerdo a la cantidad de minutos y zona");
    System.out.println("que hablaste");
    System.out.printf("Valor: %.2f", costo);
    }
    
}