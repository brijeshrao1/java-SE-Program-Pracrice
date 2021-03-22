//Program for pacticing the one dimensional array

import java.lang.*;


public class ArrayPractice
{
	public static  void main(String args[])
	{
		int A[] = new int[10];

	/*
		Gives Error that A array is already difined 
		int A[] = {1,2,3,4,5,6};
	*/		
	
		
		int B[] = {1,2,3,4,5,6,7};
	    
	    B[2]=111;
		
		int C[];

		C=new int[5];

		int []D=new int [6];

	 	for(int i=0;i<A.length;i++)
		{
				System.out.println(A[i]);
		}
		
		System.out.println(D.length);

		//Accessing the array of the element

	

		for(int x:B)
		{
			System.out.println(x);
		}

	}
}