package characters;

public class Warrior implements Character {
    private String name = "Warrior";
    private int health = 150;
    private int attackPower = 20;
    private int x = 0, y = 0;

    @Override
    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName() + " with power " + attackPower);
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
