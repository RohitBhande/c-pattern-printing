/*
Write Java program which accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 4  iCol = 5  
Output : 4 4 4 4 4   
		 3 3 3 3 3   
		 2 2 2 2 2   
		 1 1 1 1 1
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
		int No=row;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{				
				System.out.print(No+"\t");
							
			}
			No--;
			
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