/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Semester Project: Airline App*/
package lantz_airlineapp;

class CreditInfo {
    
private int creditCardNum;//Holds credit card number
private int experationDate;//Holds credit card expiration date
private int securityCode;//Holds 3 digit security code
private int firstName;//Credit card holder first name
private int lastName;//Credit card holder last name
private int cardType;//Visa, Mastercard, etc

//Accessors/ mutators    
    public int getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(int creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public int getExperationDate() {
        return experationDate;
    }

    public void setExperationDate(int experationDate) {
        this.experationDate = experationDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public int getFirstName() {
        return firstName;
    }

    public void setFirstName(int firstName) {
        this.firstName = firstName;
    }

    public int getLastName() {
        return lastName;
    }

    public void setLastName(int lastName) {
        this.lastName = lastName;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }








}//End of class
