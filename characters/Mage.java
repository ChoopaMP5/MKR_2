package characters;

public class Mage implements Character {
    private String name = "Mage";
    private int health = 100;
    private int attackPower = 40;
    private int x = 0, y = 0;

    @Override
    public void attack(Character target) {
        System.out.println(name + " casts a spell on " + target.getName() + " with power " + attackPower);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(name + " moves to (" + x + ", " + y + ")");
    }

    @Override
    public String getName() {
        return name;
    }
}
