
public class Request {
	Model model = new Model;
	String name;
	Location start = new Location;
	Location destination = new Location;
	int value;

	public Request(Model model, java.lang.String name, Location start, Location destination, int value) {
		this.model = model;
		this.name = name;
		this.start = start;
		this.destination = destination;
		this.value = value;
	}
	
	public Location getDestination() {
		return destination;
	}
	
	public java.lang.String getName() {
		return name;
	}
	
	public Location getStart() {
		return start;
	}
	
	public int getValue() {
		return value;
	}
}
