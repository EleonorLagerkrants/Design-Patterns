package Design_Patterns.Interpretor_pattern;

public interface ChatMediator {
	
	public void sendMessage( String msg, User user);
	
	void addUser(User user);

}
