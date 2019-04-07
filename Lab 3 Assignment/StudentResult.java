public class StudentResult
{
	private String studentID = "";
	private TestResult firstResult;
	StudentResult(String aStudentID)
	{
		studentID = aStudentID;
		firstResult = new TestResult();
	}
	StudentResult(String aStudentID,int numberOfTestScores)
	{
		studentID = aStudentID;
		firstResult = new TestResult(numberOfTestScores);
	}
	public String getStudentID()
	{
		return studentID;
	}
	public void addResult(String testId, double value)
	{
		firstResult.setScore(testId, value);
	}
	public String toString()
	{
		return firstResult.toString() + "\n" + getStudentID();
	}
}