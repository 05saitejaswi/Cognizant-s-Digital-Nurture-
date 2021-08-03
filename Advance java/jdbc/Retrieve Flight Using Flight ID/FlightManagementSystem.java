import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class FlightManagementSystem
{
    
  public Flight viewFlightById(int flightId)
  {
	  
	  try
	  {
		  
		  DB db=new DB();
		  
		  int f=0;
		  
		  Connection con=db.getConnection();
		  
		  Statement st=con.createStatement();
		  
		  String str="select * from flight where flightid='"+flightId+"'";
		  
			
		  
		  ResultSet rs=st.executeQuery(str);
		  
		  while(rs.next())
		  {
			  f=1;
			  Flight flt=new Flight(
					  
					  rs.getInt(1),
					  rs.getString(2), 
					  rs.getString(3),
					  rs.getInt(4),
					  rs.getDouble(5)
					  
				
					 
          	);
			  return flt; 
					  
			  		
			  
		  }
		  
		  
		  if(f==0)
		  {
			  return null;
			  
		  }
		  
		  
	  }catch(SQLException | ClassNotFoundException e)
	  {
		  e.printStackTrace();
	  }
	
	  return null;
	  
	  
	  
  }
	
	
    
}