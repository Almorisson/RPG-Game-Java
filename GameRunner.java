package game.rpg;

public class GameRunner {

    private String input;
    private Key keyToPlay;

    public GameRunner(Key key,String input) {
        this.input = input;
        this.keyToPlay = key;
    }

    public boolean playGame(Game game) {
        if(game.canPlay(getKeyToPlay()) == true) {
            game.play(getKeyToPlay(), getInput());
            // return true;                                                                                                                                                                                                                                                           
        }

        return false;
    }

    public String getInput() {
        return this.input;
    }

    public Key getKeyToPlay() {
        return this.keyToPlay;
    }
}
