/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Semester Project: Airline App*/
package lantz_airlineapp;

public class Lantz_SemesterProject {

   
    public static void main(String[] args) {
    
        AirlineUX ux = new AirlineUX();
        CRUD crud = new CRUD(ux);
        Results result = new Results();
        ux.setCrud(crud);
       
        ux.setVisible(true);
      
//   Payment pay = new Payment();
//   pay.setVisible(true);

    
    
    }

}
