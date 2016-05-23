package Design_Patterns.Bridge_Patterns;

public class Bulb implements Switch {

	@Override
	public void switchOn() {
		System.out.print("Bulb switched ON");
		
	}

	@Override
	public void switchOff() {
		System.out.print("Bulb switched OFF");
		
	}

}
