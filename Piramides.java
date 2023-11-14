
package piramides;
import java.util.Scanner;
/**
 *
 * @author Cesar Arcos Ortega
 */
public class Piramides {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de filas de la piramide: ");
        int numFilas = sc.nextInt();
        System.out.println("Seleccione el tipo de piramide: ");
        System.out.println("1. Piramide de asteriscos");
        System.out.println("2. Piramide de letras");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            piramideAsteriscos(numFilas);
        } else if (opcion == 2) {
            piramideLetras(numFilas);
        } else {
            System.out.println("Opción inválida");
            
   }
    }

    public static void piramideAsteriscos(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void piramideLetras(int n) {
        char letra = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(letra);
            }
            System.out.println();
            letra++;
        }
    }
}