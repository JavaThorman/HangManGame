import java.util.Scanner;

public class Lobby {
    Scanner input = new Scanner(System.in);
    boolean startGame;


    public void statusLobby() {
        System.out.println("You are currently in the lobby");
    }

    public void introduction() {

        System.out.println("Welcome to HangMan!");
        System.out.println("Hangman is a word guessing game where one player thinks of a word \nand the other player tries to guess the word by suggesting letters. \nThe player who is guessing has a limited number of incorrect guesses they can make before losing the game.");
    }

    public void askForStartGame() {
        System.out.println("Start the game? y/n");

    }

    public boolean checkAnswer() {
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            return true;
        } else if (answer.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("Invalid input");
            return false;
        }
    }

    public void startGame() {



    }
}





