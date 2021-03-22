//Multiplication of two Matrix

import java.lang.*;


public class SCArray_2D_8_2
{
	public static void main(String[] args) {
		int A[][] = {{1,3,3},{1,4,5},{3,5,7}};
		int B[][] = {{2,4,3},{9,4,5},{6,5,1}};
	

		//gives error like not statement
		//int D[3] = {2,4,3,8};
	
		int C[][] = new int[3][3];

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				C[i][j]=A[i][j]*B[i][j];
			}
		}

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+C[i][j]);
			}
			System.out.println("");
		}

	}
}