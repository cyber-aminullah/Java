import java.util.Scanner;
class lab_nine_q2{
public static void main(String[] args){

int n, i;
String[] bird = new String[3];
Scanner input = new Scanner(System.in);
System.out.print("How Many Element You Want to Store in Array ? ");
n = input.nextInt();
System.out.print("Enter " + n + " Element to Store in Array : ");
for(i=0; i<n; i++)
{
bird[i] = input.nextString();
}
System.out.println("The names of the birds are:");
for(i=0; i<n; i++)
{
System.out.print(bird[i]+ " ");
}
}
}