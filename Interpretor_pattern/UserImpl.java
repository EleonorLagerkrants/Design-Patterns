package Design_Patterns.Interpretor_pattern;

public class UserImpl extends User {
	
	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name+" : Sending Message = "+msg);
		mediator.sendMessage(msg, this);
		
	}

	@Override
	public void recieve(String msg) {
		System.out.println(this.name+" : Recieved Message : "+msg);
		
	}

}
