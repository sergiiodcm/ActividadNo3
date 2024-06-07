package co.edu.uniminuto;

import java.util.Scanner;

/**
 * 3.Hacer un programa en Java que, dado un rango, por el usuario, se da número
 * inicial y uno final (tomar en cuenta que el inicial debe ser menor que el
 * final, hacer la validación y volver a pedir los dos números si no cumple la
 * condición) y sume los números pares dentro del rango incluyendo el valor
 * inicial y final.
 */
public class EjercicioNo3 {

    public static void main(String[] args) {
        //1. Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int numeroInicial;
        int numeroFinal;
        //2. Lectura de los numeros con un bucle para validar si se cumple
        //la condicion
        do {
            System.out.println("Dame un numero inicial: ");
            numeroInicial = leer.nextInt();
            System.out.println("Dame un numero final: ");
            numeroFinal = leer.nextInt();
            if (numeroInicial >= numeroFinal) {
                System.out.println("El primer numero debe ser menor a l final");
            }
        //3. Condicionales
        } while (numeroInicial >= numeroFinal);
        int sumaPares = 0; 
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }
        System.out.println("la suma de los numeros es pares en el rango es: " 
                + sumaPares);
    }
}
