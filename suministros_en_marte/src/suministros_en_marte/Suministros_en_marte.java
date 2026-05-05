/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suministros_en_marte;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Suministros_en_marte {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int COLONOS = 12;  
        final double CAPACIDAD_TANQUE = 500.0;
        
        int codigoContenedor = 0;
        int raciones = 0;
        
        double comidaPorColono = 0.0;
        double litrosAgua = 0.0;
        boolean presionSuficiente = false;

        System.out.println("\n=====================================");
        System.out.print("Ingrese el codigo del contenedor: ");
        codigoContenedor = sc.nextInt();

        System.out.println("\n=====================================");
        System.out.print("Ingrese unidades de raciones de comida: ");
        raciones = sc.nextInt();

        System.out.println("\n================================================");
        System.out.print("Ingrese la presion del tanque de agua (Ejm. 0.75): ");
        double fraccionAgua = sc.nextDouble();
        if (fraccionAgua >= 1){
          
            comidaPorColono = (double) raciones / COLONOS;
            litrosAgua = CAPACIDAD_TANQUE * fraccionAgua;
            presionSuficiente = litrosAgua >= CAPACIDAD_TANQUE;
        
            System.out.println("\n=================================");
            System.out.println("    REPORTE DE SUMINISTROS       ");
            System.out.println("       COLONIA MARTE             ");
            System.out.println("=================================");
            System.out.printf("%-22s %10d %n", "Contenedor:", codigoContenedor);
            System.out.printf("%-22s %10d %n", "Raciones:", raciones);
            System.out.printf("%-22s %10.2f %n", "Fraccion agua:", fraccionAgua);
            System.out.printf("%-22s %10.2f %n", "Litros agua:", litrosAgua);
            System.out.printf("%-22s %10.2f %n", "Raciones por colono:", comidaPorColono);
            System.out.println("=================================");
        
        if (presionSuficiente) {
            System.out.println("ESTADO AGUA: SUFICIENTE ");
        } 
            System.out.println("=================================");       
        }
        else {
            System.out.println("ESTADO AGUA: INSUFICIENTE. ABORTANDO MISION MARTE ");
        } 
        
    }
    
}
