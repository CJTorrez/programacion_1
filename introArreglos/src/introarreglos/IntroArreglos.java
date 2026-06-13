/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introarreglos;

import java.util.Random;

/**
 *
 * @author javier
 */
public class IntroArreglos {

    /**
     * @param args the command line arguments
     */
    /* Desallorrar un un aalgoritmo que permita rregistara la caantidad de agua que esta cayyendo sobre la capital en un lapto de una semana
    El prposito es determinaar, el dia que mas llueve, el dia que menos llueve y el promedio de agua que cae sobre la ciudad aa lo largo de la semana
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arreglo1;
        arreglo1 = new int[5];
        double[] arreglos = new double[10];
        char[] arreglo3 = {'1','2','3'};
        boolean[] aarreglo4 = new boolean[]{true,false,true};
        
        
        Random rand = new Random();
        final int DIM = 7;
        
        int MAX = 300;
        int MIN = 0;
        int[] cantidadAgua = new int[DIM];
        
        int cantidadAguaMAX = MIN;
        int cantidadAguaMIN = MAX;
        int acumuladorAgua = 0;
        double promedioAgua = 0;
        
        for(int i = 0; i < DIM; i++){
            cantidadAgua[i]=0;
           // System.out.printf("%d%n",cantidadAgua[i]);
        }
        
        for (int i=0; i<DIM; i++){
            cantidadAgua[i] = rand.nextInt(MIN,MAX);
            acumuladorAgua += cantidadAgua[i];
        }

        for(int i=0; i<DIM; i++){
            System.out.printf("Indice: %d%n",i);
            System.out.printf("Posicion: %d%n",i+1);
            System.out.printf("Dato: %d%n",cantidadAgua[i]);
            System.out.printf("------------------------%n");
        }

        for(int i = 0; i< DIM; i++){
            if(cantidadAguaMIN>cantidadAgua[i]){
                cantidadAguaMIN = cantidadAgua[i];
            }
            
            if(cantidadAguaMAX<cantidadAgua[i]){
                cantidadAguaMAX = cantidadAgua[i];
            }
        }
        
        promedioAgua = (double)acumuladorAgua / DIM;
        System.out.println("Valoress maximos y minimos");
        System.out.printf("MIN: %d\t  MAX: %d%n",cantidadAguaMIN,cantidadAguaMAX);
        System.out.printf("Promedio: %.2f%n",promedioAgua);
        
    }
}
