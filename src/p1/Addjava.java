package p1;
import java.sql.*;
import java.sql.DriverManager;

public class Addjava {

	public static void main(String[] args)  throws Exception
	{
	//step 1: Activate oracle thin jdbc driber s/w by regidtering driver
     // class object with DriverManager service
		// a): create jdbc driver class obj
	// 	oracle.jdbc.driver.OracleDriver driver = new oracle.jdbc.driver.OracleDriver();
    
		//b): register with drivermanager service
		// DriverManager.registerDriver(driver);
		
	      Class.forName("com.mysql.cj.jdbc.Driver");
	    
	      //establish the connection
	     Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Vaibhav014");
            
	     //check the connection
	     if(conn==null)
            	 System.out.println("Connectiom is not established");
            else
           	 System.out.println("Connectiom is  established");
	}

}
