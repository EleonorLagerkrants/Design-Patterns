package Design_Patterns.Factory_method_pattern;

import java.util.Scanner;

public class SalutationFactory {
	
	public static String name;
	public static String gender;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Name: ");
		name = scan.nextLine();
		System.out.println("Gender (M or F): ");
		gender = scan.next();
		
		SalutationFactory factory = new SalutationFactory();
		factory.getPerson(name, gender);
		scan.close();
	}
	
	public Person getPerson (String name, String gender) {
		if(gender.equals("M"))
			return new Male(name);
		else if(gender.equals("F"))
			return new Female(name);
		else
			return null;
	}

}
