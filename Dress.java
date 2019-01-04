package game.rpg;

public class Dress implements Item {

	 private String name;
	    private int lifePoints;
	    private int defencePoints;

	    public Dress(int lifePoints, int defencePoints,String name){

	        this.lifePoints = lifePoints;
	        this.defencePoints = defencePoints;
	        this.name = name;
	    }

	    public Dress(){

	    }

	    public String getName(){

	        return this.name;
	    }

	    public int getLifePoints(){
	        return this.lifePoints;
	    }

	    public int getDefencePoints(){

	        return this.defencePoints;
	    }

	    public void setLifePoints(int lifePoints){

	        this.lifePoints = lifePoints;
	    }

	    public void setDefencePoints(int defencePoints){

	        this.defencePoints = defencePoints;
	    }


	    public void put(Player player){

	        player.getHealthBar().addMaxPoint(lifePoints);
	        player.getStats().addDefence(defencePoints);
	    }

	    public void remove(Player player){

	        player.getHealthBar().removeMaxPoint(lifePoints);
	        player.getStats().removeDefence(defencePoints);
	    }


}
