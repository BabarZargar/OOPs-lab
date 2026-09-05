// create a class employee attributes employee id salary department etc create class teaching non teaching manager and out sourced all these classes will inherit employee manager will have a manager id and some other attributes teacher will no of courses and name of courses assigned and non teaching will have section and out sourced will have tenure calculate mehtod salary that will be overwritten throughout the classes now manager will have both employee id and manager id so we have to overwrite, use super keyword method overwriting 
import java.util.Scanner;

class Employee{
    int id;
    String name;
    double baseSalary;
    String department;

    public Employee(int id, String name, double baseSalary, String department){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public double calculateSalary(){
        return baseSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Calculated Salary: ₹" + calculateSalary());
    }

}

class Manager extends Employee{
    private int managerId;
    double bonus;

    public Manager(int id, String name, double baseSalary, String department, int managerId, double bonus){
        super(id, name, baseSalary, department);
        this.managerId = managerId;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nManager");
        System.out.println("Manager ID: " + managerId);
        super.displayDetails();
    }
}

class Teaching extends Employee{
    int numberOfCourses;
    double payPerCourse;

    public Teaching(int id, String name, double baseSalary, String department, int numberOfCourses, double payPerCourse){
        super(id, name, baseSalary, department);
        this.numberOfCourses = numberOfCourses;
        this.payPerCourse = payPerCourse;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (numberOfCourses * payPerCourse);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nTeaching");
        System.out.println("no. of courws: " + numberOfCourses);
        super.displayDetails();
    }
}

class NonTeaching extends Employee{
    String section;
    int days;

    public NonTeaching(int id, String name, double baseSalary, String department, String section, int days){
        super(id, name, baseSalary, department);
        this.section = section;
        this.days = days;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (days*3000);
    }
    @Override
    public void displayDetails() {
        System.out.println("\nNonTeaching");
        System.out.println("section: " + section);
        super.displayDetails();
    }
}

class OutSourced extends Employee{
    int tenure;
    double perhour;
    int hours;

    public OutSourced(int id, String name, double baseSalary, String department, int tenure, double perhour, int hours) {
        super(id, name, baseSalary, department);
        this.tenure = tenure;
        this.perhour = perhour;
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (hours * perhour);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nOut sourced");
        System.out.println("tenure in months: " + tenure);
        super.displayDetails();
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Employee Type to Register:");
        System.out.println("1. Manager");
        System.out.println("2. Teaching");
        System.out.println("3. Non Teaching");
        System.out.println("4. Out Sourced");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee name: ");
        String name = sc.nextLine();


        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        Employee emp = null;

        switch (choice) {
            case 1:
                System.out.print("Enter Base Salary: ");
                double mgrSalary = sc.nextDouble();
                System.out.print("Enter Manager ID: ");
                int managerId = sc.nextInt();
                System.out.print("Enter Bonus: ");
                double bonus = sc.nextDouble();

                emp = new Manager(id, name, mgrSalary, department, managerId, bonus);
                break;

            case 2:
                System.out.print("Enter Base Salary: ");
                double teachSalary = sc.nextDouble();
                System.out.print("Enter Number of Courses: ");
                int numCourses = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Enter Pay Per Course: ");
                double payPerCourse = sc.nextDouble();

                emp = new Teaching(id, name, teachSalary, department, numCourses,  payPerCourse);
                break;

            case 3:
                System.out.print("Enter Base Salary: ");
                double ntSalary = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter Section: ");
                String section = sc.nextLine();
                System.out.print("Enter Overtime Allowance: ");
                int days = sc.nextInt();

                emp = new NonTeaching(id, name, ntSalary, department, section, days);
                break;

            case 4:
                System.out.print("Enter Base Salary: ");
                double osSalary = sc.nextDouble();
                System.out.print("Enter Tenure (in months): ");
                int tenure = sc.nextInt();
                System.out.print("Enter Hourly Rate: ");
                double rate = sc.nextDouble();
                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();

                emp = new OutSourced(id, name, osSalary, department, tenure, rate, hours);
                break;

            default:
                System.out.println("Invalid choice selected!");
                sc.close();
                return;
        }

        emp.displayDetails();
        
        sc.close();
    }
}
