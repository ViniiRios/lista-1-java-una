import java.util.Scanner;

public class ListaExSete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float salarioFixo, vendasMes, porcentagemTotalvendas;

        System.out.println("Salário fixo de um vendedor: ");
        salarioFixo = scanner.nextFloat();
        System.out.println("Valor total das vendas no mês: ");
        vendasMes = scanner.nextFloat();
        System.out.println("Percentual sobre o total das vendas mensais(20% = 20): ");
        porcentagemTotalvendas = scanner.nextFloat();

        System.out.printf("O seu salário total é de: R$ " + (salarioFixo + vendasMes * porcentagemTotalvendas / 100));

        scanner.close();

    }

}
