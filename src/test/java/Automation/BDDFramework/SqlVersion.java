package Automation.BDDFramework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;


public class SqlVersion {
	   public static void main( String args[] ) {
		      Connection c = null;
		      Statement stmt = null;
		      try {
		         Class.forName("org.postgresql.Driver");
		         c = DriverManager
		            .getConnection("jdbc:postgresql://db.isdo.test.dev.racingvictoria.com.au/rvdev_test_isdo",
		            "o.xu", "nEZ0PXQ577abv6F56xrhjQC8B");
		         c.setAutoCommit(false);
		         System.out.println("Opened database successfully");

		         stmt = c.createStatement();
		         
		         LocalDate ld = LocalDate.now();
		         System.out.println("local date: " + ld);
		         
		         //update isdo_papi_master_data.fixtures set meet_date = '2020-02-09' where (meet_code = 5158367 and venue_name='Z_Flemington-Test');";
		         String sql = "update isdo_papi_master_data.fixtures set meet_date='" + ld + "' where (meet_code = 5158367 and venue_name='Z-Flemington-Test');";
		         System.out.println("Run SQL to update the meet_date: ");
		         System.out.println(sql);
		         System.out.println();
		         
		         stmt.executeUpdate(sql);
		         c.commit();
		         
		         ResultSet rs = stmt.executeQuery( "SELECT * FROM isdo_papi_master_data.fixtures where meet_code=5158367;" );
		         while ( rs.next() ) {
		        	String  venue_name = rs.getString("venue_name");
		        	String  meet_code = rs.getString("meet_code");
		            String  meet_date = rs.getString("meet_date");
		            String  australian_state = rs.getString("australian_state");
		            String  meet_title = rs.getString("meet_title");
		            
		            System.out.println( "venue_name = " + venue_name );
		            System.out.println( "meet_code = " + meet_code );
		            System.out.println( "meet_date = " + meet_date );        
		            System.out.println( "australian_state = " + australian_state );
		            System.out.println( "meet_title = " + meet_title );
		            System.out.println();
		         }
		         
		         rs.close();
		         stmt.close();
		         c.close();
		      } catch ( Exception e ) {
		         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		         System.exit(0);
		      }
		      System.out.println("Operation done successfully");
		   }
}