import java.util.*;

public class Awee {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){

			for (int j = 1; j <=i; j++) {
				System.out.print(j+"	");
			}for (int j = 1; j <= (2*n-1)-2*i; j++) {
				System.out.print(0+"	");
			}
			if (i==n) {
					for(int k=n-1;k>=1;k--){
						System.out.print(k+"	");		
					}		
			}else{
				for (int j = i; j >=1; j--) {
					System.out.print(j+"	");
				}			
			}	
			
			System.out.println();
		}
    }
}
