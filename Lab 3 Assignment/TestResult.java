public class TestResult
{
	private double average = 0;
	private double total = 0.00;
	private String grade = "";
	private double[] testScore;
	TestResult(int numberOfTests)
	{
		testScore = new double[numberOfTests];
	}
	TestResult()
	{
		testScore = new double[3];
	}
	public void setScore(int i, double value)
	{
		testScore[i] = value;
	}
	public double getScore(int i)
	{
		return testScore[i];
	}
	public double getAverage()
	{
		return getTotal()/testScore.length;
	}
	public double getTotal()
	{
		for(int i = 0; i<testScore.length; i++)
		{
			total = testScore[i];
		}
		return total;
	}
	public String getGrade()
	{
		for(int i = 0; i<testScore.length; i++)
		{
			total = testScore[i];
			if(total == 0)
		    {
			    grade += "NG\n";
			}
		    else if(total>=1 && total<30)
		    {
			    grade += "F/n";
    		}
	    	else if(total>=30 && total<35)
		    {
			    grade += "D2/n";
    		}
	    	else if(total>=35 && total<40)
		    {
			    grade += "D1/n";
	    	}
	    	else if(total>=40 && total<48)
		    {
			    grade += "C3/n";
	    	}
		    else if(total>=48 && total<52)
		    {  
			    grade += "C2/n";
		    }
    		else if(total>=52 && total<56)
	    	{
		    	grade += "C1/n";
		    }
		    else if(total>=56 && total<60)
		    {
			    grade += "B3/n";
	    	}
		    else if(total>=60 && total<64)
	    	{
		    	grade += "B2/n";
		    }
		    else if(total>=64 && total<72)
	    	{
		    	grade += "B1/n";
		    }
    		else if(total>=72 && total<80)
	    	{
		    	grade += "A2/n";
    		}
	    	else
		    {
			    grade += "A1/n";
     		}
	   	}
		return grade;
	}
	
	public String toString()
	{
		String score = "";
		for(int i = 0; i < testScore.length; i++)
		{
			score += testScore[i] + "/n";
		}
		return getGrade();
	}
}