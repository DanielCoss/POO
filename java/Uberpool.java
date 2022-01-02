public class Uberpool extends Car{
    String brand;
    String model;
    
    public Uberpool(String license, Account driver, String brand, String model){
        super(license,driver);
        this.brand = brand;
        this.model = model;
    }
}
