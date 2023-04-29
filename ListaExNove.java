import java.util.Scanner;

public class ListaExNove {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horas, minutos, segundos, restante;

        System.out.println("Informe uma quantidade de segundos: ");
        segundos = scanner.nextInt();

        horas = (segundos / 3600);
        minutos = (segundos % 3600 / 60);
        restante = (segundos % 60);

        System.out.printf((horas) + " hora(s) e " + (minutos) + " minuto(s) e " + (restante) + " segundos");

        scanner.close();

    }

}
