import java.util.Scanner;

public class ListaExCinco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float horas, valorHoras, salarioFamilia, numeroFilhos, valorBruto;

        System.out.println("Número de horas que o funcionário trabalhou no mês:");
        horas = scanner.nextFloat();
        System.out.println("Valor recebido por hora de trabalho:");
        valorHoras = scanner.nextFloat();
        System.out.println("Valor do salário família:");
        salarioFamilia = scanner.nextFloat();
        System.out.println("Número de filhos com idade menor que 14 anos:");
        numeroFilhos = scanner.nextFloat();

        valorBruto = (horas * valorHoras) + numeroFilhos * salarioFamilia;

        System.out.printf("O salário bruto a ser recebido por um funcionário em um mês é de: R$%.2f ", valorBruto);

        scanner.close();

    }

}