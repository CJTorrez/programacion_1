/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadronotasestudintes;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class CuadroNotasestudintes {

    /**
     * Desarrollar un algoritmo que simule la boleta de calificaciones
     * de un estudiante que esta cursando PT/ING en CEUTEC
     * Mostrando el nombre, las notas acumuladas y parciales, nota final
     * Y promedio de periodo.
     * 
     * Boleta de Oscar Andrade
     *                  Acum    Examen  Total   Promedio
     * Programacion I   40      50      90
     * Disenio Web      30      40      70
     * Admin I          50      50      100
     * Espaniol         30      30      60
     * 
     * Promedio: 90
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scan = new Scanner(System.in);
        
        final int FILA = 3;
        final int COLU = 3;
        int[][] notasAsignaturas = new int [FILA][COLU]; //Arreglo Bidimensional
        String[] nombreAsignaturas = new String[FILA]; //Arreglo Unidimensional
        String nombreEstudiante = "John Doe";
        double promedioPeriodo = 0;
        
        //Inicializar
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLU; j++) {
                notasAsignaturas[i][j]= 0;
            }//Fin For COL
        }//Fin For FILA
        
        nombreEstudiante = tratamientoNombre(scan);
        nombreAsignaturas = tratamientoNombreAsignaturas(scan, FILA);
        notasAsignaturas = ingresoNotas(scan, FILA, COLU, nombreAsignaturas);
        
        System.out.println("------------------------");
        System.out.printf("Boleta de %s %n",nombreEstudiante);
        System.out.printf("%-22s %-8s %-8s %s\n", "Asignatura", "Acum", "Examen", "Total");
        System.out.println("");
        
        for(int i = 0; i < FILA; i++){
            System.out.printf("%-15s %-8d %-8d" , 
                        nombreAsignaturas [i],
                        notasAsignaturas [i] [0],
                        notasAsignaturas [i] [1],
                        notasAsignaturas [i] [2]);
            System.out.println("");
        }
        
    }//Fin de Main
    
    /**
     * Funcion que captura el nombre del estudiante y hace 
     * el tratamiento de lo que considera necesario para poder guardarlo
     * en la BD del sistema.
     * 
     * @param  input Parametro de libreria Scanner
     * @return devuelve el nombre ya tratado.
    */
    public static String tratamientoNombre(Scanner input){
        String datoTemporal = "John";
        System.out.println("Cual es tu nombre? ");
        datoTemporal = input.nextLine().toLowerCase();
        return datoTemporal; 
    }//Fin de Funcion tratamientoNombre
    
    public static String[] tratamientoNombreAsignaturas(Scanner input, int DIM){
        String[] temporal = new String[DIM];
        System.out.println("Dime el nombre de las asignaturas");
        for (int i = 0; i < DIM; i++) {
            temporal[i] = input.next().toUpperCase();
        }
        return temporal;
    }
    
    public static int[][] ingresoNotas(Scanner input, int DIM_F, int DIM_C, String nombres[]){
        int[][] temporal = new int[DIM_F][DIM_C];
        
        for(int i = 0; i < DIM_F; i++){
                System. out.printf("Dame el acum y examen de %s%n", nombres [i]) ;
                System. out.print ("Nota Acumulativa: ");
                temporal[i] [0]= input.nextInt();

                System. out.print ("Nota Examen: ");
                temporal[i][1]= input.nextInt();

                temporal[i][2] = temporal [i] [0] + temporal [i] [1];
            }
            return temporal;
        }
}// Fin de Class