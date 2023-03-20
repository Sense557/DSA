// import java.util.Scanner;

// public class binaryToDecimal {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter binary nmber");
//         int binary_num = sc.nextInt();

//         int ans = 0; //converted decimal number
//         int pw = 1; //power of 10 as 10 ^ 0 = 1

//         while (binary_num > 0){
//             int unit_digit = (binary_num % 10);
//             ans += (unit_digit * pw);
//             pw *= 2;
//             binary_num /= 10;
//         }

//         System.out.println(ans);
//         sc.close();
//     }
// }
