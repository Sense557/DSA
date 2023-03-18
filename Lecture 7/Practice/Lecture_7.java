package Practice;

// import java.util.Scanner;

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  What are iterative Statements/Loops ?
 *      - doing the specific repetitive task many times for a condition
 * 
 *  Types of Loops
 *      -3 Types
 *          - 1. While
 *          - 2. Do-While
 *          - 3. For
 */
// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


 /**
  *     Try this 
  *         - Print the 1st n natural numbers where n is the input
  */


// public class Lecture_7 {
//     public static void main(String[] args) {

//         int num = 1;     //1st 👇 (only once)

//         while(num<=5)    //2nd, 5th, 8th 👇 👇
//         {
//             System.out.println(num);  //3rd, 6th, 9th 👇 👇
//             num++;              //4th, 7th, 10th etc............ ☝️ ☝️
//         }        //👇 if condition not satisfied out from this  Last

//     }
    
// }

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


/**
  *     Try this 
  *         - Print the sum of the 1st n natural numbers where n is the input
  */


//   public class Lecture_7 {
//     public static void main(String[] args) {

//         int num = 1;     
//         int sum = 0;

//         while(num<=5)    
//         {
            
//             sum += num;          // sum = sum+num;
//             num++;              // num = num+1;
//         }
//         System.out.println(sum);  

//     }
    
// }



// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


/**
 *     For Loop
                1️⃣            2️⃣,5️⃣,8️⃣         4️⃣,7️⃣
        - for(init Statement; condition; final-Expression){
                3️⃣,6️⃣,9️⃣....
            //code
        }

        --> Initialization will not reapeat more than once
        --> init St. > condition > code > final-expression > condition > code >......

        Note-
            -> Everything in the for loop is optional except ";"
            -> if u only use this semi-colon then u will get trapped in the infinite loop
            -> if we don't want to get trapped then donot remove the condition part only 
  */

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  Print 1-10 using for loop
 */

//   public class Lecture_7 {
//     public static void main(String[] args) {

//         for(int num=1; num<=10; num++)
//         {
//             System.out.println(num);
//         }

//     }
    
// }

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


/**
 *  Print sum of 1-10 using for loop
 */

//  public class Lecture_7 {
//     public static void main(String[] args) {

//         int sum =0;
//         for(int num=1; num<=10; num++)
//         {
//             sum += num;
//         }
//         System.out.println(sum);

//     }
    
// }






// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉

/**
 *  DO WHILE LOOP
 *      - do{
 *          //code
 *          }while(condition);
 */


//   public class Lecture_7 {
//     public static void main(String[] args) {

//         int num = 100;
//         do{
//             System.out.println("Hello");
//         } while(num<5);

//     }
    
// }





// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


/**
 *  Print the sum of stream of integers in the input
 *      i.e. take the user input and start adding until user gave the input "-1".
 */




//  public class Lecture_7 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num = sc.nextInt();

//         int sum =0;
//         while(num != -1)
//         {
//             System.out.println("Enter a number");
//             sum += num;
//             num = sc.nextInt();

//         }
//         System.out.println(sum);

//     }
    
// }


// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


/**
 *  In do-while loop it will print the do part anyhow if it shouln't 
 */


// public class Lecture_7 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num = sc.nextInt();

//         int sum =0;
//         do{
//             sum += num;
//             System.out.println("Enter a number");
//             num = sc.nextInt();
//         }while(num != -1);
//         System.out.println(sum);
//     }
// }


// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


/**
 *  HOMEWORK--
 *      -> repeat the above do-while example using break keyword
 *  
 * 
 *  Break--> Stop all the iteration, donot move to the next iteration
 *  Continue --> Stop all the iteration, move to the next iteration
 */

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

 /**
  *     If loop satisfies the condition it will break the loop and print the elements it has stored
  */

//  public class Lecture_7 {
//     public static void main(String[] args) {

//         for(int num = 1; num<=10; num++)
//         {
//             if(num == 5)
//             {
//                 break;
//             }
//             System.out.println(num);
//         }
//     }
// }

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️




/**
 *  Print the 1st multiple of 5 which id also a multiple of 7
 */

//   public class Lecture_7 {
//     public static void main(String[] args) {
//         int num = 1;

//         while(true)
//         {
//             if(num % 5 == 0 && num % 7 == 0)
//             {
//                 System.out.println("Found the number: "+ num);
//                 break;
//             }
//             num++;
//         }
//     }
// }


// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


/**
 *  Print all the values between 1-50 except for the multiples of 3
 */

//  public class Lecture_7 {
//     public static void main(String[] args) {
        
//         for(int num=1; num<=50; num++){
//             if(num%3==0){
//                 continue;
//             }
//             System.out.println(num);
//         }
//     }
// }
// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  in the while loop We have to write num++ explictly twice to move to the next iteration 
 *  But we don't have to write it in the for loop other than once
 */

// public class Lecture_7 {
//     public static void main(String[] args) {
//         int num=1; 
//         while(num<=50)
//         {
//             if(num%3==0){
//                 num++;
                
//                 continue;
//             }
//             System.out.println(num);
//             num++;
//         }
//     }
// }
 // ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


/**
 *  Using labels with continue & break keyword
 *      - Below only showing how can we use it 
 *      - just to know it is a cool feature so 
 * 
 */

//  public class Lecture_7 {
//     public static void main(String[] args) {

//         int n = 0;
//         outer: for(int i=0; i<n; i++)
//         {
//             inner: for(int j=0; j<n; j++)
//             {
//                 System.out.println("*");

//                 break outer;
//             }
//         }
//     }
//  }
// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️
 

/**
 *  Just to know as it is a cool feature to know
 */

//  public class Lecture_7 {
//     public static void main(String[] args) {
        
//         myloop: for(int num=1; num<=50; num++){
//             if(num%3==0){
//                 continue myloop;
//             }
//             System.out.println(num);
//         }
//     }
// }





// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉--MCQ---🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉
/**
 *  MCQ
 *      --> What is the output of the following snippet?
 *          
 */


  // public class Lecture_7 {
  //   public static void main(String[] args) {
        
        // // Q.1 What is the output of the following snippet?

        // for(int i=1; i<5; i++)
        // {
        //     System.out.print(i+",");   //1,2,3,4,
        // }

// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉

        // // Q.2 What is the output of the following snippet?

        // for(int i=1; i<5; i++){
        // }
        // System.out.println(i);    //compilation error

// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉

        // // Q.2 What is the output of the following snippet?

        // int a =1;
        // while(a<4)
        // {
        //     System.out.print(a+" ");        //1 2 3 
        //     a++;
        // }

//     }
// }

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️