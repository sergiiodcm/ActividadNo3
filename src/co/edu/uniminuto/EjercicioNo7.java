package co.edu.uniminuto;

import java.util.Scanner;

/**
 * 7. Realizar un programa en Java que dado n cantidad de números determine si
 * es primo o no y si ese número primo es múltiplo de 3, se debe contar.
 * Imprimir cantidad de primos y cantidad de múltiplos de 3
 */
public class EjercicioNo7 {

    public static void main(String[] args) {
        //1. Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int numeros;
        int primos = 0;
        int multiplosTres = 0;
        //2. Lectura de numeros
        System.out.println("Dame la cantidad de numeros: ");
        numeros = leer.nextInt();
        //3. Condicionales
        for (int i = 0; i < numeros; i++) {
            System.out.println("Dame un nuemero: ");
            int numero = leer.nextInt();
            if (primo(numero)) {
                primos++;
                //4.Condicional multiplo de 3
                if (numero % 3 == 0) {
                    multiplosTres++;
                }
            }
        }
        System.out.println("la cantidad de numeros primos es: " + primos);
        System.out.println("la cantidad de numeros primos que son multiplos de 3 es: " + multiplosTres);
    }

    //3. condiciones para saber si un numero es primo
    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
