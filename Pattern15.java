/*

        P 
        P r
        P r a
        P r a j
        P r a j w
        P r a j w a
        P r a j w a l
        
 */
import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j,n;
        String name;
        System.out.print("Enter Your Name : ");
        name=sc.next();
        n=name.length();
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(name.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
