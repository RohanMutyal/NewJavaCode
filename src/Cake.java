
public enum Cake
{
   BLACKFOREST(550),PINEAPLE(780),PLUM(900);
	
	int rate;
	Cake()
	{
		
	}
	Cake(int rate)
	{
		this.rate=rate;
	}
	public int getRate()
	{
		return rate;
	}
}
