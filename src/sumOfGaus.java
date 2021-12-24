import java.util.Scanner;

public class sumOfGaus {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //가우스 공식 (1 + n) * (n / 2)

        int sum =(1+n)*(n/2);

        System.out.println("1부터"+n+"까지 합은 " + sum +"입니다.");


    }


}
