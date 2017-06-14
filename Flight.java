package assignment_02;

public class Flight {
	
	private int flightNum;
	private String airName, origin, destination;
	
	//	Flight Constructor and Initializer
	public Flight()
	{
		flightNum = 0;
		airName = "Airline Alpha";
		origin = "Departure City";
		destination = "Destination City";		
	}
	
	public Flight(int n, String a, String o, String d)
	{
		flightNum = n;
		airName = a;
		origin = o;
		destination = d;
	}
	
	// Mutators
	public void setFlightNum(int num)
	{
		flightNum = num;
	}
	
	public void setAirName(String name)
	{
		airName = name;
	}
	
	public void setOrigin(String city)
	{
		origin = city;
	}
	
	public void setDestination(String city)
	{
		destination = city;
	}
	
	// Accessors
	public int getFlightNum()
	{
		return flightNum;
	}
	
	public String getAirName()
	{
		return airName;
	}
	
	public String getOrigin()
	{
		return origin;
	}
	
	public String getDestination()
	{
		return destination;
	}
	
	public String toString()
	{
		String description = ("\nFlight Number " + flightNum + ", Airline Name: " + airName);
				
				description = description + ", Origin: " + origin + ", Destination: " + destination + "\n";
		
		return description;
	}

}
