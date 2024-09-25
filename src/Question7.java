import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("월 을 입력해 주세요: ");
        int a = sc.nextInt();

        switch (a){
            case 1:
                System.out.println("겨울 입니다.");
                break;
            case 2:
                System.out.println("겨울 입니다.");
                break;
            case 3:
                System.out.println("봄 입니다.");
                break;
            case 4:
                System.out.println("봄 입니다.");
                break;
            case 5:
                System.out.println("봄 입니다.");
                break;
            case 6:
                System.out.println("여름 입니다.");
                break;
            case 7:
                System.out.println("여름 입니다.");
                break;
            case 8:
                System.out.println("여름 입니다.");
                break;
            case 9:
                System.out.println("가을 입니다.");
                break;
            case 10:
                System.out.println("가을 입니다.");
                break;
            case 11:
                System.out.println("가을 입니다.");
                break;
            case 12:
                System.out.println("겨울 입니다.");
                break;


            default:
                System.out.println("올바른 연도가 아닙니다.");
                break;
        }
        sc.close();
    }
}
