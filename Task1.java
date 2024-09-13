import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = 0;

        if (b != 0) {
            quotient = (double) a / b;
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        if (b != 0) {
            System.out.println("Частное: " + quotient);
        }

        scanner.close();
    }
}