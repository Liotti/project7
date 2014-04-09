import java.util.*;
import java.lang.*;

public class Location {
	HashSet<Request> requests = new HashSet<Request>();
	HashSet<Volunteer> volunteers = new HashSet<Volunteer>();
	Model model = new Model;
	String name;
	double x;
	double y;
	private Request request;
	
	
    //Constructor that creates a Location with the given name at coordinates (x, y) in the given model.
	public Location(Model model, java.lang.String name, double x, double y) {
		this.model = model;
		this.name = name;
		this.x = x;
		this.y = y;
		
	} 
    //Constructor that creates a Location with the given name at coordinates (x, y) in the given model.
	
	public void addRequest(Request request) {
		requests.add(request);
		}
	
	public void addVolunteer(Volunteer volunteer) {
		volunteers.add(volunteer);
	}
	
	public java.lang.String getName() {
		return name;
	}
	
	public java.util.HashSet<Request> getRequests() {
		return requests; 
	}
	
	public java.util.HashSet<Volunteer> getVolunteers() {
		return volunteers;
	}
	
	public double[] getXY(){
		double[] xy = {x,y};
		
	}
	
	public void removeRequest(Request request) {
		requests.remove(request);
	}
	
	public void removeVolunteer(Volunteer volunteer) {
		volunteers.remove(volunteer);
	}
}

