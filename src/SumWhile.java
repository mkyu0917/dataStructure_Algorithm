import java.util.Scanner;

public class SumWhile {


    public static void main(String[] args){
        //숫자더하기 반복문

        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지 합을 더합니다.");

        int sum=0;
        int n=sc.nextInt();
        int i=1;

        while(i<=n){

            sum +=i;
            i++;
            System.out.println(sum);

        }

        System.out.println("합은 " + sum + "입니다." );

    }

}
