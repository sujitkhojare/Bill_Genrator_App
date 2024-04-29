package Bill_Gen;

public class Main {

	public static void main(String[] args) {
   
		Pizza basepizza = new Pizza(true);  // true is 300 and false = 400
		basepizza.addExtracheese();
		basepizza.addExtraToppings();
		basepizza.takeAway();
		basepizza.getBill();
	
		
	}

}
