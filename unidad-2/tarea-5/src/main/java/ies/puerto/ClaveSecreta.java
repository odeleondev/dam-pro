package ies.puerto;

public class ClaveSecreta {
    static void main() {
        //o O = 0
        //o I = 2
        //o U = 3
        //o E = *
        //o A = ?

    }

    static String generarClaveSegura(String palabra) {
        String clave = "";

        if (palabra == null || palabra.isEmpty()) {
            return "";
        }
        palabra.replace("a", "?");
        palabra.replace("A", "?");




        return clave;
    }
}
