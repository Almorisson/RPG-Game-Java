package game.rpg;

public class HolyWater implements Tangible {
    private int lifesToAdd;

    public HolyWater(int lifes) {

        this.lifesToAdd = lifes;
    }

    public HolyWater() {

    }

    public void action(Player player) {

        player.getHealthBar().addCurrentPoint(lifesToAdd);
    }

    public char showAs(){return 'H';}

}
