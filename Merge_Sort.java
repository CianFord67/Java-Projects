package Lab3;

import java.util.Scanner;

public class Merge_Sort {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		
		String answer = Merge(word1,word2);
		
		System.out.println(answer);
	}
	
	
	public static String Merge(String word1, String word2)
	{
		
		int len1 = word1.length();
		int len2 = word2.length();
		
		int dif = len2 - len1;
		
		String word = new String();
		String word3 = new String();
		
		for(int i = 0; i < len1; i++)
		{
			char CHAR1 = word1.charAt(i);
			char CHAR2 = word2.charAt(i);
			
			word = word + CHAR1 + CHAR2;
			//word = word + CHAR2;
		}
		
		
		if (dif >= 0) {
		    for (int j = word1.length(); j < word2.length(); j++) {
		        char CHAR3 = word2.charAt(j); // Access characters from word2

		        word = (word+CHAR3);
		    }
		}
		
		



		
		
		
		
		return word;
		
	}

}


