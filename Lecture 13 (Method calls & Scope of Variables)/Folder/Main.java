import java.util.Scanner;

class Algebra{
//    int a = 10; //member variables
//    int b = 20;

    int add(){
        int p = 100;
        int q = 20;
        return p + q;
    }

    int subs(){
        int p = 100;
        int q = 20;
        return p - q;
    }

    void demo (){
        int a = 5;
        System.out.println(a);
//        System.out.println(b);
        for (int i=0; i<5; i++)
        {
            System.out.println(i);
//            int b = 7;
//            System.out.println(b); //10
        }
        for (int i = 0; i<2; i++)
        {
//            int b =100;
//            System.out.println(b); //100
            System.out.println(i);
        }
    }
}

public class Main {

    static void changeValue(int a){
        a *=100;
        System.out.println("Inside changing value " + a);

    }

    public static void main(String[] args) {
//        Algebra obj = new Algebra();
//        obj.demo();

        int a = 10;
        System.out.println("Before changing value " + a);
        changeValue(a);
        System.out.println("After changing value " + a);
    }
}