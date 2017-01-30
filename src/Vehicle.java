/**
 * Created by robculclasure on 1/30/17.
 * Class Vehicle represents automobiles that a user would find for sale at carmax.com.
 * The variables allow users to sort vehicles by their attributes.
 */
public class Vehicle {
    public Integer numWheels;
    public String fuelType;
    public Boolean awd;
    public Boolean damaged;
    public Double mpg;
    public Integer modelYear;
    public Integer numDoors;
    public String make;
    public String model;

    public static void main(String[] args) {

        Vehicle first = new Vehicle();
        first.make = "Toyota";
        first.model = "Corolla";
        first.numDoors = 4;
        first.modelYear = 1999;
        System.out.println("Congratulations on purchasing your " + first.modelYear + " " + first.make +
                " " + first.model + "!");
    }
}
