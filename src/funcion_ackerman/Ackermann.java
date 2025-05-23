/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcion_ackerman;

public class Ackermann {
    private int contadorLlamadas = 0;

    public int calcular(int m, int n) {
        contadorLlamadas++;

        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return calcular(m - 1, 1);
        } else {
            return calcular(m - 1, calcular(m, n - 1));
        }
    }

    public int getContadorLlamadas() {
        return contadorLlamadas;
    }
}
