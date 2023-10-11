package Capitulo3;

import java.util.Scanner;

/*Escribe un programa que calcule el volumen de un cono según la fórmula V = (1/3)πr^2h*/
public class EJ09 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el valor del radio: ");
        double radio = s.nextDouble();
        System.out.println("Introduzca el valor de la altura: ");
        double altura = s.nextDouble();
        double PI = 3.141592654;
        double volumen =(PI * radio * radio * altura)*(1.0/3.0);//Preguntar porque si no pones 1.0 no hace la operación
        System.out.printf("El volumen del cilindro es: %.2f\n ", volumen);

    }
}
