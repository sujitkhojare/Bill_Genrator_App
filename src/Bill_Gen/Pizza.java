package Bill_Gen;

public class Pizza { 
	
	 private int price;
	 private boolean veg ; 
	 
	 private int extraCheesePrice = 100;
	 private int extraToppingAdded = 150 ;
	 private int backPackPrice = 20 ;
	 
	 public Pizza(boolean veg)
	    {
			this.veg = veg; 
			if(this.veg) { 
				this.price = 300;	 // veg pizza	
		}
		else { 
			this.price = 400; // non veg pizza 			
		}
	}
	public void addExtracheese() { 
		System.out.println("Extra cheese is Added : "+extraCheesePrice);
		this.price += extraCheesePrice;// only calling variable
	}
	public void addExtraToppings() { 
		System.out.println("Extra Topping is Addded : "+extraToppingAdded);
		this.price += extraToppingAdded;// only calling variable		
	}
	public void takeAway() { 
		System.out.println("Take Away Opted : "+backPackPrice);
		this.price += backPackPrice; // only calling variable
	}
	public void getBill() { 
		System.out.println("Total Price is : "+this.price);
	}
    
}
