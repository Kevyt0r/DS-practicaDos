import java.util.Scanner;
import java.io.*;

public class problem4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double valor;

        System.out.println("Intrduzca un valor");
        valor = num.nextDouble();

        while (valor % 2 == 0) {

            System.out.println(valor + "/2 = ");
            valor = valor / 2;
            System.out.println(valor);

        }
        while (valor % 3 == 0) {

            valor = valor / 3;
            System.out.println(valor + "/3 = " + valor);

        }
        while (valor % 5 == 0) {

            valor = valor / 5;
            System.out.println(valor + "/5 = " + valor);

        }

        num.close();
    }
}
