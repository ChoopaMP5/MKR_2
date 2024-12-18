import characters.Character;
import factory.ArcherFactory;
import factory.CharacterFactory;
import factory.MageFactory;
import factory.WarriorFactory;
import mediator.Arena;
import observer.PlayerObserver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створення арени
        Arena arena = new Arena();

        // Додавання спостерігачів
        PlayerObserver observer1 = new PlayerObserver("Player 1");
        arena.addObserver(observer1);

        System.out.println("Choose your character: 1. Warrior  2. Mage  3. Archer");
        int choice = scanner.nextInt();

        // Створення персонажа через фабрику
        CharacterFactory factory;
        switch (choice) {
            case 1: factory = new WarriorFactory(); break;
            case 2: factory = new MageFactory(); break;
            case 3: factory = new ArcherFactory(); break;
            default:
                System.out.println("Invalid choice! Defaulting to Warrior.");
                factory = new WarriorFactory();
        }

        Character playerCharacter = factory.createCharacter();
        arena.addCharacter(playerCharacter);

        // Демонстрація руху та атаки
        playerCharacter.move(10, 20);
        playerCharacter.attack(playerCharacter); // Симуляція атаки самого себе
    }
}
