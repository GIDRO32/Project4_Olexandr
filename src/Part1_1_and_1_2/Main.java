package Part1_1_and_1_2;

public class Main {
    public static void main(String[] args) {
        double x = 2.15;
        int n = 3;
        double result = power(x, n);
        int n2 = 10;
        int result2 = sum1toN(n2);
        System.out.println(x + " raised to the power of " + n + " is " + result);
        System.out.println("The sum of first " + n2 + " positive integers is " + result2);
    }
    public static int sum1toN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum1toN(n - 1);
        }
    }
    public static double power(double x, int n) {
        if (n == 0) {
            return 1.0;
        } else {
            return x * power(x, n - 1);
        }
    }
}
