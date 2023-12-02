class Lab_Eight{
public static void main(String[] args)
{
Lab_Eight object1 = new Lab_Eight();
object1.SwapTwoNumbers();
object1.swap_without_third_variable();
object1.Sum_Of_Three_Digit_Number();
}

void SwapTwoNumbers()
{
int a = 6, b = 8;
System.out.println("Before swap  the value of a = "+a+" and b = "+b);
int temp = a;
a = b;
b = temp;
System.out.println("After swap by using third variable the value of a = "+a+" and b = "+b);
}

void swap_without_third_variable()
{
int a =6, b = 8;
System.out.println("Before swap the value of a = "+a+" and b = "+b);
a = a+b;
b = a-b;
a = a-b;
System.out.println("After swap without  using third variable the value of a = "+a+" and b = "+b);
}

void Sum_Of_Three_Digit_Number()
{
int number = 123 ;  
int sum = 0;
while(number>0)
{
int digit = number%10;
sum = sum + digit;
number =  number/10;
}
System.out.println("Sum of three digit of the number = "+sum);
}
} 