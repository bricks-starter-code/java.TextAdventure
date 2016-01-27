public class Locations
{
    public static Location Start = new Start();
    
    public static Location Dirt = new Dirt();
    
    public Locations()
    {
        Start.East = Dirt;
        Dirt.West = Start;
    }
}
