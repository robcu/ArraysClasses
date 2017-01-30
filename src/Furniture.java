/**
 * Created by robculclasure on 1/30/17.
 * Class Furniture represents items of furniture that a user may list for sale on craigslist.
 */
public class Furniture {

    Double price;
    String name;
    String room;
    Boolean antique;
    Boolean formal;

    public static void main(String[] args) {

        Furniture item1 = new Furniture();
        item1.name = "sofa";
        item1.antique = false;
        item1.room = "living room";
        item1.formal = false;
        item1.price = 199.99;

        System.out.println("The " + item1.name + " costs $" + item1.price + ". It belongs in the " + item1.room + ".");
    }
}
