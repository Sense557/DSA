
package Practice;
import java.util.*;
/**
 *  Count the number of digits for a given number n
 *         Note:- n = 12356
 *
 *         Logic :-
 *          - Divide n by 10 until n>0 and count the number of divisions
 *
 */

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count =0;
        
        while(num>0)
        {
            num/=10;
            count++;
        }
        System.out.println("The number of digits in num is " +count);

        sc.close();
    }
}

