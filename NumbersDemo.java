/*a. Create an application named NumbersDemo whose main() method holds two
integer variables. Assign values to the variables. In turn, pass each value to
methods named displayTwiceTheNumber(), displayNumberPlusFive(), and
displayNumberSquared(). Create each method to perform the task its name
implies. Save the application as NumbersDemo.java.
b. Modify the NumbersDemo class to accept the values of the two integers from a
user at the keyboard. Save the file as NumbersDemo2.java.*/


public class NumbersDemo 
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 3;
		
		System.out.println(displayTwiceTheNumber(a,b));
		System.out.println(displayNumberPlusFive(a,b));
		System.out.println(displayNumberSquared(a,b));
		
				
	}
	
	public static int displayTwiceTheNumber(int a, int b)
	{
		int c;
		c = 2*(a+b);
		return c;
	}
	public static int displayNumberPlusFive(int a, int b)
	{
		int v;
		v = a+b+5;
		return v;
	}
	public static int displayNumberSquared(int a, int b)
	{
		int c;
		c = (a+b)*(a+b);
		return c;		
	}

}
