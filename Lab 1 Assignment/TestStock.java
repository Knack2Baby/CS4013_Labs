public class TestStock
{
	public static void main(String [] args)
	{
		Stock FirstStock = new Stock("LKSS", "Limerick Software Solutions");
		System.out.println(FirstStock.getName());
		System.out.println(FirstStock.getChangePercent() + "%");
	}
}