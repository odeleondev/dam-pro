package es.educacion.arrays;

import static java.lang.Math.max;

// Devuelve el mayor valor. Vacío o null: IllegalArgumentException.
// 
// TODO: implementar el método y documentar la clase y el método mediante Javadoc.
public final class Ejercicio03Maximo {
    private Ejercicio03Maximo() { }

    public static void main(String[] args) {
        int[] numeros = {1, 4 ,9, 6, 10};

        System.out.println("El númeo máximo es " + maximo(numeros));
    }

    public static int maximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array es nulo");
    }
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
}
