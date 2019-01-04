package game.rpg;

import java.util.*;
public class Cell{


    private List<Tangible> tangibles ;
    private List<Reaction> reactions;

    public Cell(Tangible tangible){
        this.tangibles = new ArrayList<>();
        tangibles.add(tangible);
    }
  
    public Cell(List<Tangible> listTangible){
        this.tangibles = listTangible;
    }

    public Cell(Reaction reaction) {
    	this.reactions = new ArrayList<>();
    	this.reactions.add(reaction);
    }
  
    
    public List<Tangible> getTangibles() {
		return tangibles;
	}

 
        
	public void setTangibles(List<Tangible> tangibles) {
		this.tangibles = tangibles;
	}

	public void addTangible(Tangible tangible){

        tangibles.add(tangible);
    }

    public void removeTangible(Tangible tangible){

        tangibles.remove(tangible);
    }

    public boolean isEmpty(){
        for(Tangible tang: tangibles){
            if(tang.equals(null))
                return true;
        }
        return false;
    }


    public char showAs(){
        if(isEmpty() == false ){
           Tangible tangSize = tangibles.get(tangibles.size() -1);
           return tangSize.showAs();
        }
        return 0;

}

	public ReactionType getTypeReaction() {
		if(isEmpty() == false) {
			Reaction reaction = reactions.get(reactions.size() -1);
			return reaction.getTypeReaction();
		}
		return null;
	}

	
	public String getTextOfReaction() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Reaction> getListReactions() {
	
       return reactions;
 
        
	}

	public void addReaction(Reaction reaction) {
		reactions.add(reaction);
		
	}

	public void action(Player player) {
		
		
	}

	public boolean isEmptyReaction() {
		for(Reaction reaction :reactions) {
			if(reaction.equals(null))
				return false;
		}
		return true;
	}


}
