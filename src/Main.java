
public class Main {



    public static void main(String[] args) {
        Player newPlayer = new Player();
        newPlayer.getPlayerName();
        newPlayer.WelcomePlayer();
        Lobby newLobby = new Lobby();
        newLobby.introduction();

        newLobby.askForStartGame();
        newLobby.checkAnswer();
        newLobby.startGame();



    }

}