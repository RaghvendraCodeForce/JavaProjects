package problemSolving;

import java.util.Scanner;

public class ExcelColumnNameFinder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find the excel column name :");
		int num = sc.nextInt();
		
		
		findColumnName(num);
		
		sc.close();
		
	}
	
	public static void findColumnName(int columnNumber)
	{
		 StringBuilder columnName = new StringBuilder();
		 
	        while (columnNumber > 0) {
	            // Find remainder
	            int rem = columnNumber % 26;
	 
	            // If remainder is 0, then a
	            // 'Z' must be there in output
	            if (rem == 0) {
	                columnName.append("Z");
	                columnNumber = (columnNumber / 26) - 1;
	            }
	            else // If remainder is non-zero
	            {
	                columnName.append((char)((rem - 1) + 'A'));
	                columnNumber = columnNumber / 26;
	            }
	        }
	 
	        // Reverse the string and print result
	        System.out.println(columnName.reverse());
	}
}
