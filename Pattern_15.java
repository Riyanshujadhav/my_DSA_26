public class Pattern_15 {
 public static void main(String[] args) {
    int n=5;
    for(int i =n;i>=1;i--){

        //first Aproch-->

        // for(int j=n-1;j>=i;j--){
        //     System.out.print("   ");
        // }
        // for(int j=2*i-1;j >= 1;j--){
        //     if(j%2==0){
        //         System.out.print(" * ");
        //     }else{
        //         System.out.print(" ! ");
        //     }
        // }System.out.println();

        //Second Approch-->

        // for (int j = 1; j <=n-i ; j++) {
        //         System.out.print("   ");
        //     }
        //     for (int j= 0; j< 2*i-1; j++) {
        //         if (j%2==0) {
        //             System.out.print(" * ");
        //         } else {
        //             System.out.print(" ! ");
        //         }
        // }System.out.println();

    }
 }   
}
