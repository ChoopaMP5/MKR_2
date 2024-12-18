package factory;

import characters.Character;
import characters.Mage;

public class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Mage();
    }
}
