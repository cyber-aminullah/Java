class exam
{
    public static void main(String[] args)
    {
        exam tayyibah = new exam(); // creating object
        int a = 50;
        int b = 60;

        int result = tayyibah.xyz(a, b); 
       System.out.println("The result is: "+result);
  
    }

    int xyz(int x, int y) // a value come to x, b value come to y
    {
        int multiply = x * y;

        return multiply;

    }
}