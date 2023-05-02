package Part1_1;

public class Main {
    public int sum1toN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum1toN(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum1toN(3));
    }
}
