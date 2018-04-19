package week7Homework;

public class PrintNumber {
	public static void main(String[] args) {
		int rowCount = 8;
		int number=1;
		for (int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(number);
			}
			number++;
			System.out.print(",");
		}
	}
}
/*
 1.Initialize row count as,
 int rowCount = 8;
 2.Initialize number = 1
 3.Using nested for loop print number in using,
 System.out.print(number);
 4.Increment the number
 5.Iterate inner loop till the outer loop condition satisfies. 
 */