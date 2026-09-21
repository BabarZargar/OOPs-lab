abstract class Employee{
    String name;
    double salary;
    public Employee(){
        this.name = "blank";
        this.salary = 0;
    }
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    abstract void calculateSalary();
}

class Manager extends Employee{
    double id;

    public Manager() {
        super();
        this.id = 131;
    }

    public Manager(String name, double salary, double id){
        super(name, salary);
        this.id = id;
    }

    void calculateSalary(){
        System.out.println("manager with id: " + id + "has salary = 80000");
    }
}

class Developer extends Employee{
    int courses;

    public Developer(){
        super();
        this.courses = 10;
    }

    public Developer(String name, double salary, int courses){
        super(name, salary);
        this.courses = courses;
    }

    void calculateSalary(){
        System.out.println("developer who has done total courses: " + "has salary = 100000");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Developer d1 = new Developer();

        d1.display();
        d1.calculateSalary();

        m1.display();
        m1.calculateSalary();

        Manager m2 = new Manager("Babar", 200000, 131);
        Developer d2 = new Developer("Natiq", 100000, 10);

        m2.display();
        d2.display();
        m2.calculateSalary();
        d2.calculateSalary();
    }
}
