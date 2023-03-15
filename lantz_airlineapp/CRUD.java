/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Semester Project: Airline App*/
package lantz_airlineapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUD {

    //Address to database
    final String DB_URL = "jdbc:derby://localhost:1527/Passenger;create=true";
    
    String SQLString;//Our sql statement sent to the database
   
    Connection conn;//Connections to the database
    AirlineUX gui = new AirlineUX();//Connect to our gui

//Used to interact with database
    public PreparedStatement pstmt;
    public Statement stmt;
    public ResultSet rs;

    //Constructor
public CRUD(AirlineUX gui){
    try {

//Connect to database    
     conn = DriverManager.getConnection(DB_URL);
    
    } catch (SQLException ex) {
        Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
    }
    if(this.conn != null){
        System.out.println("Connected to Database");
    }
    this.gui = gui;//Assign gui object
}//End of constructor

public void showTable(){
    ArrayList<Passenger>passenger = getPassengers();//Load array list
                                                                                              //Creating array of passenger objects
     DefaultTableModel model = (DefaultTableModel) gui.getJTable().getModel();
     
     //String array to hold titles for table
     String[] titles = new String[]{"Name", "IDNumber", "BagWeight", "DepartDate",
                                                        "ReturnDate", "Email", "Phone", "Destination", "TotalFare"};
     //2-dimensional arry to hold table data; Used to display the table data
     Object[][] PassengerArray = new Object[passenger.size()][9];//Rows/Columns
     
     for (int i = 0; i < passenger.size(); i++) {
        PassengerArray[i][0] = passenger.get(i).getfName() + " " + passenger.get(i).getlName();
       
        PassengerArray[i][1] = passenger.get(i).getPassengerNumber();
        PassengerArray[i][2] = passenger.get(i).getBagWeight();
        PassengerArray[i][3] = passenger.get(i).getDepartDate();
        PassengerArray[i][4] = passenger.get(i).getReturnDate();
        PassengerArray[i][5] = passenger.get(i).getEmail();
        PassengerArray[i][6] = passenger.get(i).getPhoneNumber();
        PassengerArray[i][7] = passenger.get(i).getDestination();
        PassengerArray[i][8] = passenger.get(i).getTotalFare();
    }
     model.setDataVector(PassengerArray, titles);
     
}//End of showTable

//Create array list to hold passenger objects
//Create a passenger object and assign values
//Values are from passenger database
public ArrayList<Passenger>getPassengers(){
    ArrayList<Passenger>passenger = new ArrayList<>();//Create arraylist of passenger objects
    
    //Query to get all from passenger database
    String passengerQuery = "SELECT* FROM PASSENGER";
    try{
          stmt = conn.createStatement();
          rs = stmt.executeQuery(passengerQuery);
          
          Passenger flyer;//Passenger object
          
          while(rs.next()){
              flyer = new Passenger();
              //Set array elements to values from table
              flyer.setfName(rs.getString("NAME"));
              flyer.setPassengerNumber(rs.getInt("IDNumber"));
              flyer.setBagWeight(rs.getInt("BagWeight"));
              flyer.setDepartDate(rs.getString("DepartDate"));
              flyer.setReturnDate(rs.getString("ReturnDate"));
              flyer.setEmail(rs.getString("Email"));
              flyer.setPhoneNumber(rs.getString("Phone"));
              flyer.setDestination(rs.getString("Destination"));
              flyer.setTotalFare(rs.getInt("TotalFare"));
              
              passenger.add(flyer);
          }
    }catch(SQLException ex){
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    return passenger;
}//End of getPassengers

//Insert into database
//Pass in passenger object
public void insertDB(Passenger flyer){
    try {
        SQLString = "INSERT INTO PASSENGER VALUES" + "(?, ?, ?, ?, ?, ?, ?, ?, ? )";
        
        pstmt = conn.prepareStatement(SQLString);
        
        pstmt.setString(1,flyer.getfName() + " " + flyer.getlName());
        pstmt.setInt(2, flyer.getPassengerNumber());
        pstmt.setInt(3, flyer.getBagWeight() );
        pstmt.setString(4, flyer.getDepartDate());
        pstmt.setString(5, flyer.getReturnDate());
        pstmt.setString(6, flyer.getEmail());
        pstmt.setString(7, flyer.getPhoneNumber());
        pstmt.setString(8, flyer.getDestination());
        pstmt.setInt(9, flyer.getTotalFare());
        
        //Execute update statment
        pstmt.executeUpdate();
        conn.commit();
        pstmt.close();
        
    } catch (SQLException e) {
        Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage()
                                                                        );
    }
}
}//End of class

