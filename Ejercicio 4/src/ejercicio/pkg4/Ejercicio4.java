package ejercicio.pkg4;

public class Ejercicio4 {

    /*
    En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23 provincias
    argentinas en el último mes. A partir de esta información, un noticiero desea determinar 
    el top 5 de las temperaturas más altas para poder mostrar en la pantalla de su programa,
    para ello se necesita un programa que sea capaz de recorrer el vector de temperaturas, 
    determinar las 5 más altas y copiarlas en un nuevo vector de 5 posiciones
     */
    public static void main(String[] args) {
        double provincias[] = {10.8, 33.4, 32.9, 24.6,
            24.6, 23.8, 22.5, 21.6,
            21.4, 21, 20.5, 19.9,
            19.8, 19.7, 18.8, 18,
            16.4, 22.4, 18.2, 16.2,
            15.4, 13.8, 35};
        double masAltas[] = new double[5];
        double cambiador;

        for (int i = 0; i < provincias.length - 1; i++) {
            for (int j = i + 1; j < provincias.length; j++) {
                if (provincias[i] < provincias[j]) {
                    cambiador = provincias[i];
                    provincias[i] = provincias[j];
                    provincias[j] = cambiador;
                }
            }
        }
        System.out.println("Las temperaturas mas altas son :");

        for (int k = 0; k < masAltas.length; k++) {
            masAltas[k] = provincias[k];
            System.out.println(masAltas[k]);
        }

    }

}
