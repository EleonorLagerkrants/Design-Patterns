package Design_Patterns.Command_pattern;

public class Chef {
	public Food prepareOrder(Order order, Waiter waiter) {
		Food food = getCookedFood(order);
		return food;
	}
	
	public Food getCookedFood(Order order) {
		Food food = new Food(order);
		return food;
	}
 
}
