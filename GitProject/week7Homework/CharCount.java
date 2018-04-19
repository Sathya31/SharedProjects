package week7Homework;
import java.util.Scanner;
public class CharCount {

	public static void main(String[] args) {
		String input;
		Scanner str=new Scanner(System.in);
		System.out.println("Enter input value:");
		input=str.next();
		boolean x =true,y=false;
		if(input.length()==5)
		{
			System.out.println("Output is : "+x);
		}
		else
		{
			System.out.println("Output is : "+y);
		}
		str.close();
	}
}
/*
 1.Get String value from user
 String input;
 2.Initialize boolean variable
 boolean x =true,y=false;
 3.Using If condition check length of input is equal to 5.
 if(input.length()==5)
 4.If matches print "True" else print "False"
*/