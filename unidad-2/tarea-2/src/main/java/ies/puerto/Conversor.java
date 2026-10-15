package ies.puerto;

import java.util.Scanner;

/**
 * @author odeleondev
 * @version 1.0.0
 */
public class Conversor {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int conversiones = 0;
        int opcion = 0;
        System.out.println("=============================");
        System.out.println("      CONVERSOR DAM-PRO      ");
        System.out.println("=============================");
        System.out.println("Introduzca su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Biendenido/a "+ nombre);
        System.out.println("¿Cuantas conversiones deseas realizar?:");
        conversiones = teclado.nextInt();

        for (int i = 1; i <=conversiones ; i++) {
            System.out.println("Conversión "+i);
            teclado.nextLine();
            System.out.println("1. Pasar de kilómetros a metros");
            System.out.println("2. Pasar de metros a centimtros");
            System.out.println("3. Pasar de metros a millas");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            if (opcion >= 5) {
                System.out.println("Opción incorrecta");
                return;
            }
            if (opcion == 1) {
                System.out.println("Indique la cantidad de kilómetros:");
                float kilometros = teclado.nextInt();
                System.out.println(kilometros +" kilómetros son "+ kilometros * 1000 +" metros");
                if (opcion == 4) {
                    return;
                }
            }
            if (opcion == 2) {
                System.out.println("Indique la cantidad de metros:");
                float metros = teclado.nextInt();
                System.out.println(metros +" metros son "+ metros * 100 +" centimetros");
                if (opcion == 4) {
                    return;
                }
            }
            if (opcion == 3) {
                System.out.println("Indique la cantidad de metros:");
                float metros = teclado.nextInt();
                System.out.println(metros +" metros son "+ metros / 1609 +" millas");
                if (opcion == 4) {
                    return;
                }
            }
            if (opcion == 4) {
                System.out.println("Salida exitosa del programa");
                return;
            }
        }
        System.out.println("==================");
        System.out.println("Usuario: "+nombre);
        System.out.println("Conversiones realizadas: "+conversiones);
        System.out.println("Gracias por utilizar CONVERSOR DAM-PRO");
        System.out.println("==================");
    }
}
