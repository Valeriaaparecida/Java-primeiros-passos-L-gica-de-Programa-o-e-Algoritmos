import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y){
            if(x > y){
                System.out.println("Decrescente");
            }
            else{
                System.out.println("Crescente");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}