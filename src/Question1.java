import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력해 주세요: ");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("짝수 입니다.");
        }else {
            System.out.println("홀수 입니다.");
        }
    }
}
