package probability;

import java.util.Random;

public class Table_Spin {

    public static void main(String[] args) {
        int totalSpins = 1000000000; // Total number of spins in the simulation

        // Run the simulation to estimate probabilities
        double redProbability = simulateRoulette(totalSpins, "red");
        double blackProbability = simulateRoulette(totalSpins, "black");
        double greenProbability = simulateRoulette(totalSpins, "green");

        // Output the results
        System.out.println("Monte Carlo Simulation Results:");
        System.out.println("Probability of Red: " + redProbability);
        System.out.println("Probability of Black: " + blackProbability);
        System.out.println("Probability of Green: " + greenProbability);
    }

    public static double simulateRoulette(int totalSpins, String color) {
        int colorCount = 0; // Counter for the number of spins resulting in the specified color
        Random random = new Random();

        // Run the simulation
        for (int i = 0; i < totalSpins; i++) {
            int spinResult = random.nextInt(38); // Generate a random spin result between 0 and 37

            // Check the color of the spin result
            if (color.equals("red") && isRed(spinResult)) {
                colorCount++;
            } else if (color.equals("black") && isBlack(spinResult)) {
                colorCount++;
            } else if (color.equals("green") && isGreen(spinResult)) {
                colorCount++;
            }
        }

        // Calculate and return the estimated probability
        return (double) colorCount / totalSpins;
    }

    public static boolean isRed(int spinResult) {
        return spinResult == 1 || (spinResult >= 3 && spinResult <= 9) || (spinResult >= 12 && spinResult <= 18)
                || (spinResult >= 19 && spinResult <= 27) || (spinResult >= 30 && spinResult <= 36);
    }

    public static boolean isBlack(int spinResult) {
        return (spinResult >= 2 && spinResult <= 10) || (spinResult >= 11 && spinResult <= 17)
                || (spinResult >= 20 && spinResult <= 28) || (spinResult >= 29 && spinResult <= 35);
    }

    public static boolean isGreen(int spinResult) {
        return spinResult == 0 || spinResult == 37;
    }
}
