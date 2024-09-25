import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몸무게를 입력하세요: ");
        int kg = sc.nextInt();
        System.out.println("키를 입력하세요: ");
        int m = sc.nextInt();

        int BMI = (kg % (m * m));

        if (BMI >= 30){
            System.out.println("비만 입니다.");
        } else if (BMI >= 25) {
            System.out.println("과체중 입니다.");
        } else if (BMI >= 18.5) {
            System.out.println("정상 입니다.");
        } else {
            System.out.println("저체중 입니다.");
        }
    }
}
