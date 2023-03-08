import java.util.Scanner;

public class Lobby {
    Scanner input = new Scanner(System.in);
    int lobbyOption;
    boolean option = false; // En boolean för att kontrollera loop.

    // Metod som skriver ut att användaren är i lobbyn
    public void statusLobby() {
        System.out.println("You are currently in the lobby");
    }

    // Metod som skriver ut en introduktion till spelet
    public void introduction() {
        System.out.println("Welcome to HangMan!");
        System.out.println("Hangman is a word guessing game where one player thinks of a word \nand the other player tries to guess the word by suggesting letters. \nThe player who is guessing has a limited number of incorrect guesses they can make before losing the game.");
    }

    // Metod som frågar användaren om hen vill starta spelet
    public void askForStartGame() {
        System.out.println("Start the game? y/n");
    }

    // Metod som kontrollerar användarens svar om hen vill starta spelet eller inte
    public boolean checkAnswer() {
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            return true; // Returnerar true om användaren svarar "y"
        } else if (answer.equalsIgnoreCase("n")) {
            return false; // Returnerar false om användaren svarar "n"
        } else {
            System.out.println("Invalid input");
            return false; // Returnerar false om användaren skriver något annat än "y" eller "n"
        }
    }

    // Metod som skriver ut en meny för spelet och låter användaren välja ett alternativ
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
        lobbyOption = answer;

        if (answer >= 1 && answer <= 5) {
            option = true;
            return true; // Returnerar true om användaren har valt ett giltigt alternativ (1-5)
        } else {
            return false; // Returnerar false om användaren har valt ett ogiltigt alternativ
        }
    }

    // Metod som skriver ut ett meddelande när programmet avslutas
    public void exitProgram() {
        System.out.println("Exiting program!\nCya :)");
    }

    // Metod som skriver ut ett meddelande när spelet startar
    public void startEngine() {
        System.out.println("Game is now starting");
    }
}
