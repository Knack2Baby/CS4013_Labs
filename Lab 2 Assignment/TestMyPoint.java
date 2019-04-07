public class TestMyPoint
{
	public static void main(String [] args)
	{
		MyPoint FirstPoint = new MyPoint();
		MyPoint SecondPoint = new MyPoint(3.5,5.5);
		System.out.println(FirstPoint.getX());
		System.out.println(FirstPoint.getY());
		System.out.println(SecondPoint.getX());
		System.out.println(SecondPoint.getY());
		System.out.println(FirstPoint.distance(3,5));
		System.out.println(FirstPoint.distance(3,5));
		System.out.println(SecondPoint.distance(5,7));
		System.out.println(SecondPoint.distance(5,7));
	}
}