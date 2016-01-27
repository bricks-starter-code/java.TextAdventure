public class Dirt extends Location
{
    public Dirt()
    {
        super();
        
        Coin coin = new Coin();
        inventory.add(coin);
        description = "You see a pile of dirt";
    }
}