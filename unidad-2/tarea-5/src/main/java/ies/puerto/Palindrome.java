package ies.puerto;

import java.util.Scanner;

/**
 *@author odeleondev
 * @version 1.0.0 8
 */
public class Palindrome {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra o frase a analizar:");
        String sFrase = teclado.nextLine();
        boolean bPalindromo = esPalindrome(sFrase);
        }

    /**
     * Función que recibe una palabra o frase...
     * @param frase
     * @return
     */
    static boolean esPalindrome(String frase) {
        if (frase == null || frase.isEmpty()) {
        return true;
    }
        frase = frase.toLowerCase(); // Transforma en minúsculas
        //O so = oso -> o so = oso
        frase = frase.replace(" ", " ");
        for (int i = 0; i < frase.length(); i++) {
            char letraIquierda = frase.charAt(i);
            char letraDerecha = frase.charAt(frase.length()-1-i);
            if (letraIquierda != letraDerecha) {
                return false;
            }
        }
        return false;
    }
}
