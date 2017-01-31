
/**
 * Created by robculclasure on 1/30/17.
 * Class Pizza represents a pizza pie that a customer may design and purchase.
 * The array is the latest addition to this class file. It doesn't integrate well.
 * I would rethink the other variables for a longer term project.
 *
 */
public class Pizza {
    int radius;
    boolean supreme;
    double price;
    String size;
    String name;

     static String [][] menu = new String[3][2];


    public static void main(String[] args) {

        Pizza hawaiian = new Pizza();

        hawaiian.menu[0][0] = "Small";
        hawaiian.menu[0][1] = "9.99";
        hawaiian.menu[1][0] = "Medium";
        hawaiian.menu[1][1] = "15.99";
        hawaiian.menu[2][0] = "Large";
        hawaiian.menu[2][1] = "24.99";

        System.out.println("Pizza prices");
        System.out.println(hawaiian.menu[0][0] + "  ---  $" + hawaiian.menu[0][1]);
        System.out.println(hawaiian.menu[1][0] + "  ---  $" + hawaiian.menu[1][1]);
        System.out.println(hawaiian.menu[2][0] + "  ---  $" + hawaiian.menu[2][1]);

        System.out.println("Your total is $" + hawaiian.menu[0][1] + ".");

        hawaiian.radius = 10;
        hawaiian.name = "Hawaiian";

        if(hawaiian.radius < 12) {
            hawaiian.size = "small";
        }
        else {hawaiian.size = "large";}

        System.out.println("You ordered a " + hawaiian.size + " " + hawaiian.name + " pizza.");
}
}
