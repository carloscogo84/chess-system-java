package application;

import bordgame.Board;
import bordgame.Position;
import chess.ChessMacth;

public class Program {
    public static void main(String[] args) {

        ChessMacth chessMacth = new ChessMacth();
        UI.printBoard(chessMacth.getPices());

    }
}
