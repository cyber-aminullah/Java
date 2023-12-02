class SalaryCountOfCustomer
{
public static void main(String[] args)
{
String Name = "Md Amin Ullah Sheikh";
double BasicSalary = 5000;
SalaryCountOfCustomer SalaryObject = new SalaryCountOfCustomer();
double FinalSalary1 = SalaryObject.SalaryCount(BasicSalary);
double FinalSalary3 = SalaryObject.pension(FinalSalary1);
System.out.println("Customer Name :"+Name);
System.out.println("Final Salary : "+FinalSalary3+" RM");
}

double SalaryCount(double BasicSalary1 )
{

double allowance = BasicSalary1*10/100;
double ResearchAllowance = BasicSalary1*15/100;
double FinalSalary = BasicSalary1 + allowance + ResearchAllowance;
return FinalSalary;
}

double pension(double FinalSalary2)
{
double pension1 = FinalSalary2*8/100;
FinalSalary2 =  FinalSalary2 - pension1;
return  FinalSalary2;
}
}