public class Square extends GeometricObject implements Colorable
{
	private double width;
	private double height;
	private String result;
	Square(double aWidth, double aHeight)
	{
		width = aWidth;
		height = aHeight;
	}
	public void howToColor()
	{
		System.out.println("Colour all four sides\n");
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
		double perimiter = 2*(width+height);
		return perimiter;
	}
	public String toString()
	{
		result = "Shape = Square" + "\n";
		result += "Width = " + width + "\n";
		result += "Height = " + height + "\n";
		result += "Area = " + getArea() + "\n";
		result += "Perimeter = " + getPerimeter();
		return result;
	}
}