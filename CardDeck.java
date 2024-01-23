import java.util.Scanner;

public class CardDeck {

    public static void main(final String[] args) {

        // setting up my variables, the user input will be a simple integer while the suit and royal will be strings as they have to return text
        Scanner input = new Scanner(System.in);
        int choice = 0;
        String suit = "";
        String royal = "";

        // Asking the user to input a number and assigning it to the variable "choice".
        System.out.println("Enter a number between 1 and 52: ");
        choice = input.nextInt();

        // Checking if the number is between 1 and 52 and if it is, checking which suit it belongs to according to the given chart
        if (choice >= 1 && choice <= 13) {
            suit = "Clubs";
        } else if (choice >= 14 && choice <= 26) {
            suit = "Diamonds";
        } else if (choice >= 27 && choice <= 39) {
            suit = "Hearts";
        } else if (choice >= 40 && choice <= 52) {
            suit = "Spades";
        } else {
            System.out.println("Invalid number.");
            System.exit(0);
        }

        // Here I determine if the input number is a royal card or not, if it is, I assign the correct name to the string.
        // If it is not, I convert the number to a string and divide by 13 to get the remainder which will be the number of the card.
        if (choice % 13 == 1) {
            royal = "Ace";
        } else if (choice % 13 == 11) {
            royal = "Jack";
        } else if (choice % 13 == 12) {
            royal = "Queen";
        } else if (choice % 13 == 0) {
            royal = "King";
        } else {
            royal = Integer.toString(choice % 13);
        }

        // Printing the result.
        // Because I convert the number to a string if its not a royal, I can just print the two string variables and the integer isnt used. 
        System.out.println("You picked the " + royal + " of " + suit + ".");
        input.close();
    }

}
