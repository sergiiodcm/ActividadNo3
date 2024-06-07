package co.edu.uniminuto;

public class EjercicioNo16 {

    /**
     * 16. Realizar una matriz 5x5, inicializarla totalmente en 1 y luego en la
     * diagonal trasversa colocar el número cero (0). Imprimir la matriz
     **/
    public static void main(String[] args) {
        //1. Crear matriz
        char[][] matriz = new char[5][5];
        //2. Encender matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = '1';
                } else {
                    matriz[i][j] = '0';
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
