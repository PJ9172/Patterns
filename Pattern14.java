/*

    * * * * * * * * 
                *
              *
            *
          *
        *
      *
    * * * * * * * *

 */
import java.util.*;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n;
        System.out.print("Enter the number of rows : ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == (n + 1) - i) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}