public class Main {
    public static String randomOrd;  // slumpmässigt valt ord
    private static boolean lobbyRunning;  // boolean för att avgöra om lobbyn är igång
    private static boolean choice;  // boolean för att avgöra spelarens val i lobbyn
    private static int specificOption;  // variabel för att spara vald menyoption i lobbyn
    private static Word ord;  // ordet som ska gissas på
    private static Player newPlayer;  // den nya spelaren

    public static void main(String[] args) {
        WordList ordlista = new WordList();  // skapa en ny ordlista
        ordlista.initWords();  // initiera ordlistan med fördefinierade ord
        Lobby newLobby = new Lobby();  // skapa en ny lobby

        while (true) {
            newLobby.introduction();  // hälsningsmeddelande från lobbyn
            newLobby.askForStartGame();  // frågar om spelaren vill starta spelet
            choice = newLobby.checkAnswer();  // kontrollerar spelarens val

            if (choice) {  // om spelaren väljer att starta spelet
                lobbyRunning = true;  // sätt igång lobbyn
                newPlayer = new Player();  // skapa en ny spelare
                newPlayer.getPlayerName();  // hämta spelarens namn
                newPlayer.WelcomePlayer();  // hälsningsmeddelande till spelaren
                ord = new Word();  // skapa ett nytt ord
                break;  // avsluta loopen
            } else {
                break;  // avsluta loopen
            }
        }

        while (lobbyRunning) {  // så länge som lobbyn är igång
            newLobby.LobbyMenu();  // visa lobbymenyn
            specificOption = newLobby.lobbyOption;  // spara spelarens val

            switch (specificOption) {  // beroende på vad spelaren valde i lobbyn
                case 1:
                    newLobby.startEngine();  // starta spelet
                    randomOrd = ordlista.randomWord();  // välj ett slumpmässigt ord från ordlistan
                    ord.setWord(randomOrd);  // sätt ordet som ska gissas på
                    ord.getWord();  // skriv ut ordet som ska gissas på
                    System.out.println(ord.getWord());
                    ord.replaceWordWithDashes();  // byt ut bokstäverna i ordet med understreck
                    ord.gissaOrd();  // fråga spelaren att gissa på bokstäver

                    continue;

                case 2:
                    System.out.println("Lägg till ett ord");
                    ordlista.addWord();  // lägg till ett ord i ordlistan
                    continue;  // fortsätt loopen

                case 3:
                    System.out.println("Ta bort ett ord!");
                    ordlista.removeWord();  // ta bort ett ord från ordlistan
                    continue;  // fortsätt loopen

                case 4:
                    System.out.println("Visa alla ord");
                    ordlista.showWords();  // visa alla ord i ordlistan
                    continue;  // fortsätt loopen

                case 5:
                    newLobby.exitProgram();  // avsluta

            }
            break;
        }

    }

}