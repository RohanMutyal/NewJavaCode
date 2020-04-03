
public class Ass14 
{
 
	public static void main(String[] args) 
	{
		Cake on = null;
		Cake ar[]=on.values();
		for(Cake x:ar)
		{
			System.out.println("Name = "+x.name());
			System.out.println("Ordinal = "+x.ordinal());
			System.out.println("Value = "+x.getRate());
		}

	}

}
