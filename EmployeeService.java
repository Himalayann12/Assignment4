package Employees;

public class EmployeeService {
    private Employee[] employees;
    private int count;

    public EmployeeService(int capacity) {
        this.employees = new Employee[capacity];
        this.count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Employee array is full!");
        }
    }

    public double getTotalSalary() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public Employee[] getEmployeesByDepartment(String department) {
        Employee[] result = new Employee[count];
        int resultCount = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(department)) {
                result[resultCount++] = employees[i];
            }
        }
        Employee[] trimmedResult = new Employee[resultCount];
        System.arraycopy(result, 0, trimmedResult, 0, resultCount);
        return trimmedResult;
    }

    public int getEmployeeCountByDepartment(String department) {
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(department)) {
                count++;
            }
        }
        return count;
    }

    public Employee[] getEmployeesByCity(String city) {
        Employee[] result = new Employee[count];
        int resultCount = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getCity().equalsIgnoreCase(city)) {
                result[resultCount++] = employees[i];
            }
        }
        Employee[] trimmedResult = new Employee[resultCount];
        System.arraycopy(result, 0, trimmedResult, 0, resultCount);
        return trimmedResult;
    }

    public double getTotalSalaryByDepartment(String department) {
        double total = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(department)) {
                total += employees[i].getSalary();
            }
        }
        return total;
    }

    public double getHighestSalary() {
        double highest = Double.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (employees[i].getSalary() > highest) {
                highest = employees[i].getSalary();
            }
        }
        return highest;
    }

    public double getLowestSalary() {
        double lowest = Double.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            if (employees[i].getSalary() < lowest) {
                lowest = employees[i].getSalary();
            }
        }
        return lowest;
    }
}
