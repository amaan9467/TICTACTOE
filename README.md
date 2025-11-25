🕹️ Tic Tac Toe – Java Console Game

A simple Java-based Tic-Tac-Toe game playable in the console.
This project is perfect for beginners learning Java, arrays, methods, loops, and game logic.

📌 Features

3×3 Tic-Tac-Toe board

Two-player mode (X vs O)

Input validation (row/column checks)

Win detection for:

Rows

Columns

Diagonals

Realtime board display

Clean and readable code

📂 Project Structure
/TicTacToe
│── Main.java
│── README.md

🚀 How to Run
1. Compile the code
javac Main.java

2. Run the game
java Main

🎮 How to Play

The board is represented by a 3×3 grid.

Player X starts first.

Enter row and column values (0, 1, or 2).

If the spot is empty, your symbol is placed.

The game checks after every move:

Win

Invalid move

Switch player

The game ends when a player wins.

🧠 Logic Used

2D character array for the board

Loops for printing and checking

Condition checks for:

Rows

Columns

Diagonals

Win check logic:

If any row/col/diagonal contains same symbol → Player wins

🛠️ Technologies Used

Java

VS Code / IntelliJ / Any Java IDE

Command-Line Execution

📘 Example Output
-------------
| X | O | X |
-------------
|   | O |   |
-------------
| X |   | O |
-------------
Player O has won!

📄 License

This project is free to use and modify.
No license restrictions.
