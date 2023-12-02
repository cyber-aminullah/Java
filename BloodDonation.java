class BloodDonation{
public static void main(String[] args){

BloodDonation Person = new BloodDonation(); //create object

Person.Details(); //calling method


}

void Details(){   
int age = 20;
int weight = 60; 
if (age>18 && weight>50)
{
System.out.println("The person can donate Blood");

}
else
{
System.out.println("The person can not donate Blood");
}

}
}