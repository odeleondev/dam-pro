package ies.puerto.es;

/**
 * @author odeleondev
 * @version 1.0.0
 */
public class DatosPersonales {
    static void main() {


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
}
