package ies.puerto.es;

import java.util.Scanner;

/**
 * @author odeleondev
 * @version 1.0.0
 */
public class DatosPersonales {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre:");
        String sNombre = teclado.nextLine();
        System.out.println("Introduce la edad:");
        String sEdad = teclado.nextLine();
        System.out.println("Introduce la altura:");
        String sAltura = teclado.nextLine();
        System.out.println("Introduce la matrícula:");
        String sMatricula = teclado.nextLine();


        double dAltura = convertirAltura(sAltura);
        int iEdad = convertirEdad(sEdad);
        boolean bMatricula = convertirMatricula(sMatricula);
        boolean bMayorEdad = esMayorDeEdad(iEdad);
        String ficha = formatearFicha(sNombre, iEdad, dAltura, bMatricula, bMayorEdad);


    }

    /**
     * Función que tranforma la edad en String a entero.
     * @param sEdad String que almacena la edad
     * @return int de la edad
     */
    static int convertirEdad(String sEdad) {
        if (sEdad == null) {
            return 0;
        }
        int valor = Integer.valueOf(sEdad);
        return Integer.parseInt(sEdad);
        
    }

    /**
     * Función que tranforma la altura en String a entero.
     * @param sAltura String que almacena la altura
     * @return int de la edad
     */
    static double convertirAltura(String sAltura) {
        if (sAltura == null || sAltura.isEmpty()) {
            return 0;
        }
        return Double.parseDouble(sAltura);
    }

    static boolean convertirMatricula(String sMatricula) {
        if (sMatricula == null || sMatricula.isEmpty()) {
            return false;
        }
        return Boolean.parseBoolean(sMatricula);
    }

    /**
     * Función que comprueba sie una persona es mayor de edad.
     * @param iEdad Integer con la edad de la persona
     * @return true/false
     */
    static boolean esMayorDeEdad(int iEdad) {
        return iEdad >= 18;
    }

    static Integer convertirEdadAEnvolvente(int iEdad) {
        return Integer.valueOf(iEdad);
    }

    static int recuperarEdadPrimitiva(Integer iEdad) {
        if (iEdad == null) {
            return 0;
        }
        return iEdad.intValue();
    }

    /**
     * Función que formatea la ficha.
     * @param sNombre String nombre de la ficha.
     * @param iEdad Integer edad de la ficha.
     * @param dAltura  douke altura de la ficha.
     * @param bMatricula boolean matricula de la ficha.
     * @param bMayorEdad boolean mayor de edad de la ficha.
     * @return
     */
    static String formatearFicha(String sNombre, int iEdad, double dAltura
                ,boolean bMatricula, boolean bMayorEdad) {
        return  "Ficha: "+ sNombre +", ¡edad: "+ iEdad +", altura: "+ dAltura
                +", matrícula: "+ bMatricula +", mayor de edad: "+ bMayorEdad;
    }
}
