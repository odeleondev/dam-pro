package ies.puerto;

import java.util.Scanner;

/**
 * @author odeleondev
 * @version 1.0.0
 */
public class Conversor {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("      CONVERSOR DAM-PRO      ");
        System.out.println("=============================");

        System.out.println("Introduzca su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Elija una de las siguientes opcione para continuar:");
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Pasar de kilómetros a metros");
            System.out.println("2. Pasar de metros a centimtros");
            System.out.println("3. Pasar de metros a millas");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            if (opcion >= 5) {
                System.out.println("Opción incorrecta");
                return;
            }
            if (opcion == 1) {
                System.out.println("Indique la cantidad de kilómetros:");
                float kilometros = scanner.nextInt();
                System.out.println(kilometros +" kilómetros son "+ kilometros * 1000 +" metros");
                return;
            }
            if (opcion == 2) {
                System.out.println("Indique la cantidad de metros:");
                float metros = scanner.nextInt();
                System.out.println(metros +" metros son "+ metros * 100 +" centimetros");
                return;
            }
            if (opcion == 3) {
                System.out.println("Indique la cantidad de metros:");
                float metros = scanner.nextInt();
                System.out.println(metros +" metros son "+ metros / 1609 +" millas");
                return;
            }
            if (opcion == 4) {
                System.out.println("Salida exitosa del programa");
                return;
            }
        }
    }
}
