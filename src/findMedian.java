import java.util.Scanner;

public class findMedian {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int median;
        median = a;

        if(c>median){
            median =c;
        }
        if(median>b){
            median = b;
        }


        System.out.println("중앙값은 " + median + " 입니다.");

    }
}
