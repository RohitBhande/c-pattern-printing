/*
Write Java program which accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 4  iCol = 4  
Output :  A B C D   
		  a b c d   
		  A B C D    
		  a b c d
*/

import java.lang.*;
import java.util.*;

class pattern
{
	void DisPattern(int row,int col)
	{
		if((row!=col)|| (row <=0)||(col<=0))
		{
			return;
		}
		int i=0,j=0;
		char ch='A',ch1='a';
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(i%2 != 0)
				{
					System.out.print(ch+"\t");
				ch++;
				}
				else if(i%2 == 0)
				{
					System.out.print(ch1+"\t");
				ch1++;
				}
				
			}
			ch='A';
			ch1='a';
			System.out.println();
		}
	}
}


class demo
{
	public static void main(String[] args) 
	{
		Scanner sobj =new Scanner(System.in);

		System.out.println("Enter rows");
		int iRow=sobj.nextInt();
		System.out.println("Enter columns");
		int iCol=sobj.nextInt();

		pattern pobj =new pattern();
		pobj.DisPattern(iRow,iCol);

		
	}
}