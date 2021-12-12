import java.util.Scanner;

public class findMax4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max;

        max =a;

        if(b>max) max=b;
        if(c>max) max=c;
        if(d>max) max=d;

        System.out.println("Max값은 " +max+ " 입니다.");


    }
}
