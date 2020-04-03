
public class Que15 
{

	public static void main(String[] args) 
	{
		StringBuilder ob=new StringBuilder("Subject Line Of letter");
		
		System.out.println(ob);
		System.out.println(ob.append(" Rohan"));
		System.out.println(ob.delete(2, 6));
		System.out.println(ob.replace(3, 7, "Rohan"));
		System.out.println(ob);

	}

}
