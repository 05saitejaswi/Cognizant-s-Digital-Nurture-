import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
        int flightID=sc.nextInt();
        
        String source=sc.next();
        
        String dest=sc.next();
        
        int noOfFlightFare=sc.nextInt();
        
        double flightFare=sc.nextDouble();
        
        
        Flight f=new Flight(flightID, source, dest, noOfFlightFare, flightFare);
        
        FlightManagementSystem fms=new FlightManagementSystem();
        
 if(fms.addFlight(f))
 {
	 
	 System.out.println("Flight details are added");
	 
 }
 
 else
 {
	 System.out.println("Addition not done");
 }
        
        
    }
}