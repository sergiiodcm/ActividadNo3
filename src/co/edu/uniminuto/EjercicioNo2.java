package co.edu.uniminuto;

import java.util.Scanner;

public class EjercicioNo2 {

    /**
     * 2.Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3
     * (para ser sumado debe verificarse que sea múltiplo de 5 y 3 a la vez)
     * comprendidos entre 1 y n (n es determinado por el usuario. Imprimir la
     * cantidad de múltiplos de 5 y 3.
     */
    public static void main(String[] args) {
        //1. Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int cantidad = 0;
        int suma = 0;
        int i = 1; //varible iteradora para while
        //2.Lectura de número
        System.out.println("Dame un numero: ");
        int numero = leer.nextInt();
        //3. Condicionales
        while (i <= numero) {
            if (i % 5 == 0 && i % 3 == 0) {
                suma += i;
                cantidad++;
            }
            i++;//iteracion
        }
        System.out.println("La cantidad de los multiplos es: " + cantidad);
        System.out.println("La suma de los multiplos es: " + suma);
    }

}
