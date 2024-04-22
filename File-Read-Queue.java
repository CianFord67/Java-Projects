package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) 
    {
        
    	String filePath = "/Users/cian_ford/Library/Com Sci/queue.txt";

        File myfile = new File(filePath);

        PriorityQueue<String> priorityQueue = new PriorityQueue<>((word1, word2) -> {
            int vowels1 = countVowels(word1);
            int vowels2 = countVowels(word2);

            if (vowels1 != vowels2) {
                return Integer.compare(vowels2, vowels1);
            } else {
                return word1.compareTo(word2);
            }
        });

        try {
            Scanner sc = new Scanner(new File(filePath));

            while (sc.hasNext()) {
                String operation = sc.next();

                if (operation.equals("INSERT")) 
                {
                    String word = sc.next();
                    priorityQueue.add(word);
                } 
                else if (operation.equals("REMOVE")) 
                {
                    priorityQueue.poll();
                } 
                else if (operation.equals("PEEK")) 
                {
                    String peekedWord = priorityQueue.peek();
                    System.out.println(peekedWord);
                }
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    public static int countVowels(String data) {
        return (int) data.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
