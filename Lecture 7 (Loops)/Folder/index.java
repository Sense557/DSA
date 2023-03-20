package Folder;

import java.util.Scanner;
/**
 *  Homework Pending 
 */

public class index {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int sum =0;
        do{
            sum += num;
            System.out.println("Enter a number");
            num = sc.nextInt();
            
        }while(num != -1);
        System.out.println(sum);
        
        sc.close();
    }
}