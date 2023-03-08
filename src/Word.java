import java.util.Scanner;

public class Word {
    // Instansvariabler
    private String currentOrd; // aktuellt ord som ska gissas
    private String originalOrd; // ursprungliga ordet

    // Metod för att sätta aktuellt ord
    public void setWord(String ord) {
        this.currentOrd = ord;
        this.originalOrd = ord;
    }

    // Metod för att hämta aktuellt ord
    public String getWord() {
        return this.originalOrd;
    }

    // Metod för att byta ut bokstäverna i aktuellt ord med streck
    public void replaceWordWithDashes() {
        String wordWithDashes = "";
        for (int i = 0; i < this.currentOrd.length(); i++) {
            wordWithDashes += "-";
        }
        this.currentOrd = wordWithDashes;
    }

    // Metod för att gissa ord

    // Metod för gissa ord är hämtad från nätet. Hade kunnat lösa det själv men pga tidspressen så kör jag på detta.

    public void gissaOrd() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 15; // antal försök användaren har på sig
        boolean guessedWord = false; // om användaren har gissat hela ordet
        boolean gameOver = false; // om spelet är över
        StringBuilder guessedLetters = new StringBuilder(); // lagrar de bokstäver som användaren har gissat

        // Presentera spelet och det aktuella ordet
        System.out.println("Gissa ordet! Du har " + attempts + " försök.");
        System.out.println(this.currentOrd);

        // Loop tills spelet är över
        while (!gameOver) {
            System.out.print("Gissa bokstav eller hela ordet: ");
            String input = scanner.nextLine().toLowerCase();

            // Användaren gissade hela ordet
            if (input.equals(this.originalOrd)) {
                guessedWord = true;
                break;
            }

            // Användaren gissade en bokstav
            if (input.length() == 1) {
                char letter = input.charAt(0);
                if (guessedLetters.indexOf(input) != -1) {
                    System.out.println("Du har redan gissat bokstaven " + letter);
                    continue;
                }
                guessedLetters.append(letter);
                if (this.originalOrd.indexOf(letter) != -1) {
                    System.out.println("Bokstaven " + letter + " finns i ordet!");
                    this.updateCurrentWord(letter);
                } else {
                    System.out.println("Bokstaven " + letter + " finns inte i ordet!");
                    attempts--;
                }
            }

            // Användaren har inte gissat hela ordet än och har inga försök kvar
            if (!guessedWord && attempts == 0) {
                System.out.println("Spelet är över! Du har inga försök kvar.");
                System.out.println("Ordet var: " + this.originalOrd);
                gameOver = true;
            }

            // Användaren har gissat hela ordet
            if (guessedWord || this.currentOrd.equals(this.originalOrd)) {
                System.out.println("Grattis, du har gissat rätt!");
                gameOver = true;
            }
        }
    }




    private void updateCurrentWord(char letter) {
        StringBuilder newWord = new StringBuilder(this.currentOrd);
        for (int i = 0; i < this.currentOrd.length(); i++) {
            if (this.currentOrd.charAt(i) == letter) {
                newWord.setCharAt(i, letter);
            }
        }
        this.currentOrd = newWord.toString();
    }

    // Slut på lånad kod.



}





