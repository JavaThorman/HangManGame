import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class WordList {
    Scanner input = new Scanner(System.in);

    public ArrayList<String> wordList = new ArrayList<String>();
    String ord1 = "fönster";
    String ord2 = "penna";
    String ord3 = "katt";
    String ord4 = "bok";
    String ord5 = "lampa";
    String ord6 = "dator";
    String ord7 = "mjölk";
    String ord8 = "solglasögon";
    String ord9 = "cykel";
    String ord10 = "skruvmejsel";
    String ord11 = "gitarr";
    String ord12 = "tomat";
    String ord13 = "klocka";
    String ord14 = "hund";
    String ord15 = "spis";
    String ord16 = "telefon";
    String ord17 = "bord";
    String ord18 = "gardin";
    String ord19 = "paraply";
    String ord20 = "blomma";

    public void initWords() {
        wordList.add(ord1);
        wordList.add(ord2);
        wordList.add(ord3);
        wordList.add(ord4);
        wordList.add(ord5);
        wordList.add(ord6);
        wordList.add(ord7);
        wordList.add(ord8);
        wordList.add(ord9);
        wordList.add(ord10);
        wordList.add(ord11);
        wordList.add(ord12);
        wordList.add(ord13);
        wordList.add(ord14);
        wordList.add(ord15);
        wordList.add(ord16);
        wordList.add(ord17);
        wordList.add(ord18);
        wordList.add(ord19);
        wordList.add(ord20);
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
    public String randomWord() {
        Random rand = new Random(); // create an instance of Random class
        int randomNumber = rand.nextInt(wordList.size()); // generates a random number between 0 and wordList.size()-1
        String randomWord = wordList.get(randomNumber); // get the word at the randomly generated index
        return randomWord;
    }

            // slumpvald ord från ordlistan






    }



