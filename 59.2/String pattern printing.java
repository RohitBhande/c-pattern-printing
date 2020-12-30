/*
Write Java program which accept String from user and display below pattern. 
Input :  Hello 
Output : H e l l o    
		 H e l l    
		 H e l   
		 H e   
		 H
*/


import java.lang.*;
import java.util.*;

class pattern
{
	void DisPattern(String str)
	{
		int i=0,j=0;
		char arr[]=str.toCharArray();
		int size=arr.length;

		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<size;j++)
			{				
					System.out.print(arr[j]+"\t");			
			}
			size--;
			System.out.println();
		}
	}
}


class demo
{
	public static void main(String[] args) 
	{
		Scanner sobj =new Scanner(System.in);

		System.out.println("Enter string");
		String str=sobj.nextLine();

		pattern pobj =new pattern();
		pobj.DisPattern(str);		
	}
}
