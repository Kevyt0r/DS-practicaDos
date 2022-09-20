import java.util.Scanner;
import java.io.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner triangulo = new Scanner(System.in);

        int numero;

        double cateto1, cateto2, hipotenusa;
        System.out.println(
                "Seleccione El problema que desea resolver 1. Calcular hipotenusa 2. calcular adyacente 3. calcular opuesto");
        numero = num.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Seleccionó opcion 1. Buscando valor del Hipotenusa...\n");
                System.out.println("Introduzca el cateto 1");
                cateto1 = triangulo.nextDouble();
                System.out.println("Introduzca el cateto 2");
                cateto2 = triangulo.nextDouble();
                System.out.println("Hipotenusa:  " + Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));

                break;

            case 2:
                System.out.println("Seleccionó opcion 2. Buscando valor del adyacente...\n");
                System.out.println("Introduzca valor de hipotenusa");
                hipotenusa = triangulo.nextDouble();
                System.out.println("Introduzca valor del lado opuesto");
                cateto1 = triangulo.nextDouble();
                System.out.println("Adyacente:  " + Math.sqrt(Math.pow(hipotenusa, 2) + Math.pow(cateto1, 2)));

                break;

            case 3:
                System.out.println("Seleccionó opcion 2. Buscando valor del opuesto...\n");
                System.out.println("Introduzca valor de hipotenusa");
                hipotenusa = triangulo.nextDouble();
                System.out.println("Introduzca valor del lado adyacente");
                cateto2 = triangulo.nextDouble();
                System.out.println("Opuesto:  " + Math.sqrt(Math.pow(hipotenusa, 2) + Math.pow(cateto2, 2)));

                break;
        }
        triangulo.close();
        num.close();
    }
}
