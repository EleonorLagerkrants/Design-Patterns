package Design_Patterns.Java_PracticalProblem;

public class Manager implements Personnel {
	
	public String name;
	public String position;
	public String country;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPosition() {
		return position;
	}
	
	public String getCountry() {
		return country;
	}
}
