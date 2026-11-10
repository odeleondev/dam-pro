package es.educacion.arrays;

// Suma todos los valores. Array vacío: 0. Array null: IllegalArgumentException.
// 
// TODO: implementar el método y documentar la clase y el método mediante Javadoc.
public final class Ejercicio01Sumar {
    private Ejercicio01Sumar() { }

    public static void main(String[] args) {
        int [] elementos = new int[6]; // |0|0|0|0|0|
        elementos[0] = 7;
        elementos[1] = 8;
        elementos[2] = 2;
        elementos[3] = 3;
        elementos[4] = 414;
        elementos[5] = 280;
        int []numeros = {7,8,2,3,414,280};

        int sumaElementos = sumar(elementos);
        System.out.println("La suma de elementos es = " + sumaElementos);
    }
    // Suma todos los valores. Array vacío: 0. Array null: IllegalArgumentException.

    /**
     * Calcala la suma de un array
     * @param numeros int[] de enteros
     * @return int suma de todos los numeros
     */
    public static int sumar(int[] numeros) {
        if (numeros == null) {
            throw new UnsupportedOperationException("El array es nulo o vacio");
        }
        if (numeros.length == 0) {
        int suma = 0;
        for (int numero:numeros) {
            suma += numero;
        }
            return suma;
    }
        return 0;
    }
}
