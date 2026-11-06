package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que realiza el calulo de la edad
 *
 * @author odeleondev
 * @version 1.0.0
 */
public final class CalculadoraEdad {
    private CalculadoraEdad() { }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.of(2007,7,7);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(nacimiento, fechaActual);
        periodo.getYears();
        int anios = periodo.getYears();
        System.out.println("La edad es: ");
    }
    /**
     * Realiza el calculo de la edad
     *
     * @param nacimiento LocalDate fecha nacimiento
     * @param fechaActual LocalDate fecha actual
     * @return int edad
     */
    public static Period calcularEdad(LocalDate nacimiento, LocalDate fechaActual) {
        boolean posterior = nacimiento.isAfter(fechaActual);
        if (posterior) {
            throw new IllegalArgumentException();
        }
        return Period.between(nacimiento, fechaActual);
    }
}
