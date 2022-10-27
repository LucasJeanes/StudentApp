package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        String name, course, email;

        //Student 1 Creation & Data Entry

        System.out.println("Please enter the name of the student: ");
        Scanner input = new Scanner(System.in);
        name = input.next();
        StudentDetails Student1 = new StudentDetails();
        Student1.setName(name);

        System.out.println("Please enter the email: ");
        email = input.next();
        Student1.setEmail(email);

        System.out.println("Please enter the course: ");
        course = input.next();
        Student1.setCourse(course);

        //Student 2 Creation & Data Entry

        System.out.println("\nPlease enter the name of the second student: ");
        name = input.next();
        StudentDetails Student2 = new StudentDetails(name);

        System.out.println("Please enter the email: ");
        email = input.next();
        Student2.setEmail(email);

        System.out.println("Please enter the course: ");
        course = input.next();
        Student2.setCourse(course);

        //Student 3 Creation & Data Entry

        System.out.println("\nPlease enter the name of the third student: ");
        name = input.next();

        System.out.println("Please enter the email: ");
        email = input.next();

        System.out.println("Please enter the course: ");
        course = input.next();
        StudentDetails Student3 = new StudentDetails(name, email, course);

        //Once all student details are entered, print to console

        System.out.println("\nAll student details entered.");

        System.out.println("---Student 1---");
        System.out.println("Name: " + Student1.getName() + "\nEmail: " + Student1.getEmail() + "\nCourse: " + Student1.getCourse());

        System.out.println("---Student 2---");
        System.out.println("Name: " + Student2.getName() + "\nEmail: " + Student2.getEmail() + "\nCourse: " + Student2.getCourse());

        System.out.println("---Student 3---");
        System.out.println("Name: " + Student3.getName() + "\nEmail: " + Student3.getEmail() + "\nCourse: " + Student3.getCourse());
    }
}
