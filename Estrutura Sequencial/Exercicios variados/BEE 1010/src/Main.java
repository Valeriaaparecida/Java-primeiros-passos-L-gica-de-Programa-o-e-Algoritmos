import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int quantidade = sc.nextInt();
        double preco = sc.nextDouble();

        int code2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double calc = (quantidade * preco) + (quantidade2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", calc);

    }
}