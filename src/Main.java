
public class Main {
    private static boolean lobbyRunning;
    private static boolean choice; // Nu finns variabeln tillgänglig för alla metoder inom Main
                                   //ifall du skapar metoder
    int specificOption;

    public static void main(String[] args) {
        // Instansiera ett nytt objekt av klassen WordList.
        WordList ordlista = new WordList();
        ordlista.initWords(); // initiera alla förinställda ord.
        // Instansiera en ny spelare av klassen Player.
        Player newPlayer = new Player();
        newPlayer.getPlayerName(); // Hämta spelarens namn
        newPlayer.WelcomePlayer(); // Välkomna spelaren.
        Lobby newLobby = new Lobby(); // Instansiera nytt objekt av klassen Lobby
        //Här kan du sätta en while (true)
        while (true) {

            newLobby.introduction(); // Introducera spelets regler och mål.
            newLobby.askForStartGame(); // Fråga användaren om de vill starta spelet.
            choice = newLobby.checkAnswer(); // Kontrollera användarens svar.

            if (choice) {
                lobbyRunning = true;
                break;
            } else {
                break;
            }


        } while (lobbyRunning) {
            newLobby.LobbyMenu(); // Visa menyn och mata in val
            int specificOption = newLobby.lobbyOption;


            // Switch case för inmatning av val:
            switch (newLobby.lobbyOption) {
                case 1: // Skapa boolean enterGame == running;
                    // Skapa en metod som slumpmässigt väljer ut ett ord ur vår WordList.
                    System.out.println("Game is now starting");


                    break;

                case 2: // Skapa en metod för att lägga till ett ord i WordList:
                    System.out.println("Add a word");
                    ordlista.addWord();
                    continue;

                case 3: // Skapa en metod för att ta bort ett ord från WordList:
                    System.out.println("Remove a word!");
                    ordlista.removeWord();
                    continue;

                case 4: // Visa alla ord.
                    System.out.println("Showing all words");
                    ordlista.showWords();
                    continue;

                case 5: // Avsluta programmet
                    newLobby.exitProgram();
                    break;
            }
            break;
        }


        // Till senare:
        // Skapa meny. Lägg till ord, ta bort ord, visa alla ord (om användaren nu skulle vilja fuska) , och starta spelet.
//



        // och här är det lagom att avsluta din while
    }

}