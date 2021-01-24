//imports
import java.io.*;

public class Assignment5Recursion
{
	//write three methods
	//static method puzzleFormula(int n) for the number of squares 2n^2 + 2n + 1
	public static int puzzleFormula(int n)
	{
		int squares = 1;
		squares = ((n * n *2) + (n * 2) + 1);
		return squares;
	}

	//method to use sigma function
	public static int puzzleLoop(int n)
	{
		//int squares = 0;
		int sigmaTotal = 0;
		for (int i = 1; i <= n; i++)
		{
			sigmaTotal = (sigmaTotal + (2 * i - 1));
		}

		sigmaTotal = ((sigmaTotal * 2) + (2 * n + 1));
		return sigmaTotal;
	}

	//method to recursively use S(n) formula
	public static int puzzleRecurse(int n)
	{
		if (n == 0)
			return 1;
		else if (n >= 1)
		{
			return puzzleRecurse(n-1) + (4 * n);
		}

		return 1;
	}




}