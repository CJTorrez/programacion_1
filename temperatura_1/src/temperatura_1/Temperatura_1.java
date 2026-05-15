/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura_1;

import java.util.Scanner;
/**
 *
 * @author javier
 */

/**
 *  1. Estructuras de Secuencia
 *      Declaracion de Variables
 *      Orden de Instrucciones
 *      Salida y Lectura de Datos
 *  2. Estructuras de Seleccion
 *      Simple, Doble, Multiple, Anidado
 * 
 * 3. Estructuras de Repeticion (Finito o "Infinito")
 *      a. While (Contador, Centinela)
 *      b. Do While (Contador, Centinela)
 *      d. For (Contador)
 * 
 * Partes de una Estructura de Repeticion
 * 1. Valor Inicial
 * 2. Condicion a Evaluar
 * 3. Modificador de los valores inciales
 * 4. Instrucciones que se repiten
 */

public class Temperatura_1 {

    /**
     * @param args the command line arguments
     */
    /**
     * Desarrollar un algoritmo en la que me permita hacer la conversion
     * de temperatura ingresada en grados farenheit para saber su valor
     * en grados Celsius. Los valores de la temperatura que se ingresan
     * tienen que estar siempre abajo de 150.
     * 
     * De esta manera se puede llevar un control general de las temperaturas
     * registradas a lo largo de la semana y obtener
     * el promedio general de temperatura.
     * 
     * Tareas:
     * 1. Capturar temperatura Farenheit
     * 2. Convertir temperatura Farenheit a Celsius
     * 3. Comprobar o mostrar resultado
     * 4. Registrar 7 temperaturas
     * 5. Calcular el promedio
     * 6. Mostrar el promedio general
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double tempFaren = 0;
        double tempCels = 0;
        double acumulador = 0;
        double promedio = 0;
        
        int dia = 1;//Valor Inicial
        //Condicion
        while(dia <= 7){
            //Instrucciones que se repiten
            System.out.println("\nDia: "+dia);
            
            System.out.println("Calculadora de Conversiones");
            
            //Validacion de Parametros
            do{
                System.out.print("Dime la lectura del termometro Farenheit: ");
                tempFaren = input.nextDouble();
                if(tempFaren>150){
                    System.out.println("\u001b[1;31mValor no permitido...\u001b[0m");
                    System.out.println("\u001b[31mIngresarlo nuevamente\u001b[0m");
                    System.out.println("tiene que estar abajo de 150");
                    System.out.println("");
                }//Fin del IF
                
            }while(tempFaren >150);//Fin del Do While

            //(32 °F − 32) × 5/9 = 0 °C
            tempCels = (5.0/9.0) * (tempFaren - 32);
        
            //Concepto de Acumulador
            acumulador = acumulador + tempCels;
            System.out.println("--------------------------");
            System.out.printf("Dia: %d\t Acumulador: %.2f%n",dia,acumulador);
            System.out.println("--------------------------");
            
            System.out.println("Valores de Temperatura");
            System.out.printf("Temp Farenheit %.2f",tempFaren);
            System.out.printf("\nTemp Celsius %.2f",tempCels);
            
            //Modificador
            dia++; //Sumando de uno en uno -> dia = dia + 1
            
        }//Fin de While 
        
        dia--;//-- va restando de uno en uno
        promedio = acumulador /  dia;
        System.out.printf("\nPromedio divido por %d: %.2f",dia,promedio);
        
        promedio = acumulador /  7;
        System.out.printf("\nPromedio divido por 7: %.2f",promedio);
         /*
            Comparacion de Ciclos
            While y Do While
        El ciclo se repite siempre y cuando
        la condicion se mantenga verdadera,
        caso contrario (falso) se termina el ciclo
        de repeticion.
        */
        /*
        int numWHILE = 10;
        int numDOWHILE = 10;
        
        System.out.println("Ciclo While");
        while (numWHILE<5){
            System.out.println(""+numWHILE);
            numWHILE++;
        }//Fin de While
        
        System.out.println("\nCiclo Do While");
        do{
            System.out.println(""+numDOWHILE);
            numDOWHILE++;
        }while(numDOWHILE<5);
        */      
             
    }//Fin de Main
    
}//Fin de Class
