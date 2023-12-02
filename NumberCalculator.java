import javax.swing.*;
public class NumberCalculator {
    public static void main(String[] args) {
        // Prompt the user to input three numbers
        String num1Str = JOptionPane.showInputDialog("Enter the first number:");
        String num2Str = JOptionPane.showInputDialog("Enter the second number:");
        String num3Str = JOptionPane.showInputDialog("Enter the third number:");

        // Convert the input strings to double values
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double num3 = Double.parseDouble(num3Str);

        // Calculate the total, average, largest, and smallest number
        double total = num1 + num2 + num3;
        double average = total / 3.0;
        double largest = Math.max(Math.max(num1, num2), num3);
        double smallest = Math.min(Math.min(num1, num2), num3);

        // Display the results using the Message dialog box
        String message = "The total is " + total + "\n";
        message += "The average is " + average + "\n";
        message += "The largest number is " + largest + "\n";
        message += "The smallest number is " + smallest + "\n";
        JOptionPane.showMessageDialog(null, message);
    }
}