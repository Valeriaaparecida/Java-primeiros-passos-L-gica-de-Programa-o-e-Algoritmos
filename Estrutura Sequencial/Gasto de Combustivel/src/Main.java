import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempoDeViajem = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        double litros = ((double)(tempoDeViajem * velocidadeMedia))/12.0;
        System.out.printf("%.3f%n", litros);
        sc.close();
    }
}
