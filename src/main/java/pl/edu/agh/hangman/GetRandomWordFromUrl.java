package pl.edu.agh.hangman;

public class GetRandomWordFromUrl implements GetRandomWord {
    private String url;
    public GetRandomWordFromUrl(String url) {
        this.url=url;
    }


    @Override
    public String getWord() {
        return "ala";
    }
}




