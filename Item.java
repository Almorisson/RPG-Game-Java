package game.rpg;

public interface Item {

    public String getName();
    public void put(Player player);
    public void remove(Player player);
}
