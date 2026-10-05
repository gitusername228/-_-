package recursion;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskTest {

    @Test
    void testFirstTwo() {
        assertEquals(1, SecondTask.a(0));
        assertEquals(2, SecondTask.a(1));
    }

    @Test
    void testNext() {
        assertEquals(5, SecondTask.a(2));
        assertEquals(13, SecondTask.a(3));
        assertEquals(34, SecondTask.a(4));
        assertEquals(89, SecondTask.a(5));
        assertEquals(10946, SecondTask.a(10));
    }

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> SecondTask.a(-1));
    }

    String getBrackets(int n) {
        PrintStream oldOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));
        SecondTask.generateBrackets("", 0, 0, n);
        System.setOut(oldOut);
        return buffer.toString().replace("\r\n", "\n");
    }

    @Test
    void testBracketsOne() {
        assertEquals("()\n", getBrackets(1));
    }

    @Test
    void testBracketsTwo() {
        assertEquals("(())\n()()\n", getBrackets(2));
    }

    @Test
    void testBracketsThree() {
        String expected = "((()))\n(()())\n(())()\n()(())\n()()()\n";
        assertEquals(expected, getBrackets(3));
    }
}
