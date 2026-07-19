// Importing Math methods statically
import static java.lang.Math.*;

public class Task9 {

    // Addition using Math.addExact
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Subtraction using Math.subtractExact
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Multiplication using Math.multiplyExact
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Division using Math.floorDiv
    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int x = 20, y = 6;

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division (floor): " + divide(x, y));
    }
}
