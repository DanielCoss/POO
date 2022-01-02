import java.util.Map;
import java.util.ArrayList;

public class Uberblack extends Car{
    Map<String, ArrayList<String>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public Uberblack(String license, Account driver, ArrayList<String> seatsMaterial, Map<String, ArrayList<String>> typeCarAccepted){
        super(license,driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}