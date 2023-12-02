class CustomerInterest{

public static void main(String[] args){

float capital = 10000.00f;

CustomerInterest object1 = new CustomerInterest();

float NewCapital1 =object1.interest(capital);//method calling, where passing arguments

System.out.println("New Capital with interest is: "+NewCapital1);
}

float interest(float capital1) //passing parameters
{
float Interest = (float)capital1*10/100  ;
System.out.println("Total interest : "+Interest);

float NewCapital = capital1 + Interest;

return NewCapital;

}

}