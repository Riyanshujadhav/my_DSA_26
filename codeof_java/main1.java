import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = (m + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }

            for (int j = 2; j <= 2 * i - 2; j++) {
                System.out.print("  ");
            }
            if (i == 1) {
                for (int k = n - 1; k >= 1; k--) {
                    System.out.print("* ");
                }
            } else {
                for (int j = n; j >= i; j--) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }

            for (int j = 2; j <= 2 * i - 2; j++) {
                System.out.print("  ");
            }
            if (i == 1) {
                for (int k = n - 1; k >= 1; k--) {
                    System.out.print("* ");
                }
            } else {
                for (int j = n; j >= i; j--) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
