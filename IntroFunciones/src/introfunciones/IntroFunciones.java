/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introfunciones;

/**
 *
 * @author javier
 */
public class IntroFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Correr("Javier");
        System.out.println("");
        Saltar(100);
        System.out.println("");
        Cantar();
        Saludar("Meyson",5);
        
        System.out.println("\n\n");
        Correr("carlos");
        System.out.println("");
        Saltar(99);
        System.out.println("");
        Cantar();
        Saludar("terry",1);
        
    }
    public static void Correr(String nombre){
        System.out.printf("Corre, %s, corre",nombre);
    };
    
    public static void Saltar(int distanciaCm){
     System.out.printf("Y el ganador de la competencia");
     System.out.printf("de salto largo con una distancia de ");
     System.out.printf("%d cm... nuevo record mundial",distanciaCm);
    };
    
    public static void Cantar(){
    System.out.printf("Como lo hace el tenor -figaro, figaro, fiiggaarrroooo ");
    };
    
    public static void Saludar(String mascota, int numVeces){
        System.out.printf("Saludando por %d vez ", numVeces);
        System.out.printf("%n %s la mascota increible", mascota);
    };
}
