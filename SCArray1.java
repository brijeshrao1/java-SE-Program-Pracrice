//Student Challenge
//Finding the Sum of all elements

import java.lang.*;

public class SCArray1
{
	public static void main(String[] args) {
		
		int sum=0;

		int A[] = new int[10];

		int B[]={1,2,3,4,5,6,7,8,9};

	
		//using for loop
		for (int i=0; i<B.length; i++) {
			sum+=B[i];
		}

		
		// using for each loop 
		int sum2=0;
		for(int x:B)
		{
			sum2+=x;
		}


		System.out.println("Sum of elements of array is :"+sum2);

	}

}