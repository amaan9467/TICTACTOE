import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Initialize board with empty spaces
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';  // FIXED: 'chat' → 'char'
        boolean gameOver = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " enter row and column (0, 1, or 2): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Check valid move
            if (row < 0 || col < 0 || row > 2 || col > 2) {
                System.out.println("Out of bounds! Try again.");
                continue;
            }

            if (board[row][col] == ' ') {
                board[row][col] = player;

                gameOver = haveWon(board, player);

                if (gameOver) {
                    printBoard(board);
                    System.out.println("Player " + player + " has won!");
                } else {
                    // Switch player
                    player = (player == 'X') ? 'O' : 'X';
                }

            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }

    // Check if player has won
    public static boolean haveWon(char[][] board, char player) {

        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    // Print the board
    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
