/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Semester Project: Airline App*/

package lantz_airlineapp;
import java.util.ArrayList;

public class Fares {

    private final int UNDER_12_PRICE = -50;//If passenger under 12 years of age
    private final int ECONOMY_CLASS_PRICE = 150;//Final int for economy price
    private final int FIRST_CLASS_PRICE = 300;//Final int for first class price
    private final String ECONOMY = "Economy";//String holding fare type
    private final String FIRST_CLASS = "First Class";//String holding fare type

    public int getUNDER_12_PRICE() {
        return UNDER_12_PRICE;
    }

    public int getECONOMY_CLASS_PRICE() {
        return ECONOMY_CLASS_PRICE;
    }

    public int getFIRST_CLASS_PRICE() {
        return FIRST_CLASS_PRICE;
    }

    public String getECONOMY() {
        return ECONOMY;
    }

    public String getFIRST_CLASS() {
        return FIRST_CLASS;
    }
    
    private ArrayList<String>some=new ArrayList();

    public ArrayList<String> getSome() {
        return some;
    }
    
    
    
}//End of class
