package observer;

public class PlayerObserver implements Observer {
    private String playerName;

    public PlayerObserver(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void update(String message) {
        System.out.println(playerName + " received notification: " + message);
    }
}
