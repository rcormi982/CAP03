package Capitulo3;

import java.util.Scanner;

/*Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora. */
public class EJ08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el número de horas trabajadas: ");
        float horasTrabajadas = s.nextFloat();
        int precioHora = 12;
        double salarioSemanal = horasTrabajadas * precioHora;

        System.out.println("Su salario semanal es: " + salarioSemanal + " euros");

        s.close();
    }
}
