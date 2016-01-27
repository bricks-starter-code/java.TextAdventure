import java.util.*;

public class Location {

    public String description;
    public Location North;
    public Location East;
    public Location South;
    public Location West;
    public List<Thing> inventory;
    
    public Location() {
        
        North = null;
        East = null;
        South = null;
        West = null;
        inventory = new ArrayList<Thing> ();
        
        System.out.println("You created a location called " + this.getClass().getName());
    }
    
}