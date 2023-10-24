/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcarreglos;

import java.util.Scanner;
/**
 *
 * @author Usuario Cesar Arcos Ortega
 */
public class CalcArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner calculadora = new Scanner(System.in);       
     double[] elemento = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        
     System.out.println("Bienvenido, elige una opcion");
     System.out.println("1. Sumar");
     System.out.println("2. Multiplicar");   
     System.out.println("3. Salir");
        
     int num = calculadora.nextInt();      
        
        switch (num) {
            case 1:
                double suma = 0;
                for (int i = 0; i < elemento.length; i++) {
                    suma += elemento[i];
                    System.out.println("La suma es " + suma);
                }
                
                break;
            case 2:
                double multiplicacion = 1.0;
                for (int i = 0; i < elemento.length; i++) {
                    multiplicacion *= elemento[i];
                    System.out.println("La multiplicación es:* " + multiplicacion);
                }
                
                break;
            case 3: 
                System.out.println("salir de la calculadora");
                break;
                
            default:
               
                System.out.println("La opcion no es valida");
                break;

        }
    }

}