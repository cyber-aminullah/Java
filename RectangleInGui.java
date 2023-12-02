import javax.swing.*;
class RectangleInGui{
public static void main(String[] args){
String Width = JOptionPane.showInputDialog("Enter the width of the rectangle: ");
String Height = JOptionPane.showInputDialog("Enter the height of the rectangle: ");

double width  = Double.parseDouble(Width);
double height  = Double.parseDouble(Height);

double Area = width*height;
String message = "Area of the rectangle is "+Area;
JOptionPane.showMessageDialog(null,message);
}
}