import javax.swing.*;
class diviisibleGui{
public static void main(String[] args){
String num = JOptionPane.showInputDialog("Enter the number: ");
double num1 = Double.parseDouble(num);
if(num1%3==0||num1%5==0)
{
String message = "The number is divisible by 3 or 5";
JOptionPane.showMessageDialog(null, message);
}

else
{
String message = "The number is not divisible by 3 or 5";
JOptionPane.showMessageDialog(null, message);
}

}
}