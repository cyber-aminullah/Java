class Lab_Eight{
public static void main(String[] args){
Lab_Eight object1 = new Lab_Eight();
object1.SwapTwoNumbers();
}

void SwapTwoNumbers()
{
int a = 6, b = 8;
System.out.println("Before swap the value of a = "+a+" and b = "+b);
int temp = a;
a = b;
b = temp;
System.out.println("After swap the value of a = "+a+" and b = "+b);
}

}