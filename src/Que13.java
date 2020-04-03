
public class Que13 
{

	public static void main(String[] args)
	{
		String h="India";
		char a[]=h.toCharArray();
		for(int i=0,j=a.length-1;i<a.length &&  j>=0 ;i++,j--)
		{
			if(i<j)
			{
				System.out.print(a[j]+""+a[i]);
			}
			else if(i==j)
			{
				System.out.print(a[i]);
			}
			
			
		}

	}

}
