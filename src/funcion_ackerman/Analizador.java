/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcion_ackerman;

public class Analizador {

    public void mostrarEstadisticas(long inicio, long fin, int llamadas) {
        long tiempoTotal = fin - inicio;
        System.out.println("Tiempo de ejecución: " + tiempoTotal + " nanosegundos");
        System.out.println("Número de llamadas recursivas: " + llamadas);
    }

}
