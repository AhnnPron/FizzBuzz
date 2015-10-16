
public class FizzBuzzProject 
{
	public static void main(String[] args)
	{
		FizzBuzzProject.FizzBuzz(1, 88); //1=minValue, 88=maxValue   
		FizzBuzzProject.FizzBuzz(707, 809); //707=minValue, 809=maxValue
	}
	public static void FizzBuzz(int a, int b) //in the FizzBuzz program, int a=minValue and int b=maxValue
	{
		for(int i = a; i <= b; i++) //For loop (int i=a=minValue, int i<=b=maxValue, i=i+1) 
		{
				if (i % 3 == 0 && i % 5 == 0) //&& means that in order for FizzBuzz to be printed, both sides have to be true
				{
					System.out.println("Fizz Buzz"); 
				}
				else if (i % 5 == 0) //if "i" divided by 5 is less than or equal to zero
				{
					System.out.println("Buzz"); //if the remainder is divisible by 5, then print Buzz
				}
				else if (i % 3 == 0) //if "i" divided by 3 is less than or equal to zero
				{
					System.out.println("Fizz"); //if the remainder is divisible by 3, then print Fizz
				}
				else 
				{
					System.out.println(i); //if the remainder is not zero, than just print out the number
				}
		}
	}
} 


 

