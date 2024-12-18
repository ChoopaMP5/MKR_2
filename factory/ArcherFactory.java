package factory;

import characters.Character;
import characters.Archer;

public class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Archer();
    }
}
