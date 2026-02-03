
import java.util.Scanner;



public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0;
        while(n!=0){
            int a=n%10;
            rev=rev+a;
           n/=10;
        }
        System.out.println(rev);




    }
}
