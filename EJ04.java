package Capitulo3;

import java.util.Scanner;

/*Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado. */
public class EJ04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");

        double x1 = s.nextDouble();
        System.out.println("Introduzca el segundo número: ");

        double x2 = s.nextDouble();
        double suma = x1 + x2;
        double resta = x1 - x2;
        double multiplicacion = x1 * x2;
        double division = x1 / x2;

        System.out.printf("Suma = %.2f\n", suma);
        System.out.printf("Resta = %.2f%n", resta);
        System.out.printf("Multiplicación = %.2f%n", multiplicacion);
        System.out.printf("Suma = %.2f%n", division);

        s.close();



    }
}
