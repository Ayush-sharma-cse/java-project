import java.util.*;
import java.util.Random;
public class guess {
    public static void main(String[] args) {
    
        int guess;
        Random rand=new Random();
        int numberToGuess=rand.nextInt(100)+1;
        Scanner Sc=new Scanner(System.in);
        System.out.println("welcome to number guessing game!");
        System.out.println("guess a number between 1 and 100");

        do {
            System.out.println("enter your guess");
            guess=Sc.nextInt();
            
            if(guess > numberToGuess) {

            
            System.out.println("too high! try again");
            }
            else if(guess < numberToGuess) 
            {
                System.out.println("too low!");
            }
            else 
            {
                System.out.println("correct! attempts:");

            }

        } while(guess!= numberToGuess);

        Sc.close();
    
    }
}

            


        
    
