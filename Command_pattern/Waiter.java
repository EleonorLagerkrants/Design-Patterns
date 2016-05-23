package Design_Patterns.Command_pattern;

public class Waiter {
	
	public Food takeOrder(Customer cust, Order order) {
		
		Chef chef = new Chef();
		Food food = chef.prepareOrder(order, this);
		return food;
	}

}
