import java.util.Scanner;

public class StringSetTester
{
	/**
	 * @author Marissa
	 * @param args
	 */
	public static void main(String[] args)
	{
		StringSet stringSet2 = new StringSet();
		Scanner kybd = new Scanner(System.in);
		System.out.print("How many strings will you enter? ");
		int numStr = kybd.nextInt();
		kybd.nextLine();

		for (int i = 0; i < numStr; ++i)
		{
			System.out.print("Enter in one string at a time: ");
			stringSet2.add(kybd.nextLine());
		}

		System.out.println(
				"The current number of strings is: " + stringSet2.size());
		System.out.println(
				"The number of characters is: " + stringSet2.numChars());
		// stringSet2.pop();
		System.out.print("Enter a string to search for: ");
		String substring = kybd.nextLine();

		System.out.print(
				"The number of strings that contain the given string are: "
						+ stringSet2.countStrings(substring));

	}

}
