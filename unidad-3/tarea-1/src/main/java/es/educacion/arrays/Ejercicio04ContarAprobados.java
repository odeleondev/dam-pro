package es.educacion.arrays;

// Cuenta las notas >= 5. Array vacío: 0. Null: IllegalArgumentException.
// 
// TODO: implementar el método y documentar la clase y el método mediante Javadoc.
public final class Ejercicio04ContarAprobados {
    private Ejercicio04ContarAprobados() { }

    public static void main(String[] args) {
        int[] notas = {5,2,1,10,8};
        int aprobados = contarAprobados(notas);
        System.out.println("El número de aprobados es = " + aprobados);
        int suspensos = contarSuspensos(notas);
        System.out.println("El número de suspensos es = " + suspensos);
    }
    // Cuenta las notas >= 5. Array vacío: 0. Null: IllegalArgumentException.
    public static int contarAprobados(int[] notas) {
       if (notas == null || notas.length == 0) {
           throw new IllegalArgumentException();
       }
       int aprobados = 0;
       for (int nota : notas) {
           if (nota >= 5) {
               aprobados = aprobados + 1; // tambien se puede poner como "aprobados++"
           }
       }
       return aprobados;
    }

    public static int contarSuspensos (int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException();
        }
        int suspensos = 0;
        for (int nota : notas) {
            if (nota < 5) {
                suspensos = suspensos + 1; // tambien se puede poner como "suspensos++"
            }
        }
        return suspensos;
    }
    public static int contarSuspensosTop (int[] notas) {
        if (notas == null) {
            throw new IllegalArgumentException();
        }
        return notas.length - contarAprobados(notas);
    }
}
