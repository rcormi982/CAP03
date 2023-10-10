package Capitulo3;

import java.util.Scanner;

/*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.*/
public class EJ02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros: ");
        double euros = s.nextDouble();

        double conversorPesetas = (euros * 166.386);

        System.out.println(euros + " euros" + " es = " + conversorPesetas + " ptas");

        s.close();
    }
}
