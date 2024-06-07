package co.edu.uniminuto;

public class EjercicioNo12 {

    /**
     * 12. Realizar un programa que genere una matriz 5x5, inicializarla en 2 e
     * imprimirla.
     */
    public static void main(String[] args) {
        //1. Crear matriz
        int[][] matriz = new int[5][5];
        //2. Encender matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 2;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println();
        }
    }
}
