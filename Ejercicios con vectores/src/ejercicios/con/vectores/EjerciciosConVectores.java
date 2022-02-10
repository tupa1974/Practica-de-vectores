
package ejercicios.con.vectores;

import java.util.Scanner;


public class EjerciciosConVectores {


    public static void main(String[] args) {
        
        int vector[] = new int [10];
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese un número del 1 al 100 (incluídos estos) ");
            vector[i] = teclado.nextInt();
        }
    }
    
}
