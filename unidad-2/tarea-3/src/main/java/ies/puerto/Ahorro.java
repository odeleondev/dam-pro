package ies.puerto;

import java.util.Scanner;

/**
 * @author odeleondev
 * @version 1.0.0
 */
public class Ahorro {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        float ahorroInicial = 0;
        float suma = 0;
        float aportaciones = 0;
        int contador = 0;
        float ahorroFinal = 0;
        System.out.println("Indique su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("¿Cuánto es la cantidad de dinero que tienes ahorrado?");
        ahorroInicial = teclado.nextFloat();
        teclado.nextLine();

        System.out.println("Hola "+nombre+"!");

        do {
            System.out.println("¿Cuánto dinero desea ahorrar en su cuenta?");
            float ahorroActual = teclado.nextFloat();
            aportaciones = ahorroInicial + ahorroActual;
            if (aportaciones > 0) {
                suma += aportaciones;
                contador++;
                ahorroFinal = ahorroInicial + suma;
                System.out.println("Aportación registrada con exito, su ahorro actual es de "+ aportaciones);
            } else {
                System.out.println("La cantidad debe ser positiva, aportación no valida");
            }
        } while
    }
}
