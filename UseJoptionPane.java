import javax.swing.*;
class UseJoptionPane{
public static void main(String[] args){
String number1 = JOptionPane.showInputDialog("Enter the first number:");
String number2 = JOptionPane.showInputDialog("Enter the second number:");
String number3 = JOptionPane.showInputDialog("Enter the third number:");

double num1 = Double.parseDouble(number1);
double num2 = Double.parseDouble(number2);
double num3 = Double.parseDouble(number3);

double total = num1 + num2 + num3;
double average = total/3;

double largest = Math.max(Math.max(num1,num2),num3);
double smallest = Math.min(Math.min(num1,num2),num3);

String message = "The total is "+total+"\n";
message = message + "The average is "+average+"\n";
message = message + "The largest number is "+largest+"\n";
message = message + "The smallest number is "+smallest+"\n";

JOptionPane.showMessageDialog(null, message);
}
}