package Design_Patterns.Bridge_Patterns;

public class Fan implements Switch {

	@Override
	public void switchOn() {
		System.out.print("Fan switched ON");
		
	}

	@Override
	public void switchOff() {
		System.out.print("Fan switched OFF");
		
	}
	

}
