package Design_Patterns.Java_PracticalProblem;

public class Director extends Manager {
	
	public Director(String name, String country) {
		System.out.println("Manager information");
		System.out.println("----------------");
		System.out.println("Name: "+name);
		System.out.println("Position: Director");
		System.out.println("Salary: 50 000");
		System.out.println("Country: "+country);
	}

}
