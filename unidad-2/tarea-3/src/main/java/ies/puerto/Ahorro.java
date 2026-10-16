package ies.puerto;

import java.util.Scanner;

/**
 * @author odeleondev
 * @version 1.0.0
 */
public class Ahorro {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int ahorro = 0;
        int suma = 0;
        System.out.println("Indique su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("¿Cuánto es la cantidad de dinero que tienes ahorrado?");
        ahorro = teclado.nextInt();

        System.out.println("Hola "+nombre+" !");



    }
}
