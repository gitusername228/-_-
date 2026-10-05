package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTaskTest {

    @Test
    void testOneDigit() {
        assertEquals(0, FirstTask.digitSum(0));
        assertEquals(7, FirstTask.digitSum(7));
        assertEquals(9, FirstTask.digitSum(9));
    }

    @Test
    void testManyDigits() {
        assertEquals(1, FirstTask.digitSum(10));
        assertEquals(14, FirstTask.digitSum(572));
        assertEquals(6, FirstTask.digitSum(1005));
        assertEquals(27, FirstTask.digitSum(999));
        assertEquals(45, FirstTask.digitSum(123456789));
    }

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> FirstTask.digitSum(-1));
    }
}
