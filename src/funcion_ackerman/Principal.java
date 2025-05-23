/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
