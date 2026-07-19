
public class Task10 {

    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("John", "Tuu"),
            new Student("Yuuj", "Pains"),
            new Student("Andrew", "EEEE"),
        };
        for (Student s : students) {
            s.printFullName();
        }
    }
    
}

class Student {
    private String firstName;
    private String lastName;
    
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}