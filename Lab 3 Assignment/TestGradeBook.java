public class TestGradeBook
{
	public static void main(String [] args)
	{
		GradeBook firstBook = new GradeBook("book 1", 4);
		GradeBook secondBook = new GradeBook("book 2", 7);
		
		firstBook.addStudentResult("17234522", 1, 75.5);
		secondBook.addStudentResult("17234522", 2, 50);
		
		firstBook.addStudentResult("17230659", 1, 90);
		secondBook.addStudentResult("17230659", 2, 100);
		
		System.out.println(firstBook.toString());
		System.out.println(secondBook.toString());		
	}
}