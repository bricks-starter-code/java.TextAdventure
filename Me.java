import java.util.*;

public class Me
{
    List<Thing> inventory = new ArrayList<Thing>();
    
    Location currentLocation;
    
    boolean isDead = false;
    
    public Me()
    {
        currentLocation = Locations.Start;
        
        loop();
    }
    
    public void loop()
    {
        Scanner scanner = new Scanner(System.in);
        
        while(!isDead)
        {
            String currentString = scanner.nextLine();
            process(currentString);
        }
    }
    
    public void process(String s)
    {
        switch(s) {
            case "north": 
            case "n":
            case "go north":
                goNorth();
                break;
            case "east":
            case "e":
            case "go east":
                goEast();
                break;
            case "south":
            case "s":
            case "go south":
                goSouth();
                break;
            case "west":
            case "w":
            case "go west":
                goWest();
                break;
            case "inventory":
            case "inv":
            case "look inventory":
                lookAtInventory();
                break;
            case "look":
            case "look around":
                look();
                break;
            case "quit":
            case "exit":
                isDead = true;
                break;
            default:
                System.out.println("I don't understand that.");
                break;
        }
    }
    
    public void goEast()
    {
        if(currentLocation.East != null)
        {
            currentLocation = currentLocation.East;
            look();
        }
        else
            System.out.println("You can't go that way.");
    }
    
    public void goWest()
    {
        if(currentLocation.West != null)
        {
            currentLocation = currentLocation.West;
            look();
        }
        else
            System.out.println("You can't go that way.");
    }
    
    public void goNorth()
    {
        if(currentLocation.North != null)
        {
            currentLocation = currentLocation.North;
            look();
        }
        else
            System.out.println("You can't go that way.");
    }
    
    public void goSouth()
    {
        if(currentLocation.South != null)
        {
          currentLocation = currentLocation.South;
          look();
        }
        else
            System.out.println("You can't go that way.");
    }
    
    public void look()
    {
        System.out.println(currentLocation.description);
        
        for(Thing t : currentLocation.inventory)
        {
            System.out.println("You see a " + t.name);
        }
        
        if(currentLocation.East != null)
            System.out.println("You can go east.");
        if(currentLocation.West != null)
            System.out.println("You can go west.");
        if(currentLocation.North != null)
            System.out.println("You can go north.");
        if(currentLocation.South != null)
            System.out.println("You can go south.");
            
    }
    
    public void lookAtInventory()
    {
        if(inventory.size() == 0)
        {
            System.out.println("You don't have anything");
            
        }
        else
        {
            for(Thing t: inventory)
            {
                System.out.println("You are holding a " + t.name);
            }
        }
    }
}