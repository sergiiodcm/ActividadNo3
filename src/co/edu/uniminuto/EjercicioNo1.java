package co.edu.uniminuto;

import java.util.Scanner;

public class EjercicioNo1 {

    /**
     * 1. Hacer un progtrma en Java que sume los siguientes 25 impares que le
     * siguen al número n (n es determinado por el iusuario). Imprimir los 25
     * impares y la suma.
     */
    public static void main(String[] args) {
        //1. Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int numero;
        int acumuladorImpares = 0;
        int contadorImpares = 0;
        //2.Lectura de número
        System.out.println("Dame un numero: ");
        numero = leer.nextInt();
        while (contadorImpares < 25) {
            numero++;
            if (numero % 2 != 0) {
                acumuladorImpares += numero;
                System.out.println(numero + " ");
                contadorImpares++;
            }

        }
        System.out.println("Suma: " + acumuladorImpares);

    }

}
