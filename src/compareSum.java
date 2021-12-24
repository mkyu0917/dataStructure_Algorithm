import java.util.Scanner;

public class compareSum {

    public static void main(String[] args){

        System.out.println(sumof(3,5));
    }


    static int sumof(int a, int b){

        Scanner sc = new Scanner(System.in);

        int i=0;
        int sum =0;
        int count=0;

        if(a>b) {
            for (i = b; i <=a; i++) {
                count++;
            }
                sum = (((b+a)*(count))/2);

        }else if(b>a) {
            for (i = a; i <=b; i++) {
                count++;
            }
            sum = (((b+a)*(count))/2);
        }

        return sum;

    };

}
