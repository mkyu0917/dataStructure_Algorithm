import java.util.Scanner;

public class findMedian {
    static int findMedi(int a, int b, int c) {
        // 1 4 2
        if(a>=b)
             if(b>c) //abc
                 return b;
             else if(a<=c) //cab
                 return a;
             else       //acb
                 return c;
       else if(b<=c) // c>b>a
            return b;
       else if(a<=c) //a<c
            return c;
       else
            return a;


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        System.out.println( "결과값: "+ findMedi(a,b,c));



    }


}


