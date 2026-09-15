import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Калькулятор ===");
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        String op = scanner.next();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
    }
}