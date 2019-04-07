import java.util.*;
import java.io.*;
public class Course {
  private String courseName;
  private ArrayList<String> students = new ArrayList<String>();
  private int numberOfStudents;
    
  /** sets course name 
  * @param courseName
  */
  public Course(String courseName) 
  {
    this.courseName = courseName;
  }
  
  /** adds student to array 
  * @param student
  */
  public void addStudent(String student) 
  {
	  students.add(student);
	  numberOfStudents++;
  }
  
  /** gets students 
  * @return students
  */
  public String[] getStudents() 
  {
	  String[] student = new String[numberOfStudents];
	  student = students.toArray(student); 
	  return student;
  }

  /** gets number of students 
  * @return numberOfStudents
  */
  public int getNumberOfStudents() 
  {
    return numberOfStudents;
  }  

  /** gets course name
  * @return courseName
  */
  public String getCourseName() 
  {
    return courseName;
  }  
  
  /** drops a student 
  * @param student
  */
  public void dropStudent(String student) 
  {
	  for(int i = 0; i < students.size(); i++)
	  {
		  if(student == students.get(i))
		  {
			  students.remove(i);
			  numberOfStudents--;
		  }
	  }
  }
  
  public void clear()
  {
	  ArrayList<String> students = new ArrayList<String>();
  }
}