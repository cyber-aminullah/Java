import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int totalEmployees = input.nextInt();

        int[] employeeID = new int[totalEmployees];
        String[] employeeName = new String[totalEmployees];
        double[] basicSalary = new double[totalEmployees];
        double[] netPay = new double[totalEmployees];
        double[] epfSavings = new double[totalEmployees];

        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            employeeID[i] = input.nextInt();

            input.nextLine(); 

            System.out.print("Employee Name: ");
            employeeName[i] = input.nextLine();

            System.out.print("Basic Salary: ");
            basicSalary[i] = input.nextDouble();

            double allowance, epf;

            if (basicSalary[i] < 5000) {
                allowance = 0.05 * basicSalary[i];
                epf = 0.03 * basicSalary[i];
            } else if (basicSalary[i] >= 5000 && basicSalary[i] <= 10000) {
                allowance = 0.08 * basicSalary[i];
                epf = 0.05 * basicSalary[i];
            } else {
                allowance = 0.1 * basicSalary[i];
                epf = 0.07 * basicSalary[i];
            }

            netPay[i] = basicSalary[i] + allowance - epf;
            epfSavings[i] = epf;
        }

        System.out.println("\nEmployee Details:");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-15s %-20s %-15s %-10s %-12s\n", "Employee ID", "Employee Name", "Basic Salary", "Net Pay", "EPF Savings");
        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < totalEmployees; i++) {
            System.out.printf("%-15d %-20s %-15.2f %-10.2f %-12.2f\n", employeeID[i], employeeName[i], basicSalary[i], netPay[i], epfSavings[i]);
        }
        
        System.out.println("---------------------------------------------------------------------------");
    }
}