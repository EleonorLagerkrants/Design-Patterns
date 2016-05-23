package Design_Patterns.Java_PracticalProblem;

import java.util.Scanner;

public class FactoryClass {
	
	public static String name;
	public static String position;
	public static String country;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Name: ");
		name = scan.next();
		System.out.print("(M)anager or (E)mployee?");
		char c;
		do {
			char p = scan.next().charAt(0);
			c = Character.toUpperCase(p);
			if(c != 'M' && c != 'E')
				System.out.print("Please respond M or E");
		}
		while(c != 'M' && c != 'E');
		if(c == 'M') {
			System.out.print("(C)EO or (D)irector? \n");
			position = scan.next();	
			position = position.toUpperCase();
			System.out.println("In what country are you currently working?");
			country = scan.next();
			FactoryClass factory = new FactoryClass();
			factory.getManager(name, position, country);
			scan.close();
			}
		else if(c == 'E') {
			System.out.print("(W)arehouse, (R)egister of (O)ffice? \n");
			position = scan.next();
			position = position.toUpperCase();
			FactoryClass factory = new FactoryClass();
			factory.getEmployee(name, position);
		}
	}
		
	
	public Manager getManager(String name, String position, String country) {
		if(position.equals("C"))
			return new CEO(name, country);
		else if(position.equals("D")) 
			return new Director(name, country);
		else
			return null;
	}
	
	public Employee getEmployee(String name, String position) {
		if(position.equals("W"))
			return new Warehouse(name);
		else if(position.equals("R"))
			return new Register(name);
		else if(position.equals("O"))
			return new Office(name);
		else
			return null;
	}

}
