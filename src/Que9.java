
public class Que9 
{

	public static void main(String[] args) 
	{
		String st="a3b4b5n";
		char ar[]=st.toCharArray();
		int count=0;int sum=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]=='a'&&ar[i]=='z'||ar[i]=='A'&&ar[i]=='Z')
			{
				count++;
			}
			else if(ar[i]>=48 && ar[i]<=57)
			{
				int num=ar[i]-48;
				sum=sum+num;
			}
		}
        System.out.println("Sum = "+sum);
	}

}
