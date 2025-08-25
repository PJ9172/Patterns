// 1
//  7 2
//  12 8 3
//  16 13 9 4
//  19 17 14 10 5
//  21 20 18 15 11 6


public class NumberPattern {
    public static void main(String[] args) {
        int n = 6;
        int t = n;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            int printer = num;
            int subtractor = t;

            for (int j = 1; j <= i; j++) {
                System.out.print(" " + printer);
                printer -= subtractor;
                subtractor++;
            }
            System.out.println();

            num += t;
            t--;
        }
    }
}