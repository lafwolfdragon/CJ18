package B4;

import java.util.Scanner;

public class Enteros2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 2 numeros con la condición de que el segundo no debe ser de valor cero");

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        if (valor2 == 0) {
            System.out.println("El segundo valor no puede ser cero, digite nuevamente");
        }

        int Resul = valor1 * valor2;

        while (Resul < 100) {
            System.out.println(valor1+" * "+valor2+" = "+Resul);
            Resul++;
        }


    }
}
