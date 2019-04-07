public class Rectangle
{
	private double width = 1;
	private double height = 1;
	Rectangle()
	{
		
	}
	Rectangle(double aWidth, double aHeight)
	{
		width = aWidth;
		height = aHeight;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	public double getArea()
	{
		double area = width*height;
		return area;
	}
	public double getPerimeter()
	{
		double perimeter = (width*2)+(height*2);
		return perimeter;
	}
}