//Student challenge
//Searching the Element int the array

import java.lang.*;
import java.util.*;

public class SCArray2
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A[]={1,2,3,4,5,6,7,8,9};

		System.out.println("Enter the key\n");

		int key=sc.nextInt();
		
		for(int x:A)
		{
			if(x==key)
			{
				System.out.println("Key found");
				System.exit(0);//terminate the program
			}
		}

		System.out.println("key not found\n");
	}
}