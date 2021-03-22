//Deleting an element from the array at index 

import java.lang.*;
import java.util.*;
import java.io.*;

public class SCArray4_3
{

	public static void main(String[] args) {
		int [] arr = {1,2,10,4,5,6,7,8,9};

			int delete=2;
			int data =arr[2];
		for(var x:arr)
		System.out.println(x);
		for(int i=2;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		System.out.println(arr.length);
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]);
		

	}
}