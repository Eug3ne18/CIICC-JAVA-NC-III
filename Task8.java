
public class Task8 {

    public static int calculateCumulativeSum(int... numbers) {
        int totalSum = 0;

        System.out.println("Cumulative sums for each parameter:");
        for (int num : numbers) {
            int cumulative = (num * (num + 1)) / 2;
            System.out.println("Sum of numbers from 1 to " + num + " = " + cumulative);
            totalSum += cumulative;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int result = calculateCumulativeSum(4, 5, 10);
        System.out.println("Total sum of all cumulative sums = " + result);
    }
}