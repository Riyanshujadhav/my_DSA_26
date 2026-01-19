public class Pattern_14 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                
                if (j%2==0) {
                    System.out.print(" ! ");
                } else {
                    System.out.print(" * ");
                }
            }
            for (int j = i-1; j >= 1; j--) {
                    
                    if (j%2==0) {
                        System.out.print(" ! ");
                    } else {
                        System.out.print(" * ");
                    }
                }
            
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("   ");
            }System.out.println();
        }
    }
}
