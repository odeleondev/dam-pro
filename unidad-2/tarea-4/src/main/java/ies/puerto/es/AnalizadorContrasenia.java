package ies.puerto.es;

import java.util.Scanner;

/**
 * @author odeleondev
 * @version 1.0.0
 */
public class AnalizadorContrasenia {

    static void main() {
        Scanner teclado = new Scanner(System.in);
    }


        static int contarMayusculas(String sCadena) {
            int numero = 0;
            //Java2026! |J|a|v|a|2|0|2|6|!|
            //          |0|1|2|3|4|5|6|7|8|
            //Character.isUpperCase(c)
            for (int i = 0; i < sCadena.length(); i++) {
                char caracter = sCadena.charAt(i);

                if (Character.isAlphabetic(caracter) && Character.isUpperCase(caracter)) {
                    numero++;
                }
            }
            return numero;
        }
        static int contarMinusculas(String sCadena) {
            return sCadena.lenght(sCadena) - contarMayusculas(sCadena) - contarDigitos(sCadena);
        }
        static int contarDigitos(String sCadena) {
            int numero = 0;
            //Java2026! |J|a|v|a|2|0|2|6|!|
            //          |0|1|2|3|4|5|6|7|8|
            //Character.isUpperCase(c)
            for (int i = 0; i < sCadena.length(); i++) {
                char caracter = sCadena.charAt(i);

                if (Character.isLetterOrDigit(caracter)) {
                    numero++;
                }
            }
            return numero;
        }


        static boolean tieneLongitudMinima(String sCadena) {
            return sCadena.length() <= 8;
        }
        String  resultado
        static boolean esContraseñaValida(String sCadena) {
            if (tieneLongitudMinima(sCadena)) {
                return false;
            }
            if (contarMayusculas(sCadena) < 1) {
                return false;
            }
            if (contarMinusculas(sCadena) < 1) {
                return false;
            }
            if (contarDigitos(sCadena) < 1) {
                return false;
            }
            return true;
        }

        static void generarInforme(String sCadena) {
            String  resultado = "Digitos:"+contarDigitos()
    }

}
