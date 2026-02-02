import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida,
mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas
decimais, conforme exemplo.

Entrada:
5.0
4.0

Saída:
AREA = 20.0000
PERIMETRO = 18.0000
DIAGONAL = 6.4031
*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double AREA = a * b;
        double PERIMETRO = 2 *(a + b);
        double DIAGONAL = Math.sqrt(Math.pow(a,2.0) + Math.pow(b,2.0));
        System.out.printf("AREA = %.4f%n", AREA);
        System.out.printf("PERIMETRO = %.4f%n", PERIMETRO);
        System.out.printf("DIAGONAL= %.4f%n", DIAGONAL);
    }
}