import java.io.*;
import java.util.*;
public class GradeBook
{
	private String gradeBookName = "";
	private int numberOfTests = 0;
	private boolean found = false;
	private String result = "";
	ArrayList<StudentResult> book = new ArrayList<StudentResult>();
	GradeBook(String aGradeBookName, int aNumberOfTests)
	{
		gradeBookName = aGradeBookName;
		numberOfTests = aNumberOfTests;
	}
	public void addStudentResult(String id, int testId, double value)
	{
		if(book.size() == 0)
		{
			StudentResult student = new StudentResult(id);
			student.addResult(id, value);
			book.add(student);
		}
		else
		{
			while(!found)
			{
				for(int i = 0; i < book.size(); i++)
				{
					if(book.get(i).getStudentID().equals(id))
					{
						book.get(i).addResult(id, value);
						found = true;
					}
				}
			}
			if(!found)
			{
				StudentResult student = new StudentResult(id);
				student.addResult(id, value);
				book.add(student);
			}
		}
	}
	public String toString()
	{
		for(int i = 0; i < book.size(); i++)
		{
			result += book.get(i).toString() + "\n";
		}
		return result;
	}
}