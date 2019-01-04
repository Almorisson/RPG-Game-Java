package game.rpg;

public class Stats {

	  private int attack;

	    private int defence;

	    public Stats(int attack, int defence) {
	        this.attack = attack;
	        this.defence = defence;
	    }

	    public void addAttack(int attack) {
	        this.attack += attack;
	    }

	    public void addDefence(int defence) {
	        this.defence += defence;
	    }

	    public void removeAttack(int attack) {
	        this.attack -= attack;
	        if (attack < 0) {
	            this.attack = 0;
	        }
	    }

	    public void removeDefence(int defence) {
	        this.defence -= defence;
	        if (defence < 0) {
	            this.defence = 0;
	        }

	    }

	    public int getAttack() {
	        return attack;
	    }

	    public void setAttack(int attack) {
	        this.attack = attack;
	    }

	    public int getDefence() {
	        return defence;
	    }

	    public void setDefence(int defence) {
	        this.defence = defence;
	    }
}
