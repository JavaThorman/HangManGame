import java.util.Scanner;

public class Lobby {

    Scanner input = new Scanner(System.in);
    boolean startGame;
    int lobbyOption;
    boolean option = false; // initiera en boolean för att kontrollera loop.


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
            boolean startGame = true;
            return true;

            //så i och med att checkAnswer är en boolean så kommer choice att sättas till vad checkAnswer() får för värde.. ?
            // Yes
        } else if (answer.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("Invalid input");
            return false;
        }
    }


    public boolean LobbyMenu() {

        System.out.println("+---------------------+");
        System.out.println("|      GAME MENU      |");
        System.out.println("+---------------------+");
        System.out.println("| 1. PLAY GAME        |");
        System.out.println("| 2. ADD WORD         |");
        System.out.println("| 3. REMOVE WORD      |");
        System.out.println("| 4. SHOW ALL WORDS   |");
        System.out.println("| 5. EXIT GAME        |");
        System.out.println("+---------------------+");
        System.out.println("+--Choose an option --+");
        System.out.println("+---------------------+");
        int answer = input.nextInt();
        int lobbyOptionNew = lobbyOption;
        lobbyOption = answer;


        if (answer >= 1 && answer <= 5) {
            option = true;
            return true;

        } else {
            return false;

        }
    }





}







