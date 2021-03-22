//Inserting an elenmet  in the array

import java.lang.*;
import java.util.*;
import java.io.*;
public class SCArray4_2
{
	public static void insert(int temp[],int len,int key,int at)
	{
		for(int i=len;i>at;i--)
		{
			temp[i]=temp[i-1];
		}
		temp[at]=key;
		for(var x:temp)
			System.out.printf(x+",");
	}
	
	public static void main(String[] args) {
		int []arr = new int[10];
		 arr[0]=1;
		 arr[1]=2;
		 arr[2]=3;
		 arr[3]=4;
		 arr[4]=5;
		 arr[5]=6;
		for(var x:arr)
			System.out.printf(x+",");
		System.out.println("");
		insert(arr,6,0,2);
		
		
	}
}