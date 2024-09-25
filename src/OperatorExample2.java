public class OperatorExample2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int result = (++a * 2 + 3 > 10) ? 10-2 : 10+2;

        System.out.println("Result: " + result);

        // ++a -> 11
        // 11 * 2 + 3 = 25
        // 25 > 10  -> true
        // true -> 10-2
        // Result -> 8


    }
}
