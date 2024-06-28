

/*

    1 1         
    * * *       
    3 3 3 3     
    * * * * *   
    5 5 5 5 5 5

 */

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the number of rows : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i+1;j++)
            {
                if(i%2!=0)
                    System.out.print(i+" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
