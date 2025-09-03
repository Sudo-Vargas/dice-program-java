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


    }

}