import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner MayorMenor = new Scanner(System.in);
        int a, b, c, mayor, menor;
        float promedio;

        System.out.println("Introduzca el primer valor");
        a = MayorMenor.nextInt();
        System.out.println("Introduzca el segundo valor");
        b = MayorMenor.nextInt();
        System.out.println("Introduzca el tercer valor");
        c = MayorMenor.nextInt();

        promedio = (a + b + c) / 3;
        if (a > b && a > c) {
            mayor = a;
        } else if (b > a && b > c) {
            mayor = b;
        } else {
            mayor = c;
        }
        if (a < b && a < c) {
            menor = a;
        } else if (b < a && b < c) {
            menor = b;
        } else {
            menor = c;
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El promedio de los 3 numeros es: " + promedio);
        MayorMenor.close();
    }

}
