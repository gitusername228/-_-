package recursion;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    int[] numbers = {0, 1, 2, 3, 5, 10, 20};
    long[] answers = {1, 1, 2, 6, 120, 3628800, 2432902008176640000L};

    @Test
    void testLong() {
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(answers[i], Factorial.factorialLong(numbers[i]));
        }
    }

    @Test
    void testBig() {
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(BigInteger.valueOf(answers[i]), Factorial.factorialBig(numbers[i]));
        }
    }

    @Test
    void testBigBigNumber() {
        assertEquals(new BigInteger("15511210043330985984000000"), Factorial.factorialBig(25));
    }

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorialLong(-1));
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorialBig(-1));
    }

    @Test
    void testWhereLongBreaks() {
        int firstWrong = -1;
        for (int n = 0; n <= 30; n++) {
            BigInteger right = Factorial.factorialBig(n);
            BigInteger fromLong = BigInteger.valueOf(Factorial.factorialLong(n));
            if (!right.equals(fromLong)) {
                firstWrong = n;
                break;
            }
        }
        assertEquals(21, firstWrong);
    }
}
