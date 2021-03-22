//Student Challenge

//Finding maximum
import java.lang.*;

public class SCArray3
{

	public static void main(String[] args)
	{
		int A[]={1,2,3,4,5,6,7,8,9};
		
		int maximum=A[0];

		
		for (int x : A ) 
		{
			if(maximum<=x)
			{
				maximum=x;
			}	
		}
		System.out.println(maximum);
	}
	
}