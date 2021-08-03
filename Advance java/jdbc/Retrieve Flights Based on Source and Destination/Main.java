import java.sql.SQLException;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
 
    System.out.println("Enter the source");

    String source=sc.next();
    
    System.out.println("Enter the destination");

    
    String dest=sc.nextLine();
    
    FlightManagementSystem fms=new FlightManagementSystem();
    
    ArrayList<Flight> res=fms.viewFlightsBySourceDestination(source,dest);
    
    if(res!=null)
    {
    	System.out.println(res);
    }
    
    else
    {
    System.out.println("No flights available for the given source and destination");
    	
    }
}
}