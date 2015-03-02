public class Coin implements Comparable
{
    private double value;
    private String name;
    
    public Coin( double value, String name)
    {
        this.value = value;
        this.name = name;
    }
    
    public int compareTo( Object other)
    {
        Coin otherCoin = (Coin)other;
        
        if(this.value < otherCoin.value)
        {
            return -1;
        }
        else if(this.value> otherCoin.value)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }
    
    public static void main(String [] args)
    {
        Coin quarter = new Coin(.25, "quarter");
        Coin dime = new Coin(.10, "dime");
        
        Comparable quarterObj = quarter;
        Comparable dimeObj = dime;
        
        if(quarterObj.compareTo(dimeObj) > 0)
        {
            System.out.println("quarter is greater than dime.");
        }
    }
}