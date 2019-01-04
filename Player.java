package game.rpg;
import java.util.*;

public class Player implements Tangible {

	
	private String name;
	private int point;
	private HealthBar healthBar;
	private Stats stats;
	private List<Item> bag;
	private Hat hat;
	private Dress dress;
	private Boots boots;
	private char symbol;
	private Position position;
	
 
	public Player(String name, int point, Stats stats, HealthBar healthBar, List<Item> listItem, char symbol, Position position) {
		this.name = name;
		this.point = point;
		this.stats = stats;
		this.healthBar = healthBar;
		this.bag = listItem;
		this.symbol = symbol;
		this.position = position;
		
	}
	
	

	public char getSymbol() {
		return symbol;
	}
	
	public Position getPosition() {
		return this.position;
	}
	public char showAs() {
		return this.symbol;
	}
	
	
	public void movePlayer(World world, Direction direction){
		int x = this.getPosition().getX();
		int y = this.getPosition().getY();
		Cell[][] cell;
		cell = world.getAreas().get(0).getArea();
		
		if ((direction == Direction.NORTH) && (cell[0].length >= y) && (y>0) && (cell.length >= x)) {
			System.out.println( "Player moved!");
			if (world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].getListReactions() instanceof ActionChangeMap){
				this.position = new Position(x, y-1, this.position.getCurrentMap());
				cell[x][y].removeTangible(this);
				cell[x][y-1].addTangible(this);
				
			}
			
			if ((world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].isEmptyReaction()) == false) {
				for (Reaction reaction : world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].getListReactions()) {
					reaction.action(this);
				}
			}
		}
		
		else if ((direction == Direction.SOUTH) && (cell[0].length >= y) && (y>=0) && (cell.length >= x)) {
			System.out.println( "Player moved!");
			
			if (world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].getListReactions() instanceof ActionChangeMap) {
				this.position = new Position(x, y+1, this.position.getCurrentMap());
				cell[x][y].removeTangible(this);
				cell[x][y+1].addTangible(this);
				
			}
			
			if ((world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].isEmptyReaction()) == false) {
				for (Reaction reaction : world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].getListReactions()) {
					reaction.action(this);
				}
			}
		}
		else if ((direction == Direction.EAST) && (x>=0) && (y>= 0) && cell.length >= x) {
			System.out.println( "Player moved!");
			for (Reaction reaction : world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].getListReactions()) {
				if (reaction instanceof ActionChangeMap) {
					position = new Position(x+1, y, this.position.getCurrentMap());
					cell[x][y].removeTangible(this);
					cell[x+1][y].addTangible(this);
				}
				
			}
			
			if ((world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].isEmptyReaction()) == false) {
				for (Reaction reaction : world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].getListReactions()) {
					reaction.action(this);
				}
			}
				
		} 
			
		else if ((direction == Direction.WEST) && (cell[0].length >= y) && (x>0) && (cell.length >= x)) {
			System.out.println( "Player moved!");
			
			if (world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].getListReactions() instanceof ActionChangeMap) {
				this.position = new Position(x-1, y, this.position.getCurrentMap());
				cell[x][y].removeTangible(this);
				cell[x-1][y].addTangible(this);
				
			}
			if ((world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].isEmptyReaction()) == false) {
				for (Reaction reaction : world.getCurrentArea(this.position.getCurrentMap()).getArea()[this.position.getX()][this.position.getY()].getListReactions()) {
					reaction.action(this);
				}
			}
		}
		
		else {
			System.out.println("Player didn't move!");
		}
	}
	
	public void removeHat() {
		this.hat.remove(this);
		bag.add(this.hat);
		this.hat = null;
	}
	
	public void putHat(Hat hat) {
		if (this.hat != null) {
			removeHat();
		}
		this.hat = hat;
		this.hat.put(this);
	}
	

	public void removeDress() {
		this.dress.remove(this);
		bag.add(this.dress);
		this.dress = null;
	}
	
	public void putDress(Dress dress) {
		if (this.dress != null) {
			removeDress();
		}
		this.dress = dress;
		this.dress.put(this);
	}
	

	public void removeBoots() {
		this.boots.remove(this);
		bag.add(this.boots);
		this.boots = null;
	}
	
	public void putBoots(Boots boots) {
		if (this.boots != null) {
			removeBoots();
		}
		this.boots = boots;
		this.boots.put(this);
	}

	public void attack(Player player){
		if (this.stats.getAttack() > player.getStats().getDefence()){
			int i = stats.getAttack() - player.getStats().getDefence();
			if (i < 0){
				i = 0;
			}
			player.getHealthBar().removeCurrentPoint(i);
		}
	}

	public HealthBar getHealthBar() {
		return healthBar;
	}

	public void setHealthBar(HealthBar healthBar) {
		this.healthBar = healthBar;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public int getPoint() {
		return point;
	}

	public void resetScore() {
		this.point = 0;
	}

	public void addScore(int point) {
		this.point += point;
	}

	public void removeScore(int point) {
		this.point -= point;
	}

	public String toString() {
		return "Name : " + name + ", Point : " + point;
	}

	public Stats getStats() {
		return stats;
	}
	
	public void printBag() {
		int n = 1;
		if (bag.isEmpty()) {
			System.out.println( "Bag Empty" );
		}
		
		for (Item items : bag) {
			if (items.getName() != null) {
				System.out.println(n+" -> " + items.getName());
				n++;
			}
		}
		
		
	}



	public void action(Player player) {
		// TODO Auto-generated method stub
		
	}


	public void takeDamage(int damagePoint) {
		this.healthBar.removeCurrentPoint(damagePoint);
		if (healthBar.currentPoint < 0) {
			healthBar.currentPoint = 0;
		}
	}


	public void heal(int healPoint) {
		this.healthBar.addCurrentPoint(healPoint);
		if (healthBar.currentPoint > healthBar.maxPoint ) {
			healthBar.maxPoint = healthBar.currentPoint;
		}
	
	}

}
