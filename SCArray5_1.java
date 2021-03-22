//Coping an array

import java.lang.*;
import java.util.*;

public class SCArray5_1
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int []arr1 = new int[10];

		for(int x:arr)
			System.out.println(x);

		//copying the array
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}

		for(int x:arr1)
			System.out.println(x);
	}
}