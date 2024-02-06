package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class Game {
    public String word;
    private String mask = "";
    private int numberOfAttempts;
    private ArrayList<String> wrongAttempts = new ArrayList<>();
    private ArrayList<String> properAttempts = new ArrayList<>();
    public Game(String word, int numberOfAttemps ){
        this.word = word;
        this.numberOfAttempts = numberOfAttemps;
    }
   public void start() {
       System.out.println("Zagraj w wisielca");
       updateMask();
       Print.printState(this.wrongAttempts, mask);

       while (wrongAttempts.size() < this.numberOfAttempts) {
           performRound();

           if (wrongAttempts.size() == this.numberOfAttempts) {
               this.onFail();
           }

           if (isGameIsWon()) {
               break;
           }
       }
   }
   private void performRound() {
       String letter = askForInput();

       if (word.contains(letter)) {
           properAttempts.add(letter);
           System.out.println("Litera znajduje się w słowie");
       } else {
           wrongAttempts.add(letter);
           System.out.println("Litery nie ma w słowie");
       }

       updateMask();
       Print.printState(this.wrongAttempts, mask);

       if (isGameIsWon()) {
           this.onSuccess();
       }
   }
    private boolean isGameIsWon() {
        return !this.mask.contains("_");
    }
   private boolean checkIfIsLetter(String letter) {
        return letter.length() == 1;
   }
   private String askForInput() {
       Scanner myObj = new Scanner(System.in);
       System.out.println("");
       System.out.println("Podaj literę");

       String letter = myObj.nextLine();

       while(!checkIfIsLetter(letter)) {
           System.out.println("Litera jest niepoprawna. Podaj poprawną literę (1znak)");
           letter = myObj.nextLine();
       }

       return letter.toUpperCase(Locale.ROOT);
   }
    public void updateMask() {
        String newMask = "";

        for (int i = 0; i < word.length(); i++) {
            String letter = String.valueOf(word.charAt(i));
            newMask = newMask + (properAttempts.contains(letter) ? letter : "_ ");
        }

        this.mask = newMask;
    }
    private void onSuccess() {
        Print.printGameWon();
    }
    private void onFail() {
        Print.printGameLost(this.word);
    }
}
