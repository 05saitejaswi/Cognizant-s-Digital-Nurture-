import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        
        
        FlightManagementSystem fms=new FlightManagementSystem();
        
       int flightID=sc.nextInt();
       String source=sc.next();
       String dest=sc.next();
       int no_of_seats=sc.nextInt();
       double flight_fare=sc.nextDouble();
       
       
       
       
       Flight f=new Flight(flightID, source, dest, no_of_seats, flight_fare);
     
       int fid=f.getFlightId();
       
       Flight flight=fms.viewFlightById(fid);
       
       if(flight!=null)
       {
    	   
    	   System.out.println(flight);
       }

       else
       {
    	   System.out.println("Invalid Flight ID");
       }
    
    }
}