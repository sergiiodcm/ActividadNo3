package co.edu.uniminuto;

import java.util.Scanner;

public class EjercicioNo9 {

    /**
     * 9. Leer N cantidad de notas (validar rango de notas), imprimir el
     * promedio de las notas, la nota más alta y la más baja.
     */
    public static void main(String[] args) {
        //1. Declaracion de variables
        Scanner leer = new Scanner(System.in);
        double sumaNotas = 0;
        double alta = -1;
        double baja = 6;
        //2. Lectura de notas
        System.out.println("Dame la cantidad de notas: ");
        int cantidad = leer.nextInt();
        //3. Condiciones
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Dame la nota " + i + "");
            double nota = leer.nextDouble();
            //
            while (nota < 0 || nota > 5) {
                System.out.println("debe estar entre 0 y 5.");
                System.out.println("Dame la nota " + i + "");
                nota = leer.nextDouble();
            }
            sumaNotas += nota;
            if (nota > alta) {
                alta = nota;
            }
            if (nota < baja) {
                baja = nota;
            }
        }
        double promedio = sumaNotas / cantidad;
        System.out.println("El promedio de notas es: " + promedio);
        System.out.println("La nota mas alta es: " + alta);
        System.out.println("La nota mas baja es: " + baja);
    }
}
