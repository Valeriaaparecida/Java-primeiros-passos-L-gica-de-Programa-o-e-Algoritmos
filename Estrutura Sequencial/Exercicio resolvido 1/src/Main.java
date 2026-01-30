import java.util.Scanner;

/*
Fazer um programa para ler as medidas da largura e comprimento de um terreno
retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
com duas casas decimais.

Em seguida, o programa deve mostrar o valor da área do terreno,
bem como o valor do preço do terreno, ambos com duas casas decimais,
conforme o exemplo.

Entrada:
10.0
30.0
200.00

Saída:
AREA = 300.00
PRECO = 60000.00
*/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double largura = scanner.nextDouble();
        double comprimento = scanner.nextDouble();
        double metroQuadrado = scanner.nextDouble();

        double area = largura * comprimento;
        double preco = metroQuadrado * area;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f", preco);


        scanner.close();

    }
}