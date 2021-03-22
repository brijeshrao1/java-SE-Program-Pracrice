//Finding the 2nd largest element in the element

import java.lang.*;
import java.util.*;
import java.io.*;

public class SCArray4
{
	public static void main(String[] args) {
		int a[] = {12,12,354,364,54,64};
		int max1 = a[0];
		int max2 = a[0];

		for(int x:a)
		{
			if(max1<x)
				max1=x;
			else if((max2<x)&&(max2!=max1))
				max2=x;
		}


		System.out.println("First largest::"+max1+" Second Largest::"+max2);


	}
}