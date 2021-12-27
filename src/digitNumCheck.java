import java.util.Scanner;

public class digitNumCheck {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        do{
            if(input<100){
                System.out.println("그 수는  두 자리입니다.");
                break;
            }
            if(input<1000){
                System.out.println("그 수는 세자리 입니다.");
                break;
            }
            if(input<10000){
                System.out.println("그 수는 네자리 입니다.");
                break;
            }
        }while(input>0);



    }

}
