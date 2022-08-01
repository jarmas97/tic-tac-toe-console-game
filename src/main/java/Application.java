import java.util.Scanner;

public class Application {

    private static final GameManager gameManager = new GameManager();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        gameManager.start();

        while (!(gameManager.isGameOver())) {

            System.out.print("PLAYER 'X' Pick a field (1-9): ");
            String inputX = scanner.nextLine();
            gameManager.applyMovement(inputX, Players.X);
            if (gameManager.isGameOver()) {
                break;
            }

            System.out.print("PLAYER 'O' Pick a field (1-9): ");
            String inputO = scanner.nextLine();
            gameManager.applyMovement(inputO, Players.O);

        }
        gameManager.showWinner();
    }
}
