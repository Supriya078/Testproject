package Array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int l;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		int arr[]=new int[l];
		int i,j,n;
		for(i=0;i<l;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0,j=l-1;i<=j;i++,j--)
		{
			n=arr[i];
			arr[i]=arr[j];
			arr[j]=n;
		}
		for(i=0;i<l;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
