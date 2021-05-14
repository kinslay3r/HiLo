import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        
        int min = 1;
        int max = 10;
        int random_number = (int)Math.floor(Math.random()*(max-min+1)+min);
        int guess;
        int tries = 0;
        Scanner myObj = new Scanner(System.in);
        try {
            do {
                System.out.print("Enter your guess between 1 and 10: ");
                guess = myObj.nextInt();
                if (guess < random_number) {
                    tries++;
                    System.out.println("Your guess is too low. Please try again.");
                    
                } else if (guess > random_number) {
                    tries++;
                    System.out.println("Your guess is too high. Please try again.");
                    
                }
                    
                  else {
                    tries++;
                    System.out.println("You guessed the number! It took you " + tries + " tries!" );
                    
                  }  
            } while (guess != random_number);
        } finally {
            myObj.close();
        }
    } 
}