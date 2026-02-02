import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c){
            System.out.printf("MENOR = %d", a);
        }
        else if (b < c ){
            System.out.printf("MENOR = %d", b);
        }
        else{
            System.out.printf("MENOR = %d", c);
        }
        sc.close();
    }
}