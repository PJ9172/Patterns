
/*

    1 0 1 0 1 
    0 1 0 1 0 
    1 0 1 0 1 
    0 1 0 1 0 
    1 0 1 0 1

 */

import java.util.*;
public class Pattern2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,n,t=0;
        System.out.print("Enter the number of rows : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(t==0)
                {
                    t=1;
                    System.out.print(t+" ");
                }
                else
                {
                    t=0;
                    System.out.print(t+" ");
                }
            }
            System.out.println("");
        }
    }
}