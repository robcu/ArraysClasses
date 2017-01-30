/**
 * Created by robculclasure on 1/30/17.
 * Class Pizza represents a pizza pie that a customer may design and purchase.
 */
public class Pizza {
    int radius;
    boolean supreme;
    double price;
    String size;
    String name;

    public static void main(String[] args) {

        Pizza hawaiian = new Pizza();

        hawaiian.radius = 10;
        hawaiian.name = "Hawaiian";

        if(hawaiian.radius < 12) {
            hawaiian.size = "small";
        }
        else {hawaiian.size = "large";}

        System.out.println("You ordered a " + hawaiian.size + " " + hawaiian.name + " pizza.");

}
}
