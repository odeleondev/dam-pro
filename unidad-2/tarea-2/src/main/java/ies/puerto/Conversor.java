package ies.puerto;

import java.util.Scanner;

/**
 * @author odeleondev
 * @version 1.0.0
 */
public class Conversor {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("      CONVERSOR DAM-PRO      ");
        System.out.println("=============================");

        System.out.println("Introduzca su nombre:");
        String nombre = teclado.nextLine();

        System.out.println("Elija una de las siguientes opcione para continuar:");
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Pasar de kilometros a metros");
            System.out.println("2. Pasar de metros a centimtros");
            System.out.println("3. Pasar de metros a millas");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            if (opcion >= 5) {
                System.out.println("Opción incorrecta");
                return;
            }
            
        }



    }

}
