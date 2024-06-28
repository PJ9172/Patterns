

/*

    4 3 2 1 0 
    3 2 1 0 0 
    2 1 0 0 0 
    1 0 0 0 0 
    0 0 0 0 0

 */


import java.util.Scanner;
public class Pattern4 {
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
                if(t!=0)
                    System.out.print(t--+" ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
