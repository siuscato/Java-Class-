enum Color {RED, WHITE, GREEN, YELLOW}
public class Die {
    // feilds - charateristics 
    private int NumberOfSides;
    private int Result;
    private Color Color;

    //methods
    public int getNumberOfSides() 
    {
        return NumberOfSides;
      
    }
    public void setNumberOFSides(int newNumberOfSides)
    {
        NumberOfSides = newNumberOfSides;
    }
     public int getResult() 
    {
        return Result;
    }
     public Color getColor() 
     {
        return Color;
     }
    public void setColor(Color Color)
    {
        this.Color = Color;
    }
    public void Roll()
    {
        //choose a random between 1 and number of sides
        Result = (int)(Math.random()* NumberOfSides) + 1;
    }

}
