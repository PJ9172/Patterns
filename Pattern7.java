
/*

    15 14 13 12 11 
    10 9 8 7
    6 5 4
    3 2
    1

 */

import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        int i,j,n,t=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                t++;
            }
        }
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(t+" ");
                t--;
            }
            System.out.println();
        }
    }
}
