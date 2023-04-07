package pw.skills;

public class App 
{

    public String str_1 = "I am a public member";

    void printFromClass()
    {
        System.out.println("With in class " + str_1);
    }

    public static void main(String[] args) 
    {
        App obj = new App();
        obj.printFromClass();
        System.out.println("With in class " + obj.str_1);

        App2 obj2 = new App2();
        obj2.printFromOutsideClass();

    }
}

class App2
{
    void printFromOutsideClass()
    {
        App obj = new App();
        System.out.println("OutsideClass but same package " + obj.str_1);
    }

}
