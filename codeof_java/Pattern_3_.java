
import java.util.Scanner;


public class Pattern_3_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
    //     int a=0,b=1;
        
        
    //     for (int i = 1; i <=n; i++) { 
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print(a+" ");
    //         int t=a+b;
    //         a=b;
    //         b=t;
    //     }System.out.println();
    // }









		for (int i = 1; i <=n+1; i++) {
            for (int j=n; j >=n-(i-1); j--) {
                System.out.print(j+" ");
            }for (int j = i; j <=2*n-i; j++) {
                System.out.print("  ");
            }if(i==n+1){
                for (int j=n-i+2; j <=n; j++) {
                System.out.print(j+" ");
            }
            }else{
            
            for (int j=n-i+1; j <=n; j++) {
                System.out.print(j+" ");
            }
         } System.out.println();
        }

        // for (int i = n; i >=1; i--) {
        //     for (int j=n; j >=n-(i-1); j--) {
        //         System.out.print(j+" ");
        //     }for (int j = i; j <=2*n-i; j++) {
        //         System.out.print("  ");
        //     }if(i==n+1){
        //         for (int j=n-i+2; j <=n; j++) {
        //         System.out.print(j+" ");
        //     }
        //     }else{
            
        //     for (int j=n-i+1; j <=n; j++) {
        //         System.out.print(j+" ");
        //     }
        //  } System.out.println();
        // }
    
    }
}
