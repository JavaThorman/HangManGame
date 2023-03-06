import java.util.Scanner;
public class Player { // Class
    Scanner input = new Scanner(System.in);
     String name;
     int score;

     public void WelcomePlayer() {
         System.out.println("Welcome: "+name);
     }
     public void getPlayerName() {
         System.out.println("Enter your name? ");
        String playerName = input.nextLine();
        name = playerName;
}



}
