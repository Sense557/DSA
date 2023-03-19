// import java.util.Scanner;
// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *      What are iterative statements /Loops?
 *          - Iterative statements, also known as loops, are programming constructs
 *              that allow a block of code to be executed repeatedly based on a certain
 *              condition.
 *          - They are commonly used when there is a need to perform a repetitive
 *              task or when the number of iterations is not known in advance.
 *
 *          There are several types of loops in most programming languages, including:
 *
 *          1. While loop: Executes a block of code repeatedly as long as a specified condition is true.
 *          2. For loop: Executes a block of code a specific number of times,
 *              typically based on the size of a collection or an explicit count.
 *          3. Do-while loop: Executes a block of code at least once, and then
 *              continues to execute it as long as a specified condition is true.
 *          4. For-each loop: A special type of loop that is used to iterate over each element in a collection.
 *          
 *              Loops are an essential tool for programmers, as they allow for
 *              efficient and concise code that can be used to process large amounts
 *              of data or perform repetitive tasks.
 *

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  Count the number of digits for a given number n
 *         Note:- n = 12356
 *
 *         Logic :-
 *          - Divide n by 10 until n>0 and count the number of divisions
 *
 */

// public class index {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num = sc.nextInt();
//         int count =0;
        
//         while(num>0)
//         {
//             num/=10;
//             count++;
//         }
//         System.out.println("The number of digits in num is " +count);

//         sc.close();
//     }
// }
// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

// import java.util.Scanner;

/**
 *  Print the first n factorial numbers
 *      Note:-
 *          - 1! = 1
 *          - 2! = 2*1
 *          - 3! = 3*3*1
 *          - 4! = 4*3*2*1
 *          - 5! = 5*4*3*2*1
 */


//  public class index {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number to find it's factorial");
//         int num = sc.nextInt();
//         int fact = 1;

//         while(num>=1)
//         {
//             fact *= num;
//             num--;
//         }
//         System.out.println("The factorial of number n is " +fact);
        

//         sc.close();
//     }
// }


// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

// import java.util.Scanner;

/**
 *  Power
 *      Try this
 *          - Given 2 numbers a and b. Find a raise to the power b.
 */


//   public class index {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a ");
//         int a = sc.nextInt();
//         System.out.println("Enter b ");
//         int b = sc.nextInt();
//         int pow = 1;

//         for(int i =1; i<=b; i++)
//         {
//             pow *=a;
//         }
//         System.out.println(pow);
//         sc.close();
//     }
// }


// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️
// import java.util.Scanner;
/**
 *  Reverse the digits of a number
 *      Note:- n = 12345 ----> 54321
 * 
 *
 *      Logic:-
 *          - first we have ans is "0"
 *          - we multiply (ans)*10+(last digit)
 *          - every iteration we need to change the number i.e. remove last digit from that number
 *          - else will be trapped in an infinite loop
 */


//   public class index {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num = sc.nextInt();
        
//         int ans = 0;
//         while(num>=1)
//         {
//             ans = ans*10 + num%10;
//             num/=10;
//         }
//         System.out.println("Reverse Order " +ans);
        
//         sc.close();
//     }
// }


// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️
// import java.util.Scanner;
/**
 *  Find the sum of digits in a given number n.
 *
 *      Note: - n = 765
 *
 *      Logic:-
 *          -Last digit ko use kia add kia uske baad usi number ko uda dia
 *          -because if we don't extract that number after adding then it will be trapped in an infinite loop
 *          -because it will repeatedly add that particular number n times and it will never end
 *          -so to avoid that we need to extract after adding that number
 */


//   public class index {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num = sc.nextInt();
//         int sum =0;

//         while(num>=1)
//         {
//             sum += num%10;
            
//             num/=10;
            
//         }
//         System.out.println(sum);
        

//         sc.close();
//     }
// }


// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️
import java.util.*;

/**
 *  Find the sum of the following series
 *      - Note:- series s= 1-2+3-4......n
 */

//  public class index {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num = sc.nextInt();
//         int sum = 0;

//         for(int i=1; i<=num; i++)
//         {
//             if(i%2==0)
//             {
//                 sum -= i;
//             }
//             else
//             {
//                 sum += i;
//             }
//         }
//         System.out.println(sum);

//         sc.close();
//     }
// }



// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  Sum of seried of a number
 *      -- 5 => 1+2+3+4+5
 *      -- 6 => 1+2+3+4+5+6 etc.
 */
// public class index {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num = sc.nextInt();
//         int sum = 0;

//         for(int i=1; i<=num; i++)
//         {
//             sum += i;
//         }
//         System.out.println(sum);

//         sc.close();
//     }
// }

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️