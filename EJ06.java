package Capitulo3;
/*Escribe un programa que calcule el área de un triángulo. */
import java.util.Scanner;

public class EJ06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la base del triángulo: ");
        double base = s.nextDouble();
        System.out.println("Introduzca la altura del triángulo: ");
        double altura = s.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("El área del triángulo es %.2f cm2\n", area);

        s.close();
    }
}
