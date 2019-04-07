public class TestRectangle
{
	public static void main(String[] args)
	{
		Rectangle FirstRectangle = new Rectangle();
		Rectangle SecondRectangle = new Rectangle(4.0,5.5);
		System.out.println(FirstRectangle.getWidth());
		System.out.println(FirstRectangle.getHeight());
		System.out.println(FirstRectangle.getArea());
		System.out.println(FirstRectangle.getPerimeter());
		System.out.println(SecondRectangle.getHeight());
		System.out.println(SecondRectangle.getWidth());
		System.out.println(SecondRectangle.getArea());
		System.out.println(SecondRectangle.getPerimeter());
	}
}