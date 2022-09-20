import java.util.Scanner;
import java.io.*;

public class Grados {
    public static void main (String[] args){
        Scanner grados = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce los grados Celcius");
        gradosC = grados.nextDouble();
        gradosF = (gradosC * 9/5) + 32;
        System.out.println( gradosC + " grados Celcius es igual a " + gradosF + " grados Farenheit");
        grados.close(); //final scanner grados
    }
} //final Clase Grados
