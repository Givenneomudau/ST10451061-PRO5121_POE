/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Student {

    static void deleteStudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
 

    private String id;
    private String name;
    private int age;
    private String course;

    public Student(String id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    
    // this method allows the user to save 10 students only if usave more than 10 students it Print no space available to save the students
    
    public static void saveStudent(Student[] students, Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                
                students[i] = newStudent;
                System.out.println("Student saved successfully!");
                return;
            }
        }
        System.out.println("No space available to save student.");
    }

    
    // this method allows the user to search for the Students
    
    public static Student searchStudent(Student[] students, String id) {
        for (Student student : students) {
            if (student != null && student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    
    
    // this method allows the user to Delete the Student
    
    
    public static void deleteStudent(Student[] students, String id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId().equals(id)) {
                students[i] = null;
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    
    
    
    // this methods displays the Information after Capturing a Student
    
    

    public static void studentReport(Student[] students) {
        System.out.println("Student Report:");
        for (Student student : students) {
            if (student != null) {
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Course: " + student.getCourse());
                System.out.println();
            }
        }
    }
    
    
    // this method allows the user to exit after capturing a students or Anything

    public static void exitStudentApplication() {
        System.out.println("Exiting application. Goodbye!");
        System.exit(0);
    }
}

   
