/**
 * This class creates a staircase of stars, both ascending and descending.
 *@author Dillon Shu
 *@version 1.0
 */
// "C:\Program Files\Java\jdk1.8.0_101\bin\javac" 
import java.util.Scanner;
public class StairCases
{
  /**
   * Main method demonstrates the other Two methods by calling each of them.
   * @param args Standard array of commandline String arguments. Not used in this program.
   */

public static void main(String[] args)
  {
	Scanner user = new Scanner(System.in);
	System.out.println("Hi! Please input an integer to see a cool staircase! ");
	int size = user.nextInt();
	size -= 1;
	System.out.println("Great, Thanks!");
	System.out.println("");
	
	
    printAscending(size);
	System.out.println("");
    printDescending(size);
  }

  /**
   * Method organizes how the stars (from forLoop) are printed out in an ascending fashion
   *@param takes in an integer that determines the size of the staircase
   */

public static void printAscending(int size)
{

		if (size > 0)
			printAscending(size - 1);
		forLoop(0, size);
		
}

  /**
   * Prints out the correct number of stars for printAscending
   *@param takes in two ints, one that determines the starting number of stars (per line) and one that determines the ending number
   */
public static void forLoop(int begin, int finish)
{
	for (int counter = begin; counter <= finish; counter++)
	{
		System.out.print("*");
	}
	System.out.println("");
}
  /**
   *Prints out the correct number of stars for printDescending
   *@param takes in two ints, one that determines the starting number of stars (per line) and one that determines the ending number
   */
public static void forLoop2(int begin)
{
	for (int counter = begin; counter > 0; counter--)
	{
		System.out.print("*");
	}
	System.out.println("");
}
 /**
  *Method organizes how the stars (from forLoop2) are printed out in an descending fashion
  *@param takes in an integer that determines the size of the staircase
  */
public static void printDescending(int size)
{
	forLoop(0, size);
	if (size > 0)
		printDescending(size - 1);

}
}
