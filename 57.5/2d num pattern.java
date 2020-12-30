/*
Write Java program which accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 3  iCol =  4  
Output : 1 2 3 4   
         5 6 7 8   
         9 10 11 12
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
		int No=1;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{				
				System.out.print(No+"\t");
				No++;			
			}
			
			
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
