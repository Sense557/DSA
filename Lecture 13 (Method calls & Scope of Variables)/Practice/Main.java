/**
 * Main
 */
public class Main 
{

    static void changeValue(int q)
    {
        q*=100;    
        // System.out.println(a);
    }
    public static void main(String[] args) 
    {
        int a = 5;
        //before changing value
        System.out.println(a);

        changeValue(a);

        //After changing value
        System.out.println(a);
        System.out.println(q);
    }
    
}