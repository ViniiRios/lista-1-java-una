import java.util.Scanner;

public class ListaExDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ma, mh, mg;

        System.out.printf("Informe o 1° número: ");
        double n1 = scanner.nextDouble();
        System.out.printf("Informe o 2° número: ");
        double n2 = scanner.nextDouble();
        System.out.printf("Informe o 3° número: ");
        double n3 = scanner.nextDouble();

        ma = ((n1 + n2 + n3) / 3);
        mh = (3 / (1 / n1 + 1 / n2 + 1 / n3));
        mg = Math.cbrt(n1 * n2 * n3);

        System.out.printf("A média aritimética desses valores é: %.2f ", ma);

        System.out.printf("A média harmônica desses valores é: %.2f ", mh);

        System.out.printf("A média geométrica desses valores é: %.2f ", mg);

        scanner.close();
    }
}