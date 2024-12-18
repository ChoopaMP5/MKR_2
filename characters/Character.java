package characters;

public interface Character {
    void attack(Character target);
    void move(int x, int y);
    String getName();
}
