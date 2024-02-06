package pl.edu.agh.hangman;

public class Hangman {



    public static void main(String[] args) {
    GetRandomWordFromUrl generator=new GetRandomWordFromUrl("src/main/resources/slowa.txt");
     String word= generator.getWord();
        System.out.println(word);

        Game game = new Game("word",6);
        game.start();

    }
}
