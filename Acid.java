package game.rpg;

public class Acid implements Tangible {

    private int damagePoint;

    public Acid(int damagePoint) {

        this.damagePoint = damagePoint;
    }

    public Acid() {

    }

    public void action(Player player){
        player.getHealthBar().removeCurrentPoint(damagePoint);
    }
    public char showAs(){
        return 'A';
    }
}
