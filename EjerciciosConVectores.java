
package ejercicios.con.vectores;

import java.util.Scanner;

public class EjerciciosConVectores {

    /*
    Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100. 
    Realizar un programa que permita la carga por teclado de los 10 números solicitados.
    */

    public static void main(String[] args) {
        System.out.println("Ingrese un número entre 1 y 100 (incluídos estos)");
         int vector[] = new int [10];
         Scanner teclado = new Scanner(System.in);
         
         for (int i = 0; i < 10; i++){
                System.out.println("Ingrese un número entre 1 y 100 (incluídos estos)");
                vector[i] = teclado.nextInt();
         }
        
    }
    
}
