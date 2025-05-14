import java.util.*;

class School {
    int students = 0, teachers = 0, classes = 0;

    void addStudent() { students++; }
    void addTeacher() { teachers++; }
    void addClass() { classes++; }

    void removeStudent() { if (students > 0) students--; }
    void removeTeacher() { if (teachers > 0) teachers--; }
    void removeClass() { if (classes > 0) classes--; }

    void printInfo() {
        System.out.println("Number of students: " + students);
        System.out.println("Number of teachers: " + teachers);
        System.out.println("Number of classes: " + classes);
    }
}

class SchoolClass {
    String name, teacher;
    int students;

    SchoolClass(String name, String teacher, int students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    void printClass() {
        System.out.println("Class name: " + name);
        System.out.println("Teacher: " + teacher);
        System.out.println("Number of students: " + students);
    }
}

public class RazaSchool {
    public static void main(String[] args) {
        School s = new School();
        SchoolClass math = new SchoolClass("Mathematics", "Jens Amalia", 4);
        SchoolClass eng = new SchoolClass("English", "Elise Gliwedin", 3);
        SchoolClass sci = new SchoolClass("Science", "Angelika Lotta", 4);

        s.addStudent(); s.addStudent(); s.addStudent(); s.addStudent();
        s.addTeacher(); s.addTeacher(); s.addTeacher();
        s.addClass(); s.addClass(); s.addClass();

        System.out.println("School information:");
        s.printInfo();

        System.out.println("\nMath class information:");
        math.printClass();

        System.out.println("\nEnglish class information:");
        eng.printClass();

        System.out.println("\nScience class information:");
        sci.printClass();

        s.removeStudent();
        s.removeTeacher();
        s.removeClass();

        System.out.println("\nSchool information after removing one student, teacher and Class:");
        s.printInfo();
    }
}