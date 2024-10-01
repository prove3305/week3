import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몸무게를 입력하세요: ");
        double kg = sc.nextInt();
        System.out.println("키를 입력하세요: ");
        double cm = sc.nextInt();

        double BMI = kg / (cm * cm);

        System.out.println("당신의 BMi는" + BMI + "입니다.");

        if (BMI < 18.5){
            System.out.println("저체중 입니다.");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("정상 입니다.");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("과체중 입니다.");
        } else {
            System.out.println("저체중 입니다.");
        }

    }
}
