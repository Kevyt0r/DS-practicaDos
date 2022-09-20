import java.util.Scanner;
public class problem8{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //Entrada
        long num, ultimoDigito, c = 0, decimal = 0;

        System.out.println("DIGITE UN NUMERO BINARIO :");
        num = obj.nextLong();

        //Proceso
        while (num != 0) {
            ultimoDigito = num % 10;
            decimal += ultimoDigito * Math.pow(2, c);
            c++;
            num /= 10;
        }
        System.out.println(decimal);
        obj.close();
    }
}