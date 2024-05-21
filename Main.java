package Employees;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService(10);

        // Input data for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Company: ");
            String company = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Post: ");
            String post = scanner.nextLine();
            System.out.print("City: ");
            String city = scanner.nextLine();

            Employee employee = new Employee(id, name, company, salary, department, post, city);
            employeeService.addEmployee(employee);
        }

        // a. Find total salary of all employees
        double totalSalary = employeeService.getTotalSalary();
        System.out.println("Total salary of all employees: " + totalSalary);

        // b. Print employees of IT department
        System.out.println("Employees in IT department:");
        for (Employee emp : employeeService.getEmployeesByDepartment("IT")) {
            System.out.println(emp.getName());
        }

        //Count employees of Admin department
        int adminCount = employeeService.getEmployeeCountByDepartment("Admin");
        System.out.println("Number of employees in Admin department: " + adminCount);

        //Count and print employees of a particular city
        System.out.print("Enter city to count and list employees: ");
        String searchCity = scanner.nextLine();
        int cityCount = employeeService.getEmployeesByCity(searchCity).length;
        System.out.println("Employees in " + searchCity + ":");
        for (Employee emp : employeeService.getEmployeesByCity(searchCity)) {
            System.out.println(emp.getName());
        }
        System.out.println("Number of employees in " + searchCity + ": " + cityCount);

        //Calculate total salary of a particular department
        System.out.print("Enter department to calculate total salary: ");
        String searchDepartment = scanner.nextLine();
        double departmentTotalSalary = employeeService.getTotalSalaryByDepartment(searchDepartment);
        System.out.println("Total salary in " + searchDepartment + " department: " + departmentTotalSalary);

       // highest and lowest salary of employees
        double highestSalary = employeeService.getHighestSalary();
        double lowestSalary = employeeService.getLowestSalary();
        System.out.println("Highest salary: " + highestSalary);
        System.out.println("Lowest salary: " + lowestSalary);
    }
}
