package game.rpg;

public abstract class Game {

	 private String name;
	    private Key keyCondition;
	    private Key keyReward;


	    public Game(String name, Key keyCondition, Key keyReward) {
	        this.name = name;
	        this.keyCondition = keyCondition;
	        this.keyReward = keyReward;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public Key getKeyCondition() {

	        return this.keyCondition;
	    }


	    public Key getKeyReward() {

	        return this.keyReward;
	    }

	    public abstract boolean play(Key k,String input);
	    public abstract Key reward();
	    public abstract boolean canPlay(Key k);
	    
}
