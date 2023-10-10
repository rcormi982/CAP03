package Capitulo3;

import java.util.Scanner;

/*Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado. */
public class EJ03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la cantidad de pesetas: ");
        int pesetas = s.nextInt();

        double conversorEuros = pesetas/166.386;

        System.out.printf("%d ptas = %.2f euros", pesetas, conversorEuros);

        s.close();

    }
}
