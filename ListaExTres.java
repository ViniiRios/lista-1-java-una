import java.util.Scanner;

public class ListaExTres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int f;

        System.out.println("Escreva uma temperatura em Fahrenhenit(F°): ");
        f = scanner.nextInt();
        System.out.println("Essa temperatura em graus centígrados é: " + (f - 32) / 1.8 + " C°");

        scanner.close();

    }

}
