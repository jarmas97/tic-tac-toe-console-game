public class GameManager {

    private Grid grid = new Grid();
    private boolean gameOver = false;
    private Players winner = Players.NONE;


    public void applyMovement(String field, Players players) {
        //todo implement
    }

    private void checkWinner(Players currentPlayers) {
        //todo implement
    }

    private boolean fullGrid() {
        return false;
        //todo implement
    }

    private boolean compareFields(int index1, int index2, int index3) {
        return false;
        //todo implement
    }

    public boolean isGameOver() {
        return this.gameOver;
    }

    public void start() {
        //todo implement
    }

    public void showWinner() {
        //todo implement
    }

    private void loadGrid() {
        //todo implement
    }
}
