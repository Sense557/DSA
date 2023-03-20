package Practice;
import java.util.Scanner;

/**
 *  Power
 *      Try this
 *          - Given 2 numbers a and b. Find a raise to the power b.
 */

public class Power {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        int ans = 1;

        for (int i=1; i<=b; i++)
        {
            ans *= a;
        }
        System.out.println(ans);
        sc.close();

    }
}
