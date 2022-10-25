package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        //Student 1 Creation & Data Entry

        System.out.println("Please enter the name of the student: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        StudentDetails Student1 = new StudentDetails();
        Student1.setName(name);
        System.out.println("You entered: " + Student1.getName());

        System.out.println("Please enter the email: ");
        String email = input.next();
        Student1.setEmail(email);
        System.out.println("You entered: " + Student1.getEmail());

        System.out.println("Please enter the course: ");
        String course = input.next();
        Student1.setCourse(course);
        System.out.println("You entered: " + Student1.getCourse());

        //Student 2 Creation & Data Entry

        System.out.println("\nPlease enter the name of the second student: ");
        name = input.next();
        StudentDetails Student2 = new StudentDetails(name);
        System.out.println("You entered: " + Student1.getName());

        System.out.println("Please enter the email: ");
        email = input.next();
        Student2.setEmail(email);
        System.out.println("You entered: " + Student2.getEmail());

        System.out.println("Please enter the course: ");
        course = input.next();
        Student2.setCourse(course);
        System.out.println("You entered: " + Student2.getCourse());

        //Student 3 Creation & Data Entry

        System.out.println("\nPlease enter the name of the third student: ");
        name = input.next();
        System.out.println("You entered: " + name);

        System.out.println("Please enter the email: ");
        email = input.next();
        System.out.println("You entered: " + email);

        System.out.println("Please enter the course: ");
        course = input.next();
        System.out.println("You entered: " + course);
        StudentDetails Student3 = new StudentDetails(name, email, course);


    }
}
