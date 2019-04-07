public class MyPoint
{
	private double x = 0.00;
	private double y = 0.00;
	MyPoint()
	{
		
	}
	MyPoint(double xPoint, double yPoint)
	{
		x = xPoint;
		y = yPoint;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public double distance(MyPoint aPoint)
	{
		double distance = distance(aPoint.getX(), aPoint.getY());
		return distance;
	}
	public double distance(double x2, double y2)
	{
		double distance = Math.sqrt(((x2 - x)*(x2 -x))+((y2 - y)*(y2 - y)));
		return distance;
	}
}