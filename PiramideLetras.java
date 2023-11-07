
package piramideletras;
import java.util.Scanner;
/**
 *
 * @author Cesar Arcos Ortega
 */
public class PiramideLetras {

   
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de lineas para la piramide: ");
        
        int num = scanner.nextInt();
        char[] letras = new char[26];
        for (int i = 0; i < 26; i++) {
            letras[i] = (char) (i + 65);
        }
        printPyramid(num, letras);
    }

    public static void printPyramid(int num, char[] letras) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(letras[j % 26]);
            }
            System.out.println();
        }
    }

 
    }

