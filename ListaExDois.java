import java.util.Scanner;

public class ListaExDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float valor;

        System.out.println("Escreva o valor do produto: ");
        valor = scanner.nextFloat();

        System.out.printf("O valor atual do produto é: " + valor * 1.1);

        scanner.close();
    }
}
