package Design_Patterns.Java_PracticalProblem;

public class CEO extends Manager {
	
	public CEO(String name, String country) {
		System.out.println("Manager information");
		System.out.println("-----------------");
		System.out.println("Namn: "+name);
		System.out.println("Position: CEO");
		System.out.println("Salary: 60 000");
		System.out.println("Country: "+country);
	}

}
