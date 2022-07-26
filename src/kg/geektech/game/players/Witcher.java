package kg.geektech.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.REVIVE_ALLIES);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0 && this.getHealth() > 0) {
                heroes[i].setHealth(200);
                this.setHealth(0);

            }else return;
        }
    }

}
