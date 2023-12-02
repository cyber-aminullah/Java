import java.util.Scanner;
class sorting
{
public static void main(String [] args)
{
int n, i, j;
Scanner input = new Scanner(System.in);
System.out.println("How many elements you want to store?");
n = input.nextInt();
int [] numbers = new int[n];


System.out.println("Please enter "+n+" elements:");
for( i =0; i<n; i++)
{
numbers[i] = input.nextInt();
}


System.out.println("Before sorting array elements are:");
for( i =0; i<n; i++)
{
System.out.print(numbers[i]+" ");
}

System.out.println("\nAfter sorting array elements are:");
for(i=0; i<n; i++)
{


for(j=i+1; j<n; j++)
if(numbers[i]>numbers[j])
{
int temp = numbers[i];
numbers[i] = numbers[j];
numbers[j] = temp;
}

System.out.print(numbers[i]+" ");
}


}
}