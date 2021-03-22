//Reverse Copy an element 


import java.lang.*;

public class SCArray5_2
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int []arr1 = new int[10];

		for(int i=0,j=arr.length-1;i<arr1.length&&j>-1;i++,j--)
		{
			arr1[i]=arr[j];
		}

		for(int x:arr)
			System.out.print(x);

		for(int x:arr1)
			System.out.println(x);

	}
}