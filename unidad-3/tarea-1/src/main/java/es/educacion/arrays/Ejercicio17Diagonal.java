package es.educacion.arrays;

// Ejercicio 17. Suma diagonal principal de una matriz cuadrada, incluida la matriz 0x0. Si matriz es nula o no cuadrada: IllegalArgumentException.
// TODO: escribir el Javadoc de la clase, del método, sus parámetros y retorno.
public final class Ejercicio17Diagonal {
    private Ejercicio17Diagonal() { }

    // Contrato: Suma diagonal principal de una matriz cuadrada, incluida la matriz 0x0. Si matriz es nula o no cuadrada: IllegalArgumentException.
    public static int sumarDiagonal(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            throw new IllegalArgumentException();
        }
        int filas = matriz.length;
        int resultado = 0;
        for (int i = 0; i < filas; i++) {
            //int[] fila = matriz[i]
            if (matriz[i] == null) {
                throw new IllegalArgumentException();
            }
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    resultado += matriz[i][i];
                    break;
                }
            }
        }
        return resultado;
    }
}
