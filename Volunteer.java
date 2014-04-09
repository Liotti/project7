
public class Volunteer {
	Model model = new Model;
	String name;
	int score;
	Location location;// = new Location;
	Location destination;
	long timeRequired;

	public Volunteer(Model model, java.lang.String name, int score, Location location)  {
		this.model = model;
		this.name = name;
		this.score = score;
		this.location = location;
	}
	
	public Location getCurrentLocation() {
		return location;
	}
	
	public double[] getCurrentPosition() {
		return location.getXY();
	}
	
	public double[] getDestination() {
		return destination.getXY();
	}
	
	public java.lang.String getName() {
		return name;
	}
	
	public java.lang.String getRequester() {
		return model[1];
	}
	
	public int getScore() {
		return score;
	}
	
	public double[] getStart() {
		return location.getXY();
	}
	
	public void startMoving(Location destination,long timeRequired) {
		this.destination = destination;
		this.timeRequired = timeRequired;
		
	}
	
	public void startWalking(Request request,long timeRequired) {
		a
	}


}
