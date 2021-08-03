import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class FlightManagementSystem
{
	
	public boolean updateFlightFare(int flightId,double flightFare)
	{
		
		try {
			
		
	//		DB db=new DB();
			
			Connection con=DB.getConnection();
			
			
			//String str="update flight set flightfare= '" +flightFare+"' where flightid=' "+flightId+ "'";
			
			String query="update flight set flightfare=? where flightid=?";
			
			
			
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setDouble(1, flightFare);
			pst.setInt(2, flightId);
			
			int result=pst.executeUpdate(query);
			
			if(result>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		
		}catch(SQLException|ClassCastException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		return false;
		
	}
	
	
	
}