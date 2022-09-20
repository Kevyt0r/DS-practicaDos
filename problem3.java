import java.util.Scanner;
import java.io.*;

public class problem3 {
    public static void main(String[] args) {
        Scanner suma = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);
        int op;
        float a, b, c, sum, base, altura, calculo;

        System.out.println("Desea calcular 1. Area 2. Perimetro de un Triangulo?");
        op = opcion.nextInt();

        switch (op) {
            case 1:
                System.out.println("Calculando el area...");
                System.out.println("introduzca valor para Base");
                base = suma.nextFloat();
                System.out.println("introduzca valor para Altura");
                altura = suma.nextFloat();

                calculo = (base*altura)/2;
                System.out.println("El resultado del area es = " + calculo);

                break; //fin del case 1

            case 2:
                System.out.println("Calculando el perimetro...");
                System.out.println("Introduzca valor para A");
                a = suma.nextFloat();
                System.out.println("Introduzca valor para B");
                b = suma.nextFloat();
                System.out.println("Introduzca valor para C");
                c = suma.nextFloat();

                sum = a + b + c; // realiza suma

                System.out.println("Lado A: " + a + " Lado B: " + b + " Lado C: " + c + "\nEl Resultado es: " + sum);
        }
    
        suma.close(); // fin del scanner suma
        opcion.close(); //fin del scanner opcion
    }
}
