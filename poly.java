class poly{

    public static void main(String[] args)
    {
    int a = 10, b = 15;
    String  name1 = "Tayyibah ";
    String name2 = "Maria";  
    poly obj1 = new poly();
    obj1.method(a, b);
    obj1.method(name1, name2);
    }


void method(int x, int y)
{
int sum = x+y;
System.out.println("sum "+sum);
}



void method(String n1, String n2)
{
String fullname = n1+n2;
System.out.println(fullname);
}

}