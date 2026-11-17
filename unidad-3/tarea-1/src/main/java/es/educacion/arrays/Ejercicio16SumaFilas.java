package es.educacion.arrays;

// Ejercicio 16. Devuelve un array con la suma de cada fila. Admite matriz rectangular o irregular y filas vacías. Matriz o fila nula: IllegalArgumentException.
// TODO: escribir el Javadoc de la clase, del método, sus parámetros y retorno.
public final class Ejercicio16SumaFilas {
    private Ejercicio16SumaFilas() { }

    // Contrato: Devuelve un array con la suma de cada fila. Admite matriz rectangular o irregular y filas vacías. Matriz o fila nula: IllegalArgumentException.
    public static int[] sumarFilas(int[][] matriz) {
        if (matriz == null) {
            throw new IllegalArgumentException();
        }
        int[] resultado = new int[matriz.length];

        //i → recorre fila por fila
        //

        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            int[] fila = matriz[i];
            if (fila == null) {
                throw new IllegalArgumentException();
            }
            /**
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila = sumaFila + j;

            }
            **/
            for (int columna:fila) {
                sumaFila += columna;
            }

            resultado[i] = sumaFila;
        }
        return resultado;
    }
}
