/**
 * Created by robculclasure on 1/30/17.
 * Class Beverage represents drink items from a given restaurant menu.
 */
public class Beverage {

    String name;
    Boolean caffeinated;
    Boolean carbonated;
    Boolean diet;
    Integer ounces;
    Integer caloriesPerOZ;

    public static void main(String[] args) {
        Beverage OJ = new Beverage ();
        OJ.name = "Orange Juice";
        OJ.caffeinated = false;
        OJ.carbonated = false;
        OJ.diet = false;
        OJ.ounces = 32;
        OJ.caloriesPerOZ = 14;

        System.out.println("A " + OJ.ounces + " ounce " + OJ.name + " has " + OJ.caloriesPerOZ * OJ.ounces + " calories.");

    }
}
