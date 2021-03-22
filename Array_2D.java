//2D Array in java
import java.lang.*;

public class Array_2D
{
	public static void main(String[] args) {
		
		//creating the an array
		int arr[][] = new int [2][3];
		
		//intializing the array;
		int arr1[][] = {{1,2,3},{4,5,6}};

		//Traversing an array using for loop

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr1[i][j]);
			}
		}

		//using for each loop

		for(int x[]:arr1)
		{
			for(int y:x)
				System.out.println(y);
		}


	}
}