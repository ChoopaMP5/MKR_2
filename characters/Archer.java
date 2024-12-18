package characters;

public class Archer implements Character {
    private String name = "Archer";
    private int health = 120;
    private int attackPower = 30;
    private int x = 0, y = 0;

    @Override
    public void attack(Character target) {
        System.out.println(name + " shoots an arrow at " + target.getName() + " with power " + attackPower);
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
