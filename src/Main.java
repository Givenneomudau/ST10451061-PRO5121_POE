/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        
        //this method it allows the user to capture 10 Students
        Student[] students = new Student[10];
        Scanner scanner = new Scanner(System.in);

        
        // this method allows the user to capture a new students, search student, delete student, view student and exit the application
        while (true) {
            System.out.println("Press 1 to Enter the Menus");
            System.out.println("Menu:");
            System.out.println("1. Capture new student");
            System.out.println("2. Search for student");
            System.out.println("3. Delete student");
            System.out.println("4. View student report");
            System.out.println("5. Exit application");

            
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
           //this methods switch the choice when the user capturing a Student
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age;
                    while (true) {
                        try {
                            
                            // this methods show Student must not be less than 16 years
                            
                            age = scanner.nextInt();
                            if (age < 16) {
                                System.out.println("Invalid age. Please enter a valid age (16 or above).");
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a number.");
                            scanner.nextLine();
                        }
                    }
                    
                    
                    // this method allows the user to enter the student's Course
                    
                    
                    scanner.nextLine();
                    System.out.print("Enter student course: ");
                    String course = scanner.nextLine();

                    Student newStudent = new Student(id, name, age, course);
                    Student.saveStudent(students, newStudent);
                    break;
                case 2:
                    
                    
                    // this method allows the user to Search for Student's ID
                    
                    
                    
                    System.out.print("Enter student ID to search: ");
                    String searchId = scanner.nextLine();
                    Student foundStudent = Student.searchStudent(students, searchId);
                    if (foundStudent != null) {
                        System.out.println("Student found:");
                        System.out.println("ID: " + foundStudent.getId());
                        System.out.println("Name: " + foundStudent.getName());
                        System.out.println("Age: " + foundStudent.getAge());
                        System.out.println("Course: " + foundStudent.getCourse());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    
                    
                    // This method allows the user to Delete the students
                    
                    
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    Student.deleteStudent(students, deleteId);
                    break;
                case 4:
                    Student.studentReport(students);
                    break;
                case 5:
                    Student.exitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please try");
            }
        }
    }
}
    
