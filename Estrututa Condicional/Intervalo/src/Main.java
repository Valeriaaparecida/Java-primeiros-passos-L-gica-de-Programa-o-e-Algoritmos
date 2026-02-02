import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a < 0.00 || a > 100.00 ){
            System.out.println("Fora de intervalo");
        }
        else if(a >= 0.00 && a<= 25.00){
            System.out.println("Intervalo [0,25]");
        }
        else if(a > 25.00 && a <= 50.00){
            System.out.println("Intervalo (25,50]");
        }
        else if(a > 50.00 && a <= 75.00){
            System.out.println("Intervalo (50,75]");
        }
        else {
            System.out.println("Intervalo (75,100]");
        }

    }
}