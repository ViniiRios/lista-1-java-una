import java.util.Scanner;

public class ListaExQuatro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float i, n, C;

        System.out.println("Digite o valor do capital a ser aplicado:");
        C = scanner.nextFloat();
        System.out.println("Digite o prazo de aplicação em meses:");
        n = scanner.nextFloat();
        System.out.println("Digite a taxa de juros mensal(20% = 20):");
        i = scanner.nextFloat();

        double I = (i / 100 + 1);
        double m = Math.pow(I, n);
        double M = (C * m);

        System.out.printf("O montante a ser recebido é de: R$ %.2f", M);

        scanner.close();

    }

}
