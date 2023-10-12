package Capitulo3;
/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.*/
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la primera nota: ");
        float nota1 = s.nextFloat();
        System.out.println("Introduzca la nota final deseada: ");
        float notaFinal = s.nextFloat();
        double nota2 = (notaFinal - (nota1*0.40))/0.60;
        System.out.printf("La nota necesaria para obtener %.2f es %.2f", notaFinal, nota2);

        s.close();
    }
}
