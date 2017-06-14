package assignment_02;

public class FlightTest {
	
	public static void main(String[] args) {
		Flight alpha = new Flight();
		Flight bravo = new Flight(7,"Qantas", "Sydney", "Dallas/Fort Worth");
		
		System.out.print("Flight Alpha: " + alpha.toString());
		System.out.print("\nFlight Bravo: " + bravo.toString());
		
		alpha.setAirName("Qantas");
		System.out.println("\nFlight Alpha Airline Name: " + alpha.getAirName());
		
		alpha.setFlightNum(8);
		System.out.println("Flight Alpha Flight Number: " + alpha.getFlightNum());
		
		alpha.setOrigin("Dallas/Fort Worth");
		System.out.println("Flight Alpha Origin: " + alpha.getOrigin());
		
		alpha.setDestination("Sydney");
		System.out.println("Flight Alpha Destination: " + alpha.getDestination());
		
		System.out.print("\nAlpha Updated: " + alpha.toString());
	}

}
