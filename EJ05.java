package Capitulo3;
/*Escribe un programa que calcule el área de un rectángulo. */
import java.util.Scanner;

public class EJ05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura del rectángulo: ");
        double altura = s.nextDouble();
        System.out.println("Introduzca la anchura del rectángulo: ");
        double anchura = s.nextDouble();

        double area = altura * anchura;

        System.out.printf("El área del triángulo es %.2f cm2\n", area);

        s.close();
    
    }
}
