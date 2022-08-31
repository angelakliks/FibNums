package numbs; 

public class FibNumbers {

	public static int fibonacciR(int n)
	{
		if (n==0) return 1;
		else if (n==1) return 1;
		else return fibonacciR(n-1)+fibonacciR(n-2);
	}
	
	
	public static int fibonacciI(int n)
	{
		if (n==0) return 1;
		else if (n==1) return 1;
		else {
			int previous=1;
			int current=1;
			int sum=0;
			int index=1;
			while (index<=n-1)
			{
				sum=previous+current;
				previous=current;
				current=sum;
				index++;
			}
			return sum;
		}
	}
	public static void main (String[] args) {
		System.out.println("The first 12 fibonacci numbers using recursion are:");
		for(int i=0;i<12;i++)
		{
			System.out.print(fibonacciR(i)+"	");
		}
		
		System.out.println("\nThe first 12 fibonacci numbers using loop are:");
		for(int i=0;i<12;i++)
		{
			System.out.print(fibonacciI(i)+"	");
		}
	}
}
