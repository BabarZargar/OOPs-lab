interface Employee{
    void display();
    void calculateSalary();
}

class Manager implements Employee{
    String name;
    double salary;
    double id;

    public Manager() {
        this.name = "blank";
        this.salary = 0;
        this.id = 131;
    }

    public Manager(String name, double salary, double id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public void calculateSalary(){
        System.out.println("manager with id: " + id + " has salary = 80000");
    }
}

class Developer implements Employee{
    String name;
    double salary;
    int courses;

    public Developer(){
        this.name = "blank";
        this.salary = 0;
        this.courses = 10;
    }

    public Developer(String name, double salary, int courses){
        this.name = name;
        this.salary = salary;
        this.courses = courses;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public void calculateSalary(){
        System.out.println("developer who has done total courses: " + courses + " has salary = 100000");
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
