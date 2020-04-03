
public class Ass4 
{

	public static void main(String[] args)
	{
		String str="null";
		String message=(str==null)?"":str.substring(0, 2);
		System.out.println(message);

		message=(str.equals(null))?"":str.substring(2,4);
		System.out.println(message);

	}

}
