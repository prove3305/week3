import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("년도를 입력해 주세요: ");
        int a = sc.nextInt();

        if (a % 4 == 0) {
            System.out.println("윤년 입니다");
        } else if ((a & 400) == 0) {
            System.out.println("윤년 입니다");
        }else{
            System.out.println("윤년이 아닙니다");
        }
    }
}
//   && a % 100 != 0 && a % 400 == 0)