package Capitulo3;
/*Realiza un conversor de Kb a Mb. */
import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca los kb a convertir: ");
        double kiloBytes = s.nextDouble();
        double convesorMegabytes = kiloBytes/1000;
        System.out.printf("%.2f kb = %.2f Mb", kiloBytes, convesorMegabytes);

        s.close();
    }
}
