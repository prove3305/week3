import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " 는 윤년입니다.");
        } else {
            System.out.println(year + " 는 윤년이 아닙니다.");
        }
    }
}

        /*System.out.println("년도를 입력해 주세요: ");
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
//   && a % 100 != 0 && a % 400 == 0) */