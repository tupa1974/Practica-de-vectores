
package ejercicio.pkg3;


public class Ejercicio3 {

    /**
     Se tienen tres vectores. En el primero de ellos se guarda un número de
     * dni, en el segundo un nombre y en el tercero un apellido. Se desea un
     * programa que sea capaz de recorrer los tres vectores AL MISMO TIEMPO y
     * mostrar cada uno de estos datos por pantalla. Pista: tener en cuenta que
     * el índice de cada vector es correspondiente al índice de los demás, es
     * decir, los datos contenidos en el índice cero del vector de dni, se
     * corresponde con el índice cero del vector de nombres y el de apellidos.
     */
    public static void main(String[] args) {
        int dni[] = {33444555, 22333444, 44555666};
        String nombre[] = {"María", "José", "Juan"};
        String apellido[] = {"Estuardo", "Bonaparte", "de los Palotes"};
        
        for (int i = 0; i < 3; i++){
            System.out.println(dni[i] + " " + nombre[i] + " " + apellido[i]);
        }
    
    }
    
}
