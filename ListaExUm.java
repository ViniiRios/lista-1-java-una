import java.util.Scanner;

public class ListaExUm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float n1, n2, media;

        System.out.println("Informe o primeiro número: ");
        n1 = scanner.nextFloat();

        System.out.println("Informe o segundo número: ");
        n2 = scanner.nextFloat();

        media = (n1 + n2) / 2;

        System.out.println("A média aritmética de " + n1 + " e " + n2 + " é: " + media);

        scanner.close();
    }
}
