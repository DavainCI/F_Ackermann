package funcion_ackerman;

public class Principal {
    public static void main(String[] args) {
        int m = 1;
        int n = 4;

        Ackermann ackermann = new Ackermann();
        Analizador analizador = new Analizador();

        long tiempoInicio = System.nanoTime();
        int resultado = ackermann.calcular(m, n);
        long tiempoFin = System.nanoTime();

        System.out.println("Resultado de Ackermann(" + m + ", " + n + ") = " + resultado);
        analizador.mostrarEstadisticas(tiempoInicio, tiempoFin, ackermann.getContadorLlamadas());
    }
}
