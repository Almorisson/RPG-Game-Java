package game.rpg;

public class Position {

	   private int x;
	   private int y;
	   private String currentMap;

	   public Position(int x, int y, String currentMap) {
		   this.x = x;
		   this.y = y;
		   this.currentMap = currentMap;
	   
	   }
		
	   public String getCurrentMap() {
			return currentMap;
		}
	
	
	
		public void setCurrentMap(String currentMap) {
			this.currentMap = currentMap;
		}

		public Position(int x, int y){
	        this.x = x;
	        this.y = y;
	    }

	    public int getX(){

	        return this.x;
	    }

	    public int getY(){

	        return this.y;
	    }


	    public void setX(int x){

	        this.x = x;
	    }


	    public void setY(int y){

	        this.y = y;
	    }


}
