//incresing the size of arra

import java.lang.*;

public class SCArray5_3
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int []arr1 = new int[2*arr.length];

		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		System.out.println("size of old arr "+arr.length);
		arr=arr1;
		arr1=null;

		System.out.println("size of new arr "+arr.length);
	}
}
