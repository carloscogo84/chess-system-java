package application;

import bordgame.Board;
import bordgame.Position;
import chess.ChessMacth;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMacth chessMacth = new ChessMacth();
        while (true) {
            UI.printBoard(chessMacth.getPices());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChesPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChesPosition(sc);

            ChessPiece capturedPiece = chessMacth.performChessMove(source, target);
        }

    }
}
