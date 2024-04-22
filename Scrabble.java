package cs210;

import java.util.Arrays;

import java.util.Scanner;

public class Scrabble {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Amount of words you want- ");
		
		int len = sc.nextInt();
		
		System.out.println("Now Input" +" "+ len + " " + "words- ");
		String [] words = new String [len+1]; 
		
		for (int i = 0 ; i < len+1; i++)
		{
			words[i] = sc.nextLine();
		}
		

		
		
		SortWords(words);
		
		
        for (String word : words) 
        	
        {
        	int score = Score(word);
        	
        	 if(score == 0)
             {
             	System.out.println("");
             }
        	 else 
        	 {
        		 System.out.println(word + "  " + " - " + " "+ score);
        	 }
            
        }
		
		
		
			
	}
	
	
	public static void SortWords(String[] words) {
        
        

        // Implement custom sorting logic
        Arrays.sort(words, (word1, word2) -> {
            int score1 = Score(word1);
            int score2 = Score(word2);

            
            if (score1 != score2) {
                return Integer.compare(score1, score2);
            } else {
                
                return word1.compareTo(word2);
            }
        });
    }

    public static int Score(String word) {
        int score = 0;
        
        int[] letterScores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

   
        for (char letter : word.toCharArray()) 
        {
            if (letter >= 'a' && letter <= 'z') 
            {
                score += letterScores[letter - 'a'];
                
            } else if (letter >= 'A' && letter <= 'Z') {
                score += letterScores[letter - 'A'];
            }
           
        }
        

        return score;
    }

	

}
