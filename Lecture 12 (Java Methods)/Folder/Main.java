import java.util.*;

/**
 *  Summary
 *      - How to get addition, substraction & multiplication of two numbers only passing values once using method 
 *          Conditions-
 *              - Dont use standard library methods
 *              - Use methods
 *              - Pass values
 *              - not using this keyword
 *              - not passing the value directly to the method
 *              - you can use constructor
 *              - only you can pass the value through the object
 */

class Algebra
{
    int a;
    int b;
    Algebra(int x, int y)
    {
        System.out.println("Constructor of Algebra class called");
        a = x;
        b = y;
    }
    int add()
    {
        int sum = a + b;
        return sum;
    }

    int subs()
    {
        return a - b;
    }

    int multi()
    {
        return a * b;
    }
}

public class Main {

    public static void main(String[] args) {
        Algebra obj = new Algebra(5,7);
        // Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//        int y = sc.nextInt();

//        System.out.println("Entered numbers sum is: ");
        int sum = obj.add ();
        System.out.println(sum);

        System.out.println(obj.subs());
        System.out.println(obj.multi());


        Algebra obj2 = new Algebra(10,7);
        System.out.println(obj2.add());
        System.out.println(obj2.subs());
        System.out.println(obj2.multi());



        // Standard Library Methods
//        System.out.println(Math.sqrt(24));
//        System.out.println(Math.sqrt(16)); //4
//
//        System.out.println(Math.floor(5.9)); //5
//        System.out.println(Math.floor(5.5)); //5
//
//        System.out.println(Math.ceil(6.1)); //7
//        System.out.println(Math.ceil(5.9)); //6
//
//        System.out.println(Math.pow(5,2)); //25
//        System.out.println(Math.pow(3,3)); //27

    }
}