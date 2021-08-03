import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        FlightManagementSystem fls=new FlightManagementSystem();
        
        
        int flightId=sc.nextInt();
        double flightfare=sc.nextDouble();
        
        if(fls.updateFlightFare(flightId,flightfare))
        {
        	System.out.println("Flight Fare updated successfully");
        }
        
        else
        {
        	System.out.println("Flight fare not updated.Check for the ID");
        }
    
    }
}