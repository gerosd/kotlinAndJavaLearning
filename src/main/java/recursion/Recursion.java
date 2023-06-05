package recursion;

public class Recursion {
    public static void main(String[] args) {
        counter(3);
        System.out.println(fac(5));
    }

    private static void counter(int n) {
        System.out.println(n);

        if (n == 0) {
            return;
        }

        counter(n - 1);
    }

    private static int fac(int n) {
        if (n == 1) return 1;

        return n * fac(n - 1);
    }
}
