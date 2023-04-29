import java.util.Scanner;

public class ListaExOito {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int veiculos, rodas, motos, carros;

        System.out.printf("Total de veículos: ");
        veiculos = scanner.nextInt();
        System.out.printf("Informe um número par de rodas: ");
        rodas = scanner.nextInt();

        motos = ((4 + veiculos) - rodas) / 2;
        carros = (veiculos - motos);

        System.out.printf("No estacionamento há " + (carros) + " carros e " + (motos) + " motos");

        scanner.close();

    }

}