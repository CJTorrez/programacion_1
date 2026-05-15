/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;


/**
 *
 * @author javier
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // comentario de una sola linea
        
        System.out.println("Hola ing.. como esta?"); 
         System.out.println("Yo muy bien"); 
          System.out.print("Tu que tal"); 
           System.out.println(" Como te llamas"); 
            System.out.println("Carlos Javier es mi nombre"); 
            
        /* Comentarios en bloque */
        
        int numero; // para numeros enteros;
        float numerodecimal; // decimales
        double numerodecimal2; // decimales
        boolean estado; //vedadero falso;
        char inicial; //digito letra, caracteres
        String palabra; // para digitor
        
        numero = 10;
        numerodecimal = 3;
        numerodecimal2 = 3.14;
        estado = true;
        inicial = 'q';
        palabra = "hola";
        
        // sot + tab sirver para ataja donde escrivir el system.out.printf("")
        
        // imprimir formateado. 
        System.out.printf("Saludo inicial %s", palabra);
        System.out.println("");
        System.out.printf("%s Saludo Inicial", palabra);
        System.out.println("");
        System.out.printf("Saludo, %s", palabra);
        
        
        System.out.println("Saludo inicial"+palabra);
        System.out.println(palabra+"Saludo inicial");
        System.out.println("Saludo"+palabra+"inicial");
          
          
        System.out.printf("Valores monetarios: %f",numerodecimal2);
        System.out.println("");
        System.out.printf("Valores monetarios: %.2f",numerodecimal2);
        System.out.println("");
        System.out.printf("Valores monetarios: %.4f",numerodecimal2);
        System.out.println("");
           
        System.out.printf("Para iniciales %c",inicial);
        System.out.println("");
        System.out.printf("ara iniciales: %C",inicial);
        System.out.println("");
        
        
        System.out.printf("Numero entero: %d",numero);
        
        System.out.println("");
        
        
        System.out.println("Esto es \n una muestra de\n caracteres de escape");
        System.out.println("Luego tenemos este \t este otro \t caracter de escaepe");
        System.out.println("Y si quieres \"AlGO\" especial usa \" ");
        System.out.println("");
        
        int edad = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cuantos anios tiene?");
        edad = scan.nextInt();
        System.out.printf("%nLa edad que ingresate es de: %d", edad);
        
        String nombre = "John";
        String apellido = "Doe";
        String frase = "No se quien es John Doe";
        
        System.out.print("\nDame un nombre: ");
        nombre = scan.next();
        
        System.out.print("Dame dos apellidos: ");
        apellido = scan.nextLine();  // imprmie los caracteres en blanco mo los espacios
        
        System.out.print("Una Frase JoHN: ");
        frase = scan.nextLine();
        
        System.out.printf("\n%s %s dijo: ",nombre,apellido,frase);
        
        
         
        
    } // fin de la funcion main
    
}// fin de class
