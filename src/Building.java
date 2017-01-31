/**
 * Created by robculclasure on 1/30/17.
 * Class Building represents a building that may be leased, purchased, insured, etc by clients.
 */
public class Building {
    public String name;
    public Integer numStories;
    public Boolean complete;
    public String framingMaterial;

    public Boolean commercial;
    public Boolean residential;
    public Boolean industrial;

    public static void main(String[] args) {

        Building rhythm = new Building();
        rhythm.name = "Rhythm";
        rhythm.numStories = 14;
        rhythm.complete = true;
        rhythm.framingMaterial = "steel";
        rhythm.commercial = true;
        rhythm.residential = true;
        rhythm.industrial = false;

        System.out.println(rhythm.name + " is framed with " + rhythm.framingMaterial + " girders.");
    }
}
