import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        //number % 3 == 0 && number % 5 == 0: 숫자가 3과 5의 배수인 경우.
        //number % 3 == 0: 숫자가 3의 배수이지만 5의 배수가 아닌 경우.
        //number % 5 == 0: 숫자가 5의 배수이지만 3의 배수가 아닌 경우.
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("3과 5의 배수입니다.");
        } else if (num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (num % 5 == 0) {
            System.out.println("5의 배수입니다.");
        } else {
            System.out.println("해당 조건을 만족하지 않습니다.");
        }


    }
}
