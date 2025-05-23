package funcion_ackerman;

public class Analizador {

    public void mostrarEstadisticas(long inicio, long fin, int llamadas) {
        long tiempoTotal = fin - inicio;
        System.out.println("Tiempo de ejecucion: " + tiempoTotal + " nanosegundos");
        System.out.println("Numero de llamadas recursivas: " + llamadas);
    }

}
