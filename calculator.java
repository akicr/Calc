import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Калькулятор ===");
        System.out.print("Введите первое число: ");
        double a = scanner.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        String op = scanner.next();
        System.out.print("Введите второе число: ");
        double b = scanner.nextInt();
        double result;
        if (op.equals("+")) {
            result = Add.add1(a, b);
            System.out.print(result);
        }
    }
}