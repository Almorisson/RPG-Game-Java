package game.rpg;

public class Area {
	private Cell[][] world;
	private String name;
	
	
	public Area(int width, int height, String name) {
		this.world = new Cell[width][height];
		this.name = name;
	}
	
	public Area(Cell[][] world, String name){
		this.world = world;
		this.name = name;
	}
	
	public void registerTangibleAt(int row, int column, Tangible tangible) {
		if (tangible != null) {
			this.world[row][column].addTangible(tangible);
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void registerCellAt(int row, int column,Cell cell){
		
		this.world[row][column] = cell;
	}
	
	public void print(){		
		
		for (int i = 0; i < world.length; i++) {
			for (int j = 0; j < world[i].length; j++) {
				
				System.out.print(world[j][i].showAs());
			}
			System.out.println();
		}
		System.out.println();

	}
	public void registerReactionAt(int row, int column, Reaction reaction){
		this.world[row][column].addReaction(reaction);
	}
	public Cell[][] getWorld() {
		return this.world;
	}

	public void setWorld(Cell[][] world) {
		this.world = world;
	}

	public Cell[][] getArea() {
		return this.world;
	}

}
