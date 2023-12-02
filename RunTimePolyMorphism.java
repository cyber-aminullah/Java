class RunTimePolyMorphism
{
    public static void main(String[] args)
    {
        child obj1 = new child();
        obj1.method();
    }
}


class parent
{
    public static void method()
    {
        System.out.println("My name is Maria");

    } 
}


class child extends parent
{
    public static void method()
    {
        System.out.println("My name is Tayyibah");

    } 
}