import java.io.*;
import java.util.*;
public class TestCourse
{
	public static void main(String [] args)
	{
		Course GamesDevelopment = new Course("Games Development");
     	GamesDevelopment.addStudent("John");
		GamesDevelopment.addStudent("Mary");
		GamesDevelopment.addStudent("Jack");
		GamesDevelopment.dropStudent("Mary");
		int numberOfStudents = GamesDevelopment.getNumberOfStudents();
		String[] students = GamesDevelopment.getStudents();
		for(int i = 0; i< numberOfStudents; i++)
		{
			System.out.println(students[i]);
		}
	}
}