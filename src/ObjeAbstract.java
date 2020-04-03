
public class ObjeAbstract extends AbstractClass
{
   public void Play()
   {
	   System.out.println("I am playing with music..");
   }
	public static void main(String[] args)
	{
		ObjeAbstract ob=new ObjeAbstract()
				{
			       public void Play()
			       {
			    	   System.out.println("MusicalInstruments..");
			       }
				};
		        ob.Play();

	}

}
