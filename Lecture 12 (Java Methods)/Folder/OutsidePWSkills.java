import pw.skills.App;

public class OutsidePWSkills 
{
    static App obj = new App();

    public static void main(String[] args) 
    {
        System.out.println("Outside Package, non-child class " + obj.str_1);

        App3 obj3 = new App3();
        obj3.printFromChildClass();
    }
}

    // App3 is the Child class of parent class App
class App3 extends App
{
    void printFromChildClass()
    {
        App3 obj3 = new App3();
        System.out.println("Child Class " + obj3.str_1);
    }

}