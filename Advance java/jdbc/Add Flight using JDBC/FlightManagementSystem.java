import java.sql.Connection;
import java.sql.PreparedStatement;

public class FlightManagementSystem
{
    public boolean addFlight(Flight flightobj)
    {
    	
    	try {
    		
    		DB db=new DB();
    		
    		Connection con=DB.getConnection();
    		
    		PreparedStatement pst=con.prepareStatement("insert into flight values (?,?,?,?,?)");
    		
    	pst.setInt(1, flightobj.getFlightId());	
    	
    	pst.setString(2, flightobj.getSource());	
    	
    	
    	pst.setString(3, flightobj.getDestination());	
    	
    	
    	pst.setInt(4, flightobj.getNoOfSeats());	
    	
    	
    	pst.setDouble(5, flightobj.getFlightFare());	
    	
    	int result=pst.executeUpdate();
    	
    	con.close();
    	
    	if(result>0)
    	{
    		return true;
    		
    	}
    	
    	else
    	{
    		return false;
    	}
    	
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	return false;
    	
    }
    
    
}