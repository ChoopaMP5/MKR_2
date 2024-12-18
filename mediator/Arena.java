package mediator;

import characters.Character;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Observer> observers = new ArrayList<>();
    private List<Character> characters = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    private void notifyObservers(Character character) {
        for (Observer observer : observers) {
            observer.update(character.getName() + " has joined the arena!");
        }
    }
}
