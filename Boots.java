package game.rpg;

public class Boots implements Item {

	  private String name;
	    private int lifePoints;
	    private int attackPoints;


	    public Boots(int lifePoints, int attackPoints,String name){

	        this.lifePoints = lifePoints;
	        this.attackPoints = attackPoints;
	        this.name = name;
	    }

	    public Boots(){
	    }

	    public String getName(){

	        return this.name;
	    }

	    public int getLifePoints(){
	        return this.lifePoints;
	    }

	    public int getAttackPoints(){

	        return this.attackPoints;
	    }

	    public void setLifePoints(int lifePoints){

	        this.lifePoints = lifePoints;
	    }

	    public void setAttackPoints(int attackPoints){

	        this.attackPoints = attackPoints;
	    }

	    public void put(Player player){

	        player.getHealthBar().addMaxPoint(lifePoints);
	        player.getStats().addAttack(attackPoints);
	    }

	    public void remove(Player player){

	    	player.getHealthBar().removeMaxPoint(lifePoints);
	    	player.getStats().removeAttack(attackPoints);
	    }


}
