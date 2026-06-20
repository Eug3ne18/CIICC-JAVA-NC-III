import java.util.Scanner;

public class Task7 {
    // addition method
    public static int add(int x, int y) {
        return x + y;
    }

    // subtraction method
    public static int subtract(int x, int y) {
        return x - y;
    }

    // multiplication method
    public static int multiply(int x, int y) {
        return x * y;
    }

    // division method
    public static double divide(int x, int y) {
        if (y == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) x / y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // perform operations
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        sc.close();
    }
}