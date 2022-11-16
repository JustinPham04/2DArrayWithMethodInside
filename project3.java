package mypackage;
//HoangPham
//Task5
public class project3 {

	public static void main(String[] args) {
		int [][] arr1 = 
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
		
		getTotal(arr1);
		getAverage(arr1);
		getRowTotal(arr1);
		getColumnTotal(arr1);
		getHighestInRow(arr1);
		getLowestInRow(arr1);
	}
	public static void getTotal(int [][] x)
	{
		int sum = 0;
		int n = x.length;
		for(int i=0;i<n;i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				sum = sum + x[i][j];
			}
		}
		System.out.print("The total of all the values in the array is: " + sum);
		System.out.println("");
	}
	public static void getAverage(int [][] x)
	{
		int sum = 0;
		double ave;
		int n = x.length;
		for(int i=0;i<n;i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				sum = sum + x[i][j];
			}
		}
		ave = sum/9;
		System.out.printf("The average of all the values in the array is: %.2f " , ave);
		System.out.println("");

	}
	public static void getRowTotal(int [][] x)
	{
       int Row = x.length; 
       int Colum = x[0].length;
       int sumRow = 0;
       for(int i = 0; i < Row; i++)
       {   
           for(int j = 0; j < Colum; j++){  
             sumRow = sumRow + x[i][j];  
           }  
           System.out.print("Sum of " + (i+1) +" row: " + sumRow);  
       	System.out.println("");
       }  
	}
	public static void getColumnTotal(int [][] x)
	{
		int Row = x.length; 
	    int Colum = x[0].length;
	    int sumCol = 0;
	    for(int i = 0; i < Colum; i++)
	    {   
            for(int j = 0; j < Row; j++)
            {  
              sumCol = sumCol + x[j][i];  
            }  
            System.out.print("Sum of " + (i+1) +" column: " + sumCol);  
           	System.out.println("");

	    }
	}
	public static void getHighestInRow(int [][] x)
	{
		int i;
		int rows = 3;
		int columns = 3;
		int highest = 0;
		int [] highestInRow = new int [rows];
		for ( i = 0; i < rows ; i++)
		{
			for(int j = 0 ; j < columns ; j++)
			{
				if(x[i][j] > highest && j < columns)
				{
					highest = x[i][j];
					highestInRow[i] = highest;
				}
			}
			System.out.print("The highest number of row: " + (i+1)+": ");
			System.out.print(highestInRow[i]+ "\n");
		}
       	System.out.println("");
	}
	public static void getLowestInRow(int [][] x)
	{
		int i;
		int row = 3;
		int columns = 2;
		int lowest = 0;
		int[] lowestInRow = new int[row];
		for (i = 0; i < row ; i++)
		{
			for(int j = columns ; j > 0 ; j--)
			{
				if(x[i][j] > x[i][j-1] && j > 0)
				{
					lowest = x[i][j];
					lowestInRow[i] = lowest-1;
				}
			}
			System.out.print("The lowest number of row: " + (i+1)+": ");
			System.out.print(lowestInRow[i]+ "\n");
		}
	}
}
