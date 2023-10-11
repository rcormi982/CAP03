package Capitulo3;

import java.util.Scanner;

/*Realiza un conversor de Mb a Kb.*/
public class EJ10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un valor de Mb a convertir: ");
        double megaBytes = s.nextDouble();
        double convesorKilobytes = megaBytes * 1000;
        System.out.printf("%.2f Mb = %s Kb", megaBytes, convesorKilobytes);

        s.close();

    }
}
