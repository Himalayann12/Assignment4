package Employees;

public class Employee {
    private int id;
    private String name;
    private String company;
    private double salary;
    private String department;
    private String post;
    private String city;

    public Employee(int id, String name, String company, double salary, String department, String post, String city) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.department = department;
        this.post = post;
        this.city = city;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
