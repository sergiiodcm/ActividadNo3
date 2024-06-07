package co.edu.uniminuto;

public class EjercicioNo14 {

    /**
     * 14. Realizar un programa que genere un arreglo de 50 posiciones y se
     * rellene de con la función ramdom de Java (los números deben ser 1 a 99),
     * luego de llenar hacer la impresión de la matriz.
     */
    public static void main(String[] args) {
        //
        int[] arreglo = new int[50];
        //
        for (int i = 0; i < 50; i++) {
            arreglo[i] = (int) (Math.random() * 99) + 1;
        }
        //
        for (int i = 0; i < 50; i++) {
            System.out.print(arreglo[i] + " ");
            if ((i + 1)%10 == 0){
                System.out.println();
            }
        }
    }

}
