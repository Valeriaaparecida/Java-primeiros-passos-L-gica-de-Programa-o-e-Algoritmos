import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salary = sc.nextDouble();
        double vendas = sc.nextDouble();

        double total = salary + (0.15 * vendas);


        System.out.printf("TOTAL = R$ %.2f%n", total );

    }
}