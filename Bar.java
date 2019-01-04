package game.rpg;

public abstract class Bar {

	  	protected String name;
	    protected int currentPoint;
	    protected int maxPoint;

	    public Bar(String name, int currentPoint, int maxPoint){
	        this.name = name;
	        this.currentPoint = currentPoint;
	        this.maxPoint = maxPoint;
	    }

	    public abstract void addCurrentPoint(int point);

	    public abstract void removeCurrentPoint(int point);

	    public abstract void addMaxPoint(int point);

	    public abstract void removeMaxPoint(int point);

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getCurrentPoint() {
	        return currentPoint;
	    }

	    public void setCurrentPoint(int currentPoint) {
	        this.currentPoint = currentPoint;
	    }

	    public int getMaxPoint() {
	        return maxPoint;
	    }

	    public void setMaxPoint(int maxPoint) {
	        this.maxPoint = maxPoint;
	    }

}
