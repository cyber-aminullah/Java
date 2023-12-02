class NumberCheck{
 public static void main(String[] args){

NumberCheck object1 = new NumberCheck();

object1.num1();


}

void num1(){   
int a = 15;

if (a<0)
{
System.out.println("The number is negative");

}
else if (a>0)
{
System.out.println("The number is Positive");

}
else
System.out.println("The number is Zero");
}


}