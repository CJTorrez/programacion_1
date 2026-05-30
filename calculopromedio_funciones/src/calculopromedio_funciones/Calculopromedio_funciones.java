/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculopromedio_funciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Calculopromedio_funciones {
    

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        
        int acumNotas = 0;
        int numbAleatorio = 0;
        double promedio = 0;
        String nombreCurso = "John Doe";
        int totalEstudiantes = 0;

        MensajeEntrada();
      
        nombreCurso = NombreCurso();
   
        totalEstudiantes = NumeroEstudiantes(scan);

        Separador(nombreCurso);

        acumNotas = GeneracionNumerosAleatorios(totalEstudiantes, rd);
        
        CalculoPromedio(acumNotas, totalEstudiantes, nombreCurso);
    }
    
    public static void MensajeEntrada(){
        System.out.println("Bienvenido a la calculadora de promedios");
        System.out.println("personalizados.");
    }
    
    public static String NombreCurso(){
        StringBuilder resultado = new StringBuilder();
        Scanner input = new Scanner(System.in);
        String nombreTemporal ="Jane Doe";
        
        System.out.print("Dime el nombre del curso: ");
        nombreTemporal = input.nextLine().toUpperCase();
        
        for (int i = 0; i < nombreTemporal.length(); i++) {
            char letra = nombreTemporal.charAt(i);
            
            if(i%2 ==0){
                resultado.append(Character.toUpperCase(letra)); 
            }
            else{
                resultado.append(Character.toLowerCase(letra));
            }
        }
        return resultado.toString();

    }
    
    public static int NumeroEstudiantes(Scanner sc){
        
        int estudiantesTemporal = 0;
        
        do{
            System.out.print("Cuantos estudiantes estan matriculados en el curso? ");
            estudiantesTemporal = sc.nextInt();
            if(estudiantesTemporal <0){
                System.out.println("Tiene que ser mayor a cero");
                System.out.println("Ingrese nuevamente");
            }
        }while(estudiantesTemporal<0);
        
        return estudiantesTemporal;
    }

    public static void Separador(String nombre){
        System.out.println("--------------------");
        System.out.printf("Curso: %s%n",nombre);
        System.out.println("--------------------");
    }
    
    public static int GeneracionNumerosAleatorios(int numEstudiantes, Random rd){
        int numAleatorioTEMP = 0;
        int acumulador = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            numAleatorioTEMP = rd.nextInt(1,101);
            System.out.printf("Estudiante %d\tNota: %d",i+1,numAleatorioTEMP);
            System.out.println("");
            acumulador +=numAleatorioTEMP;
        }//Fin del Ciclo For
        
        return numAleatorioTEMP;
    }
    
    public static void CalculoPromedio(int notas, int estudiantes,String nombre){
        double promedio = 0;
        promedio = (double)notas/estudiantes;
        System.out.printf("Promedio: %.2f",promedio);
        System.out.printf("%nCurso %s",nombre);
    }
}