

/*

    5         
    4 5       
    3 4 5     
    2 3 4 5   
    1 2 3 4 5 

 */


import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        int i,j,n,t;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            t=n-i;
            for(j=0;j<=i;j++)
            {
                System.out.print(t++ +" ");
            }
            System.out.println();
        }
    }
}
