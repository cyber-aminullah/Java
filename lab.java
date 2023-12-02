class lab{
int x=80, y=85, z= 90;
int total = x+y+z;
float avg = total/3.0f;
public static void main(String[] args)
{
lab number = new lab();

number.largest();
number.smallest();
number.math();
number.Grade();
number.divid();
number.month();
}

void math()
{
System.out.println("Total mark is:"+total);
System.out.println("Total average is:"+avg);
}

void largest()
{
if(x>y&&x>z)
{
System.out.println("X is largest number");
}

if(y>x&&y>z)
{
System.out.println("y is largest number");
}

if(z>x&&z>y)
{
System.out.println("z is largest number");
}
}

void smallest()
{
if(x<y&&x<z)
{
System.out.println("X is smallest number");
}
if(y<x&&y<z)
{
System.out.println("y is smallest number");
}

if(z<x&&z<y)
{
System.out.println("z is smallest number");
}
}

void Grade()
{

if(avg>=75)
{
System.out.println("Grade=A ");
}


else if(avg>=65)
{
System.out.println("Grade=B ");
}

else if(avg>=50)
{
System.out.println("Grade=C ");
}

else if(avg>=40)
{
System.out.println("Grade=D ");
}

else if(avg<30)
{
System.out.println("Grade=E ");
}

}

void divid()
{
int a = 100;
if(a%5==0||a%6==0)
{
System.out.println("100 is divisible by 5 or 6, but not both");
}
else if(a%5==0&&a%6==0)
{
System.out.println("100 is divisible by both 5 and 6");
}
else
System.out.println("100 is not divisible by either  5 or 6");

} 

void month()
{
int serial = 5;
switch(serial)
{
case 1:
System.out.println("The month is January and 31 days");
break;

case 2:
System.out.println("The month is February and 28 or 29 days");
break;

case 3:
System.out.println("The month is March and 31 days");
break;

case 4:
System.out.println("The month is April and 30 days");
break;

case 5:
System.out.println("The month is May and 31 days");
break;

case 6:
System.out.println("The month is June and 30 days");
break;

case 7:
System.out.println("The month is July and 31 days");
break;

case 8:
System.out.println("The month is August and 31 days");
break;

case 9:
System.out.println("The month is September and 30 days");
break;

case 10:
System.out.println("The month is October and 31 days");
break;

case 11:
System.out.println("The month is November and 30 days");
break;

case 12:
System.out.println("The month is December and 31 days");
break;
default:
System.out.println("Invalid month");
}
}

}