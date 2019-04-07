public class TestGeometricObjects
{
	public static void main(String [] args)
	{
		Rectangle firstRectangle = new Rectangle(3.7, 5.5);
		Circle firstCircle = new Circle(6.8);
		GeometricObject maximum = GeometricObject.max(firstRectangle, firstCircle);
		System.out.println("The bigger shape is: \n" + maximum.toString());
		GeometricObject[] shapes = new GeometricObject[5];
		shapes[0] = new Circle(9.7);
		shapes[1] = new Rectangle(4.3, 8.6);
		shapes[2] = new Square(1.2, 1.2);
		shapes[3] = new Circle(6.5);
		shapes[4] = new Rectangle(2.8, 3.9);
		for(int i = 0; i < shapes.length; i++)
		{
			System.out.println(shapes[i].toString());
			if(shapes[i] instanceof Colorable)
			{
				((Colorable)shapes[i]).howToColor();
			}
		}
	}
}