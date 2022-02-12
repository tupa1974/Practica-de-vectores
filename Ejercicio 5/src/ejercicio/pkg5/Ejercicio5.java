package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    /*
    Se necesita un vector que permita cargar por teclado el nombre de 10 animales.
    A partir de esta carga, se desea otro vector que copie los mismos nombres pero en el orden inverso, 
    es decir, si los nombres son: perro, gato, lagartija, el nuevo vector debe contener: lagartija, gato, 
    perro. Una vez realizado el cambio, mostrar por pantalla ambos vectores para compararlos.
     */
    public static void main(String[] args) {

        String animales[] = new String[10];
        String animalesInverso[] = new String[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre de un animal");
            animales[i] = teclado.nextLine();
            animalesInverso[10 - 1 - i] = animales[i];
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(animales[j] + " ---- " + animalesInverso[j]);
        }
    }

}
