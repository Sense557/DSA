package Folder;

import java.util.Scanner;

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 * Problems on Pattern Printing using Loops 
 */

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️


/**
 *  Rectangular Pattern Print
 * 
      ********
      ********
      ********
      ********
 */

// public class index {

//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     // c = column
//     System.out.println("Enter column size");
//     int c = sc.nextInt();

//     for(int i=1; i<=r; i++)
//     {
//       for(int j=1; j<=c; j++)
//       {
//         System.out.print("*");
        
//       }
//       System.out.println();
//     }

//     sc.close();
//   }
// }

// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  Hollow Rectangular Pattern Print
 
      *****
      *   *
      *   *
      *   *
      *****
 */

//  public class index {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     // c = column
//     System.out.println("Enter column size");
//     int c = sc.nextInt();

//     for(int i=1; i<=r; i++)
//     {
//       for(int j=1; j<=c; j++)
//       {
//         if (i==1 || i==r ||j==1 ||j==c) 
//         {
//           System.out.print("*");
//         }
//         else
//         {
//           System.out.print(" ");
//         }
        
//       }
//       System.out.println();
//     }
//     sc.close();
//   }
// }



// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  Ascending Triangular Pattern Print
 * 
 *    Note-
 *      There is no significance of columns in triangular pattern 
 * 
      *
      **
      ***
      ****
      *****
      ******
      *******
      ********
 */

//  public class index {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     for(int i=1; i<=r; i++)
//     {
//       for(int j=1; j<=i; j++)
//       {
//        System.out.print("*");
        
//       }
//       System.out.println();
//     }
//     sc.close();
//   }
// }


// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  Descending Triangular Pattern Print
 * 
 *    Note-
 *      There is no significance of columns in triangular pattern 
 * 
      *****
      ****
      ***
      **
      *
 */

//  public class index {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     for(int i=r; i>=1; i--)
//     {
//       for(int j=1; j<=i; j++)
//       {
//        System.out.print("*");
        
//       }
//       System.out.println();
//     }
//     sc.close();
//   }
// }




// ▶️▶️▶️▶️▶️▶️ALTERNATE METHOD FOR DESCENDING TRIANGLE▶️▶️▶️▶️▶️▶️

/**
 *  Descending Triangular Pattern Print
 * 
 *    Note-
 *      There is no significance of columns in triangular pattern 
 * 
      *****
      ****
      ***
      **
      *
 */

//  public class index {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     for(int i=1; i<=r; i++)
//     {
//       for(int j=1; j<=(r+1-i); j++)
//       {
//        System.out.print("*");
        
//       }
//       System.out.println();
//     }
//     sc.close();
//   }
// }




// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  Pyramid Triangle Pattern Print
 * 
 *    Note-
 *      There is no significance of columns in triangular pattern 
 * 
         *
        ***
       *****
      *******


 */

//  public class index {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     for(int i=1; i<=r; i++)
//     {
//       //print r-i spaces
//       for(int j=1; j<=(r-i); j++)
//       {
//         System.out.print(" ");
//       }

//       //Print 1 to i
//       for(int k=1; k<=i; k++)
//       {
//         System.out.print("*");
//       }

//       //Print 1 to i-1
//       for(int l=1; l<=i-1;l++)
//       {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
    
//     sc.close();
//   }
// }


// ▶️▶️▶️▶️▶️▶️ALTERNATE METHOD FOR DESCENDING TRIANGLE▶️▶️▶️▶️▶️▶️

/**
 *  Numerical Rectangular Pattern Print
 * 
 *    Note-
 *      There is no significance of columns in triangular pattern 
 * 
      12345678
      12345678
      12345678
      12345678
      12345678
 */

//  public class index {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     // c = column
//     System.out.println("Enter row size");
//     int c = sc.nextInt();

//     for(int i=1; i<=r; i++)
//     {
//       for(int j=1; j<=c; j++)
//       {
//        System.out.print(j);
        
//       }
//       System.out.println();
//     }
//     sc.close();
//   }
// }



// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️
/**
 *  Numerical Rectangular Pattern Print
 * 
 *    Note-
 *      There is no significance of columns in triangular pattern 
 * 
        1 2 3 4 5 1 
        2 3 4 5 1 2 
        3 4 5 1 2 3 
        4 5 1 2 3 4 
        5 1 2 3 4 5 
 */

//  public class index {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     for(int i=1; i<=r; i++)
//     {
//       //Print i to r
//       for(int j=i; j<=r; j++)
//       {
//         System.out.print(j);
//       }

//       //Print 1 to i-1
//       for(int k=1; k<=i-1; k++)
//       {
//         System.out.print(k);
//       }
//       System.out.println();
//     }
//     sc.close();
//   }
// }


// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️
/**
 *  Numerical Rectangular Pattern Print
 * 
 *    Note-
 *      There is no significance of columns in triangular pattern 
 * 
        1 2 1 2 1 
        2 1 2 1 2
        1 2 1 2 1
        2 1 2 1 2
        1 2 1 2 1
 */

//  public class index {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     for(int i=1; i<=r; i++)
//     {
//       //Print r-i spaces
//       for(int j=1; j<=r; j++)
//       {
//         //setting condition 
//         if ((i+j)%2==0) 
//         {
//           System.out.print(1+" ");  
//         }
//         else
//         {
//           System.out.print(2+" ");
//         }
//       }
//       System.out.println();
//     }
//     sc.close();
//   }
// }




// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  Ascending Triangular Pattern Print
 * 
 *    Note-
 *      There is no significance of columns in triangular pattern 
 * 
        1
        12
        123
        1234
        12345
 */

//  public class index {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     for(int i=1; i<=r; i++)
//     {
//       for(int j=1; j<=i; j++)
//       {
//        System.out.print(j);
        
//       }
//       System.out.println();
//     }
//     sc.close();
//   }
// }




// ▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️▶️

/**
 *  Pyramid Triangle Pattern Print
 * 
 *    Note-
 *      There is no significance of columns in triangular pattern 
 * 
            1
           121
          12321
         1234321
        123454321


 */

//  public class index {
//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // r = row
//     System.out.println("Enter row size");
//     int r = sc.nextInt();

//     for(int i=1; i<=r; i++)
//     {
//       //print r-i spaces
//       for(int j=1; j<=(r-i); j++)
//       {
//         System.out.print(" ");
//       }

//       //Print 1 to i
//       for(int k=1; k<=i; k++)
//       {
//         System.out.print(k);
//       }

//       //Print i-1 to 1
//       for(int l=i-1; l>=1; l--)
//       {
//         System.out.print(l);
//       }
//       System.out.println();
//     }
    
//     sc.close();
//   }
// }


// ▶️▶️▶️▶️▶️▶️PENDING HOLLOW NUMERICAL TRIANGLE▶️▶️▶️▶️▶️▶️


/**
 *  Hollow Pyramid Triangle Pattern Print
 * 
 *    Note-
 *      There is no significance of columns in triangular pattern 
           1    
          2  2
         3    3
        44444444
 */
//  class index{
//   public static void main(String[] args) {
//     int r = 5;
//     for(int i=1; i<=r-1; i++)
//     {
//       for(int j=0; j<=r-1; j++)
//       {
//         if(i==r-1 || i+j==r-1)
//         {
//           System.out.print(i);
//         }
//         else
//         {
//           System.out.print(" ");
//         }
//       }
//       for(int j=2; j<=r-1; j++)
//       {
//         if(i==r-1 || i==j)
//         {
//           System.out.print(i);
//         }
//         else
//         {
//           System.out.print(" ");
//         }
//       }
//       System.out.println();
//     }
//   }
//  }