import java.util.ArrayList;
import java.util.Scanner;

public class WordList {
    Scanner input = new Scanner(System.in);
    public ArrayList<String> wordList = new ArrayList<String>();
    String ord1 = "fönster";
    String ord2 = "penna";
    String ord3 = "katt";
    String ord4 = "bok";
    String ord5 = "lampa";


    public void initWords() {
        wordList.add(ord1);
        wordList.add(ord2);
        wordList.add(ord3);
        wordList.add(ord4);
        wordList.add(ord5);
    }

    public void showWords() {
        System.out.println("+---------------------+");
        System.out.println("|      GAME MENU      |");
        System.out.println("+---------------------+");

        for (int i = 0; i < wordList.size(); i++) { // visa alla ord i en lista.
            System.out.println(wordList.get(i));
        }
        System.out.println("+---------------------+");
        System.out.println("+--Choose an option --+");
        System.out.println("+---------------------+");
    }

    public void addWord() {
        System.out.println("Enter the word you would like to add! ");
        String word = input.nextLine();
        wordList.add(word);
        System.out.println("Word: " + word + " has been added to the list!");
    }


    public void removeWord() {
        System.out.println("Enter the word you want to remove: ");
        String wordToRemove = input.nextLine();
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equalsIgnoreCase(wordToRemove)) {
                wordList.remove(wordToRemove);
                System.out.println("Word: " + wordToRemove + " has been removed from the list!");
            }
            }
        }

            // slumpvald ord från ordlistan
    }



