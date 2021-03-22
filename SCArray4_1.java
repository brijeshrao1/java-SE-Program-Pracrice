//Roatating and array

import java.lang.*;
import java.util.*;
import java.io.*;

 

public class SCArray4_1
{
public static void rotateArray(int a[],int n,int rt)
{
	int j=0;
	while(j<rt)
	{
		int i;
		int temp=a[0];
		for(i=0;i<n-1;i++)
		{
		a[i]=a[i+1];
		}
	 a[i]=temp;
	 j++;
	}

}
	 public static void main(String[] args) {
	
	 	int arr[] = {1,2,3,4,5,6};
	 	rotateArray(arr,arr.length,2);
	 	for(int x:arr)
	 		System.out.println(x);
	}
	
}