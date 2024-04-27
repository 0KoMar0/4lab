import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество квартир на этаже (N): ");
        int N = scanner.nextInt();

        System.out.print("Введите номер нужной квартиры (M): ");
        int M = scanner.nextInt();

        int floors = (M - 1) / N + 1;

        System.out.println("Лифт должен доставить пассажира на " + floors + " этаж");

        scanner.close();
    }
}