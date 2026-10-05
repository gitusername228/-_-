package recursion;

public class SecondTask {

    public static long a(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть не меньше 0");
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        return 3 * a(n - 1) - a(n - 2);
    }

    static void generateBrackets(String current, int opened, int closed, int n) {
        if (current.length() == 2 * n) {
            System.out.println(current);
            return;
        }
        if (opened < n) {
            generateBrackets(current + "(", opened + 1, closed, n);
        }
        if (closed < opened) {
            generateBrackets(current + ")", opened, closed + 1, n);
        }
    }
}
