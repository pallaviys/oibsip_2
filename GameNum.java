import java.util.Random;
import java.util.Scanner;
import java.lang.System;



public class GameNum {

    public static void main(String[] args){
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Pick a number: ");

        Scanner inputnum = new Scanner(System.in);  
        int maxnum;
        maxnum = inputnum.nextInt();

        Random ran = new Random();
        int number = ran.nextInt(maxnum);
        int trials = 0; //Will increase depending on how many tires it takes
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false){  

            System.out.println("Guess a number between 1 and "+ maxnum +": ");
            guess = input.nextInt();
            trials++; 

            if (guess == number){
                win = true; 
            }

            else if(guess < number){
                System.out.println("Entered number is too low, try again");
                
            }

            else if(guess > number){
                System.out.println("Entered number is too high, try again");
                
            }

        }

        System.out.println("You win!!");
        System.out.println("It took you "+ trials + " trials.");

    }
}