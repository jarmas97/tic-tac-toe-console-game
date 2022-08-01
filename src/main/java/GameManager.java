public class GameManager {

    private Grid grid = new Grid();
    private boolean gameOver = false;
    private Player winner = Player.NONE;

    public void applyMovement(String field, Player player) {

        if (!(field.matches("[1-9]"))) {
            System.out.println("Wrong number!");
        } else {
            int index = Integer.parseInt(field);
            if (player.equals(Player.X)) {
                grid.setField(index, "X");
            } else if (player.equals(Player.O)) {
                grid.setField(index, "O");
            }
            loadGrid();
            checkWinner(player);
        }
    }

    private void checkWinner(Player currentPlayer) {

        if (compareFields(1, 2, 3)) { winner = currentPlayer; gameOver = true; }
        else if (compareFields(4, 5, 6)) { winner = currentPlayer; gameOver = true; }
        else if (compareFields(7, 8, 9)) { winner = currentPlayer; gameOver = true; }
        else if (compareFields(1, 4, 7)) { winner = currentPlayer; gameOver = true; }
        else if (compareFields(2, 5, 8)) { winner = currentPlayer; gameOver = true; }
        else if (compareFields(3, 6, 9)) { winner = currentPlayer; gameOver = true; }
        else if (compareFields(1, 5, 9)) { winner = currentPlayer; gameOver = true; }
        else if (compareFields(3, 5, 7)) { winner = currentPlayer; gameOver = true; }
        else if (fullGrid())             { winner = Player.NONE;   gameOver = true; }

    }

    private boolean fullGrid() {
        boolean result = true;
        for (int i = 1; i <= 9; i++) {
            if (grid.getField(i).contains(" ")) {
                result = false;
                break;
            }
        }
        return result;
    }

    private boolean compareFields(int index1, int index2, int index3) {
        return grid.getField(index1).equals(grid.getField(index2))
                && grid.getField(index1).equals(grid.getField(index3))
                && (!grid.getField(index1).contains(" "));
    }

    public boolean isGameOver() {
        return this.gameOver;
    }

    public void start() {
        loadGrid();
    }

    public void showWinner() {
        if (winner == Player.NONE) {
            System.out.println("It's a Draw!");
        } else if (winner == Player.X) {
            System.out.println("The winner is Player X! ");
        } else if (winner == Player.O) {
            System.out.println("The winner is Player O! ");
        }
    }

    private void loadGrid() {
        System.out.println("-----------------------------------");
        System.out.println("|            TIC TAC TOE          |");
        System.out.println("|---------------------------------|");
        System.out.println("|                                 |");
        System.out.println("|     1      |2      |3           |");
        System.out.println("|        " + grid.getField(1) + "   |   " + grid.getField(2) + "   |   " + grid.getField(3) + "        |");
        System.out.println("|            |       |            |");
        System.out.println("|     -------|-------|-------     |");
        System.out.println("|     4      |5      |6           |");
        System.out.println("|        " + grid.getField(4) + "   |   " + grid.getField(5) + "   |   " + grid.getField(6) + "        |");
        System.out.println("|            |       |            |");
        System.out.println("|     -------|-------|-------     |");
        System.out.println("|     7      |8      |9           |");
        System.out.println("|        " + grid.getField(7) + "   |   " + grid.getField(8) + "   |   " + grid.getField(9) + "        |");
        System.out.println("|            |       |            |");
        System.out.println("|                                 |");
        System.out.println("|---------------------------------|");
    }
}
