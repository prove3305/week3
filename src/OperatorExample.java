public class OperatorExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean flag = false;

        // 복합적인 수식
        int result = (++a * b - 15) > (b / 2) && !flag ? a + b : b - a;
        // ++ 1 추가 ++a = 11
        // ++a * b -15  -> 11 * 20 - 15 = 205
        // b / 2 = 10

        // 205 > 10 이라서 true
        // flag 는 false !flag 는 true
        // 논리 연산자 && = AND a와 b 둘다 ture 여야 ture
        // 앞의 값이 true 뒤에도 true 기 때문에 true && turu -> true

        // 삼항 연산자는 ture 라면 ? 실행  false 라 : 실행
        // true 기 때문에 a + b 실행
        // a + b 는  11 + 20 = 31

        //대입 연산자로 result = 31

        System.out.println("Result: " + result);
    }
}