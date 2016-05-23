package Design_Patterns.Interpretor_pattern;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Anna");
		User user2 = new UserImpl(mediator, "Bosse");
		User user3 = new UserImpl(mediator, "Calle");
		User user4 = new UserImpl(mediator, "Daniel");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hello");

	}

}
