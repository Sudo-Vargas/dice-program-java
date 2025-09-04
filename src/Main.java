//import scanner to use for user input
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        //create a new scanner
        Scanner scanner = new Scanner(System.in);

        //gets number of dice from user and puts it in a variable called dicenum
        System.out.println("How many dice would you like to roll?");
        int dicenum = scanner.nextInt();

        //gets number of dice sides from user and puts it in a variable dicesides
        System.out.println("How many sides should they have?");
        int dicesides = scanner.nextInt();

        //create variable length array with dicenum as highest number
        int[] rolls = new int[dicenum];

        //create total variable to start counting total
        int total = 0;

        // for loop to roll dice dicenum times
        for (int i = 0; i < dicenum; i++) {

            //generate random roll from 1 to dicesides
            int roll = (int) (Math.random() * dicesides) + 1;

            //store roll value in the array
            rolls[i] = roll;

            //add roll to total
            total = total + roll;

            //print dice roll
            System.out.println("Die " + (i +1) + ": " + rolls[i]);
        }

        //print sum of dice rolls
        System.out.println("Sum of all rolls: " + total);

        //close scanner
        scanner.close();

    }

}