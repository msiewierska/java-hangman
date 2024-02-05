package pl.edu.agh.hangman;

import java.util.ArrayList;

public class Print {
    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };
    public static void printGameState(int state) {
        System.out.println(HANGMANPICS[state]);
    }

    public static void printGameLost(String word) {
        System.out.println("");
        System.out.println("PRZEGRAŁEŚ! Słowo to: " + word);
        System.out.println("Czy chcesz spróbować jeszcze raz?");
    }

    public static void printGameWon() {
        System.out.println("");
        System.out.println("WYGRAŁEŚ! GRATULACJE!");
    }

    public static void printState(ArrayList<String> wrongAttemps, String mask){
        Print.printGameState(wrongAttemps.size());
        System.out.println("#### Słowo: ");
        System.out.print(mask);
    }
}
