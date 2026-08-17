import java.util.Scanner;

class Employee{
    String name;
    int id;
    String team;
    String courseAssigned;
    String agency;
    

    // 1
    Employee(){
        name = "not assigned";
        id = 0;
        team = "not assigned";
        courseAssigned = "not assigned";
        agency = "not assigned";
    }

    // 2
    Employee(String name, int id, String team){
        this.name = name;
        this.id = id;
        this.team = team;
        this.courseAssigned = "N/A";
        this.agency = "N/A";
    }

    // 3
    Employee(String name, String courseAssigned, int id){
        this.name = name;
        this.id = id;
        this.team = "N/A";
        this.courseAssigned = courseAssigned;
        this.agency = "N/A";
    }

    // 4
    Employee(int id, String name, String agency){
        this.name = name;
        this.id = id;
        this.team = "N/A";
        this.courseAssigned = "N/A";
        this.agency = agency;
    }

    // 2 salary
    double salary(double base, double bonus){
        return base + bonus;
    }

    // 3 salary
    double salary(int workingHours, double perHour){
        return workingHours * perHour;
    }

    // 4 salary
    double salary(double perDay, int days){
        return perDay * days;
    }

    void display(){
        System.out.println("\nEmployee details: ");
        System.out.println("name: " + name);
        System.out.println("ID: " + id);
        System.out.println("team: " + team);
        System.out.println("course assigned: " + courseAssigned);
        System.out.println("agency: " + agency);
    }
}

public class EmployeePC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee employee;
        double employeeSalary = 0;

        System.out.println("1. Default");
        System.out.println("2. Admin");
        System.out.println("3. Teacher");
        System.out.println("4. Outsourced Employee");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            employee = new Employee();
        } 
        else if (choice == 2) {
            System.out.print("Enter team: ");
            String team = sc.nextLine();
            employee = new Employee(name, id, team);

            System.out.print("Enter base salary: ");
            double base = sc.nextDouble();
            System.out.print("Enter bonus: ");
            double bonus = sc.nextDouble();

            employeeSalary = employee.salary(base, bonus);
        } 
        else if (choice == 3) {
            System.out.print("Enter course assigned: ");
            String courseAssigned = sc.nextLine();
            employee = new Employee(name, courseAssigned, id);

            System.out.print("Enter working hours: ");
            int workingHours = sc.nextInt();

            System.out.print("Enter rate per hour: ");
            double perHour = sc.nextDouble();

            employeeSalary = employee.salary(workingHours, perHour);

        } 
        else if (choice == 4) {
            System.out.print("Enter agency: ");
            String agency = sc.nextLine();
            employee = new Employee(id, name, agency);

            System.out.print("Enter rate per day: ");
            double perDay = sc.nextDouble();

            System.out.print("Enter working days: ");
            int days = sc.nextInt();

            employeeSalary = employee.salary(perDay, days);

        } 
        else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        employee.display();
        if (choice >= 2 && choice <= 4) {
            System.out.println("Salary: " + employeeSalary);
        }
        sc.close();

    }
}
