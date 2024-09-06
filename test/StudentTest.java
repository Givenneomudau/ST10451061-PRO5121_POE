/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mudau
 */
public class StudentTest {
    
  
    
    @BeforeAll
    public static void setUpClass()throws Exception {
        
        // initialize the student list before each test
        
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() throws Exception{
       
        // clear the students list after each test
        
        
        
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class Student.
     */
    @Test
    public void testGetCourse() {
        
        
        
    }

    /**
     * Test of saveStudent method, of class Student.
     */
    @Test
    public void testSaveStudent() {
     
        Student[] students = new Student[10];
        Student newStudent = new Student("123", "John Doe", 20, "Computer Science");
        Student.saveStudent(students, newStudent);
        assertNotNull(students[0]);
        assertEquals(newStudent, students[0]);
        
    }

    
    
    /**
     * Test of searchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent() {
        
        Student[] students = new Student[10];
        Student student1 = new Student("123", "John Doe", 20, "Computer Science");
        Student student2 = new Student("456", "Jane Doe", 21, "Mathematics");
        students[0] = student1;
        students[1] = student2;
        Student foundStudent = Student.searchStudent(students, "123");
        assertEquals(student1, foundStudent);
        
    }

    /**
     * Test of deleteStudent method, of class Student.
     */
    @Test
    public void testDeleteStudent() {
        
        Student[] students = new Student[10];
        Student student1 = new Student("123", "John Doe", 20, "Computer Science");
        Student student2 = new Student("456", "Jane Doe", 21, "Mathematics");
        students[0] = student1;
        students[1] = student2;
        Student.deleteStudent(students, "123");
        assertNull(students[0]);
        
    }

    
     /**
     * Test of testSaveStudent_NoSpaceAvailable method, of class Student.
     */

    @Test
    public void testSaveStudent_NoSpaceAvailable() {
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("123" + i, "John Doe" + i, 20 + i, "Computer Science" + i);
        }
        Student newStudent = new Student("123", "John Doe", 20, "Computer Science");
        Student.saveStudent(students, newStudent);
        assertNull(students[10]); 
    }


     /**
     * Test of testDeleteStudent_not found method, of class Student.
     */

    @Test
    public void testDeleteStudent_NotFound() {
        Student[] students = new Student[10];
        Student student1 = new Student("123", "John Doe", 20, "Computer Science");
        Student student2 = new Student("456", "Jane Doe", 21, "Mathematics");
        students[0] = student1;
        students[1] = student2;
        Student.deleteStudent(students, "789");
        assertNotNull(students[0]);
        assertNotNull(students[1]);
    }

  
    
    /**
     * Test of studentReport method, of class Student.
     */
    @Test
    public void testStudentReport() {
       
        
        Student[] students = new Student[10];
        Student student1 = new Student("123", "John Doe", 20, "Computer Science");
        Student student2 = new Student("456", "Jane Doe", 21, "Mathematics");
        students[0] = student1;
        students[1] = student2;
        Student.studentReport(students);
        
    }

    
    
    /**
     * Test of exitStudentApplication method, of class Student.
     */
    @Test
    public void testExitStudentApplication() {
        
        Student.exitStudentApplication();
        
    }
    
}
