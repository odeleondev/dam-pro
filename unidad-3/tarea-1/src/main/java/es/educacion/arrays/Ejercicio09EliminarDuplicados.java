package es.educacion.arrays;

import java.util.Arrays;

// Elimina los elementos repetidos preservando el orden de primera aparición. Devuelve array nuevo. Null: IllegalArgumentException.
// 
// TODO: implementar el método y documentar la clase y el método mediante Javadoc.
public final class Ejercicio09EliminarDuplicados {
    private Ejercicio09EliminarDuplicados() { }

    // Elimina los elementos repetidos preservando el orden de primera aparición. Devuelve array nuevo. Null: IllegalArgumentException.
    public static int[] sinDuplicados(int[] numeros) {
        if (numeros == null ) {
            throw new IllegalArgumentException("El array es nulo");
        }if (numeros.length == 0) {
            return new int[]{};
            // |0|0|0|0| |1|3|2|0| cantiad 3 -> |1|3|2|
        }
        int[] numerosUnicos = new int[numeros.length];
        int cantidad = 0;
        for (int numero:numeros) {
            boolean repetido = false;
            for (int i = 0; i < cantidad; i++) {
                if (numero == numerosUnicos[i]){
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                numerosUnicos[cantidad] = numero;
                cantidad ++;
            }
        }
        return Arrays.copyOf(numerosUnicos,cantidad);
    }
}
