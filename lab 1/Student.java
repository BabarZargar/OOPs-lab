public class Student {
    String name;
    int id;

    static int count = 0;

    Student(String name, int id){
        this.name = name;
        this.id = id;
        Student.count++;
    }

    public static void main(String[] args) {
        Student s1 = new Student("babar", 131);
        Student s2 = new Student("natiq", 7);
        System.out.println("No of students is " + count);
        System.out.println(s1.name + " " + s1.id);
        System.out.println(s2.name + " " + s2.id);
    }
}
