

/*

    * * * * * 
    * 3 4 5 * 
    * 2 3 4 * 
    * 1 2 3 * 
    * * * * * 
    
 */


import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,n,t;
        System.out.print("Enter the number of rows : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            t=n-i;
            for(j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                    System.out.print("* ");
                else
                    System.out.print(t++ +" ");
            }
            System.out.println();
        }
    }
}
