package Design_Patterns.Adapter_pattern;

public class Socket {
	
	public Volt getVolt() {
		return new Volt(120);
	}
}
