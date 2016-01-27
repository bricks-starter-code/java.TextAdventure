public class Start extends Location 
{
    
    public Start() 
    {
        super();
        Shovel shovel = new Shovel();
        inventory.add(shovel);
        description = "This is the start of the game.";
    }
    
}