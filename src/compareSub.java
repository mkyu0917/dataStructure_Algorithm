import java.util.Scanner;

public class compareSub {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a =0;
        int b =0;

        System.out.print("a의 값: ");
        a = sc.nextInt();

        do{
            System.out.print("b의 값: ");
            b = sc.nextInt();

        }while(a>b);

        int sub = b-a;

        System.out.println("b-a는 "+sub+" 입니다.");
    }
}
