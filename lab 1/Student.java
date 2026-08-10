public class Student {
    String student;
    int id;

    static int count = 0;

    void setName(String n){
        this.student = n;
        count++;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("babar");
        Student s2 = new Student();
        s2.setName("natiq");
        System.out.println("No of students is " + count);
    }
}
