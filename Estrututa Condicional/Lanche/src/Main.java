import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double price;

        if(codigo == 1){
            price = 4.00;
        }
        else if(codigo == 2){
            price = 4.50;
        }
        else if(codigo == 3){
            price = 5.00;
        }
        else if(codigo == 4){
            price = 2.00;
        }
        else if(codigo == 5){
            price = 1.50;
        }
        else{
            System.out.println("invalid");
            return;
        }

        double total =   quantidade * price ;

        System.out.printf("Total: R$ %.2f", total);
    }
}