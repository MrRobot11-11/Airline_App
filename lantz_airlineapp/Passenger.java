/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Semester Project: Airline App*/
package lantz_airlineapp;

public class Passenger {

    private String fName;//First name
    private String lName;//Last name
    private int passengerNumber; //Number used in booking
    private int bagWeight;//Total weight of their bags
    private String departDate;//Departure date
    private String returnDate;//Arrival date
    private String email;//Passenger email
    private String phoneNumber;//Passenger phone number
    private int farePrice;//Fare price based on destination
    private boolean under12 = false;//If under 12, discount given
    private String destination;//Name of destination chosen
    private String fareType;//First class or economy
    private int totalFare;//Total of faretype, destination price and discount/no discount
    private int destinationPrice;//Price of destination chosen

//Accessors/mutators
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public int getBagWeight() {
        return bagWeight;
    }
    public void setBagWeight(int bagWeight) {
        this.bagWeight = bagWeight;
    }

    public String getDepartDate() {
        return departDate;
    }
    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public String getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public boolean isUnder12() {
        return under12;
    }

    public void setUnder12(boolean under12) {
        this.under12 = under12;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFarePrice() {
        return farePrice;
    }

    public void setFarePrice(int farePrice) {
        this.farePrice = farePrice;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

  

    public int getDestinationPrice() {
        return destinationPrice;
    }

    public void setDestinationPrice(int destinationPrice) {
        this.destinationPrice = destinationPrice;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(int totalFare) {
        this.totalFare = totalFare;
    }

  
}//End of class
