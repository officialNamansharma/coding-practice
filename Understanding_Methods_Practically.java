// Parent Class (Encapsulation)
class Person {
    private String name;   // data hiding
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods (Encapsulation)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child Class (Inheritance)
class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);  // calling parent constructor
        this.rollNumber = rollNumber;
    }

    // Polymorphism (Method Overriding)
    @Override
    public void display() {
        super.display();
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main Class
public class OOPExample {
    public static void main(String[] args) {
        Student s1 = new Student("Mohit", 22, 101);
        s1.display();
    }
}