package Basic;

public class Monkey
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        System.out.println("I'm in main method");
        // Monkey m = new Monkey(); // creating a object
        // m.m1(); // when m1 and m2 are non-static method and main method is static
        // m1(); // when we make m1 and m2 static and main method is also static we directly call method without creating object m.
        Monkey.m1(); // when main method and other methods are static we can directly call with class_name.method
    }

    static void m1()
    {
        System.out.println("I'm inside m1");
        m2();
    }

    static void m2()
    {
        System.out.println("I'm inside m2");
    }
}

