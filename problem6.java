import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner primos = new Scanner(System.in);

        int limit;

        System.out.println("Ingresar un numero");
        limit = primos.nextInt();

        System.out.println("1");

        for (int i = 1; i < limit; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }

                if (count == 2) {
                    System.out.println(i);
                }
            }
        }
        primos.close();
    }
}