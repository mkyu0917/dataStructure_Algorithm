import java.util.Scanner;

public class findMax3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;
        max = a;

        if(b>max){
            max=b;
        };

        if(c>max){
            max=c;
        };

        System.out.println("최대값은: " + max + " 입니다.");
        }
    }

