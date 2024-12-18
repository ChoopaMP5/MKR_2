package factory;

import characters.Character;
import characters.Warrior;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}
