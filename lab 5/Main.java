class Employee{
    public String name;
    protected double salary;
    String dept;
    private int empId;

    Employee(String name, double salary, String dept, int empId){
        this. name = name;
        this.salary = salary;
        this.dept = dept;
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}

class Manager extends Employee{
    String designation;

    Manager(String name, double salary, String dept, int empId, String designation){
        super(name, salary, dept, empId);
        this.designation = designation;
    }
}

public class Main{
    public static void main(String[] args) {
        Manager m = new Manager("Babar", 100000, "IT", 131, "lead");
        System.out.println("Name: " + m.name);
        System.out.println("Salary: " + m.salary);
        System.out.println("Department: " + m.dept);
        System.out.println("Employee ID: " + m.getEmpId());
        System.out.println("Designation: " + m.designation);
        m.setEmpId(101);
        System.out.println("Updated Employee ID: " + m.getEmpId());
    }
}