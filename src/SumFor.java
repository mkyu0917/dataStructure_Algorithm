import java.util.Scanner;

public class SumFor {

    public static void main(String[] args){


        System.out.println("1 부터 n까지 정수 더하기");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){

            sum +=i;

        };

        System.out.println("합계는 " + sum + "입니다.");

    }
}
