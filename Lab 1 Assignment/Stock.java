public class Stock
{
	private String symbol;
	private String name;
	private double previousClosingPrice = 79.45;
	private double currentPrice = 79.65;
	Stock(String aSymbol, String aName)
	{
		symbol = aSymbol;
		name = aName;
	}
	public String getSymbol()
	{
		return symbol;
	}
	public String getName()
	{
		return name;
	}
	public double getPreviousClosingPrice()
	{
		return previousClosingPrice;
	}
	public double getCurrentPrice()
	{
		return currentPrice;
	}
	public double getChangePercent()
	{
		double changePercent = (((currentPrice - previousClosingPrice)/previousClosingPrice)*100);
		return changePercent;
	}
}