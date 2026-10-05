package recursion;

import java.math.BigInteger;

public class Factorial {

    public static long factorialLong(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть не меньше 0");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorialLong(n - 1);
    }

    public static BigInteger factorialBig(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть не меньше 0");
        }
        if (n <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorialBig(n - 1));
    }
}
