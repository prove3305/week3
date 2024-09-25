import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 숫자 입력: ");
        int num2 = sc.nextInt();

        System.out.print("연산자 입력: ");
        String a = sc.next();

        System.out.println("결과:" + " " + num1 + " " + a + " " + num2);


        sc.close();
    }
}
