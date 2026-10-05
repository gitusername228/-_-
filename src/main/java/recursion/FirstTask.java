package recursion;

public class FirstTask {

    public static int digitSum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть не меньше 0");
        }
        if (n < 10) {
            return n;
        }
        return n % 10 + digitSum(n / 10);
    }
}
