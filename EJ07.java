package Capitulo3;

import java.util.Scanner;

/*Escribe un programa que calcule el total de una factura a partir de la base
imponible. */
public class EJ07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el importe: ");
        double importe = s.nextDouble();
        float iva = 21f;

        double total = importe * (1 + iva/100);

        System.out.println("Base imponible: " + importe);
        System.out.printf("IVA:%16s %%\n", iva);
        System.out.println("======================");
        System.out.printf("Total:%16.2f €\n", total);

        s.close();
    }
}
