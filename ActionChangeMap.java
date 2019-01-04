package game.rpg;

public class ActionChangeMap implements Reaction {
	private Position position;
	
    public ActionChangeMap(Position position) {
		this.position = position;
	}

	@Override
    public ReactionType getTypeReaction() {
        return ReactionType.ChangeMap;
    }

    @Override
    public String getTextOfReaction() {
        return "Player changes map";
    }


	@Override
	public void action(Player player) {
		player.getPosition().getCurrentMap();
		
	}
}
