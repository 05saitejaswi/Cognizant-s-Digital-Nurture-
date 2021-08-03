import java.util.ArrayList;
import java.sql.*;


public class FlightManagementSystem
{
	
	

	public ArrayList<Flight> viewFlightsBySourceDestination(String source, String dest) {
		// TODO Auto-generated method stub
	
		
		DB db=new DB();
		
		
		ArrayList<Flight> list=new ArrayList<Flight>();
		
		try
		{
			
			int f=0;
			Connection con=db.getConnection();
			
			
			
			Statement pst=con.createStatement();
			
			String str="Select * from flight where source='"+source+"' and destination='"+dest+"' ";
			
			
			
			ResultSet rs=pst.executeQuery(str);
			
			while(rs.next())
			{
				f=1;
				
				Flight x=new Flight(rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getInt(4),
				rs.getDouble(5)
			 );
				
		 
			list.add(x);	
						
			}		
			con.close();
			
			if(f==1)
			{
				 
				return list;
				
			}
			
			else {
				return null;
			}
			
				

			
			
			
		}catch(SQLException e1)
		{
			System.out.println("SQL Error.Contact Administrator.");
		
		
		return null;
	  
		
		}catch(Exception e)
		{
			System.out.println("Exception. Contact Administrator.");
			return null;
		
		}
		
		
	}
	
    
	
	
	
}