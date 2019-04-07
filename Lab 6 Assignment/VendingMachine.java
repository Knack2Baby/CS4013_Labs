import java.util.ArrayList;

/**
   A vending machine.
*/
public class VendingMachine
{  
   private ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;
   private ArrayList<Product> pro;

   /**
      Constructs a VendingMachine object.
   */
   public VendingMachine()
   { 
		products = new ArrayList<Product>();
		coins = new CoinSet();
		currentCoins = new CoinSet();
		pro = new ArrayList<Product>();
   }
   //ADD REMAINING CODE HERE
   
   public Product[] getProductTypes()
   {
	   return pro.toArray(new Product[pro.size()]);
   }
   
   public void addCoin(Coin coin)
   {
	   currentCoins.addCoinToSet(coin);
   }
   
   
   public void addProduct(Product p, int quantity)
   {
	   boolean result = false;
	   for(int i = 0; i < pro.size(); i++)
	   {
		   if(p.getDescription().matches(pro.get(i).getDescription()))
		   {
			   result = true;
		   }
	   }
	   if(!result)
	   {
		   pro.add(p);
	   }
	   for(int j = 0; j < quantity; j++)
	   {
		   products.add(p);
	   }
   }
   
   public String removeMoney()
   {
	   String result = Double.toString(currentCoins.getTotal());
	   currentCoins.clearCoins();
	   return result;
   }
   
   public void buyProduct(Product pro)
   {
	   if(products.size() == 0)
	   {
		   System.out.println("There are no products left in the vending machine");
	   }
	   else
	   {
		   for(int i = 0; i < products.size(); i++)
		   {
			   if(products.contains(pro))
			   {
				   if(products.get(i).getPrice() > currentCoins.getTotal())
				   {
					   System.out.println("You do not have enough money for that product");
				   }
				   else
				   {
					   for(int j = 0; j < products.size(); j++)
					   {
						   coins.addCoinToSet(currentCoins.getCoinsList().get(j));
					   }
					   currentCoins.clearCoins();
				   }
			   }
			   else
			   {
				   System.out.println("Sorry that product is not within this machine");
			   }
			}
		}
	}
}