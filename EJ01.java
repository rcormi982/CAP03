package Capitulo3;
/*Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación. */
public class EJ01 {
    public static void main(String[] args) {
        String linea;
        System.out.print("Introduzca el primer número: ");
        linea = System.console().readLine();
        double primerNumero;
        primerNumero = Integer.parseInt(linea);

        System.out.print("Introduzca el segundo número: ");
        linea = System.console().readLine();
        double segundoNumero;
        segundoNumero = Integer.parseInt(linea);

        System.out.println("El resultado de la multiplicación es: " + primerNumero*segundoNumero);

    }
}
