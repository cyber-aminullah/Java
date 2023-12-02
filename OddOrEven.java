class OddOrEven{
 public static void main(String[] args){

OddOrEven object1 = new OddOrEven(); //create object

object1.num1(); //calling method


}

void num1(){   
int a = 10;
int b = a%2; //way to check the number is even or odd
System.out.println("The number is "+a);
if (b==0) //conditional operator
{
System.out.println("The number is Even");

}
else
{
System.out.println("The number is Odd");
}

}
}