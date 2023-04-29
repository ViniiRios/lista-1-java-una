import java.util.Scanner;

public class ListaExSeis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.println("Insira o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.println("Insira o segundo número: ");
        num2 = scanner.nextDouble();

        resultado = Math.log(num1) / Math.log(num2);
        System.out.printf("O logaritimo de " + num1 + " na base " + num2 + " é " + resultado);

        scanner.close();

    }

}