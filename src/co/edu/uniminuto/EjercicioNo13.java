package co.edu.uniminuto;

public class EjercicioNo13 {

    /**
     * 13. Realizar un programa que genere una matriz 7x7, inicializarla la
     * diagonal principal con el número “0”(cero), el resto de las posiciones
     * deben ser - (guion). Imprimir la matriz.
     */
    public static void main(String[] args) {
        //1. Crear matriz
        char[][] matriz = new char[7][7];
        //2. Encender matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    matriz[i][j] = '0';
                } else {
                    matriz[i][j] = '-';
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
