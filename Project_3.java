package assignment_03;

import java.util.Scanner;

/* Can count vowels and consonants and print out count of each.
 *  Also does that new trend where vowels get eliminated from words
 *  and turned into uppercase letters to look edgy.
 */

public class Project_3 {
	
	public static void main(String[] args)
	{
		String sentence;
		char letter;
		String new_str = "";
		int len = 0, conCount = 0, aCount = 0, eCount = 0;
		int iCount = 0, oCount = 0, uCount = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		sentence = scan.nextLine();
		do
		{
			letter = sentence.charAt(len);
			
			switch (letter)
			{
			case 'a':
				aCount = aCount + 1;
				break;
			case 'e':
				eCount = eCount + 1;
				break;
			case 'i':
				iCount = iCount + 1;
				break;
			case 'o':
				oCount = oCount + 1;
				break;
			case 'u':
				uCount = uCount + 1;
				break;
			case ' ':
				new_str = new_str + letter;
				break;
			default:
				conCount = conCount + 1;
				new_str = new_str + letter;
				
			}
			
			
			len = len + 1;
			
		}
		while (sentence.length() > len);
		
		/* System.out.println("a: " + aCount);
		System.out.println("e: " + eCount);
		System.out.println("i :" + iCount);
		System.out.println("o: " + oCount);
		System.out.println("u: " + uCount);
		System.out.println("Consonants: " + conCount); */
		System.out.println(new_str.toUpperCase());
		
		scan.close();
	}

}
