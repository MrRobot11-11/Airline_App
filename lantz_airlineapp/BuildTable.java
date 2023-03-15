/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Semester Project: Airline App*/
package lantz_airlineapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class BuildTable {
final String DB_URL = "jdbc:derby://localhost:1527/Passenger;create=true";

//Constructor
    public BuildTable(){
        
        try {
   //Create connection to database
          Connection conn = DriverManager.getConnection(DB_URL);
          
          dropTables(conn);//Drops tables if they exist
          
          buildPassengerTable(conn);//Builds a new table
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

//Drops the table if it exists
//Pass in connection you're using to the current database
    public  void dropTables(Connection conn) {
        try {
            //Create a statement object
            Statement stmt = conn.createStatement();
            
            try {//Drops the table if it already exists
                stmt.execute("DROP TABLE PASSENGER");
                System.out.println("Passenger  table has been dropped");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

//Build the table
//Passing in connection you're using for current database
    public void buildPassengerTable(Connection conn) {
        
        try {
            //Create connection to database
            Statement stmt = conn.createStatement();
        
            //Create table with column names
            stmt.execute("CREATE Table Passenger("+"Name CHAR(50),"
                                                                                       +"IDNumber CHAR(20) NOT NULL PRIMARY KEY, "
                                                                                        +"BagWeight CHAR(3), " 
                                                                                        +"DepartDate CHAR(10)," 
                                                                                        +"ReturnDate CHAR(10), "
                                                                                        +"Email CHAR(30),"
                                                                                        +"Phone CHAR(12),"
                                                                                        +"Destination CHAR (15),"
                                                                                        +"TotalFare CHAR (10)"
                                                                                        +")");
            System.out.println("Table has been built");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " +ex.getMessage());
        }
    }






}//End of class
