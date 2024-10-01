import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        double num1= sc.nextDouble();

        System.out.println("연산자를 입력하세요(+, -, *, /):");
        char operator = sc.next().charAt(0);

        System.out.println("두 번째 숫자를 입력하세요:");
        double num2= sc.nextDouble();

        double result = 0;

        if(operator == '+') {
            result = num1 + num2;
        } else if(operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
        }

        System.out.println("결과:" + result);

    }
}
