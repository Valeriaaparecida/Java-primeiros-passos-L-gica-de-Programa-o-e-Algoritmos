import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int soma1 = C + D;
        int soma2 = A + B;

        if (B > C && D > A && soma1 > soma2 && C > 0 && D > 0 && A % 2 == 0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores não aceitos");
        }

    }
}