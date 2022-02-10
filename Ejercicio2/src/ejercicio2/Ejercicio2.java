
package ejercicio2;


public class Ejercicio2 {

    /*
    En un vector de 15 posiciones se almacenan las edades de 15 alumnos. 
    Se desea un programa que sea capaz de determinar cuál es la mayor edad y
    cuál es la menor edad que se encuentra entre los estudiantes.
    */
    
    public static void main(String[] args) {
        int edadesEstudiantes[] = {23, 22, 21, 26, 29,
                                                       43, 34, 19, 22, 20,
                                                        33, 29, 27, 24, 22,
                                                        23, 24, 24, 16, 29};
        int menor = edadesEstudiantes[0];
        
        for (int i = 0; i < edadesEstudiantes.length; i++){
            if (menor > edadesEstudiantes[i]){
                menor = edadesEstudiantes[i];
            }
        }
        System.out.println("La menor edad entre los estudiantes es de "+ menor + " años");
    }
    
}
