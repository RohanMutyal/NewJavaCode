
public class Que2 
{  
	enum Season
	{
		RAINY,WINTER,SPRING,SUMMER,AUNTOM;
	}
	
	{
		System.out.println("Enjoy Each Season..");
	}
    static
    {
    	System.out.println("God is Great!!.");
    }
    public static void enjoyClimate(Season s)
    {
    	switch(s)
    	{
    	case WINTER: System.out.println("Use Swetor");break;
    	case SUMMER: System.out.println("Use cap.");
    	case RAINY : System.out.println("Use Umbrealla.");break;
    	default :System.out.println("No need to use anything.");
    	}
    }
	public static void main(String[] args) 
	{
		Season s=Season.SUMMER;
		enjoyClimate(s);

	}

}
