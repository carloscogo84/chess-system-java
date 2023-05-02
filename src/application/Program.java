package application;

import bordgame.Board;
import bordgame.Position;
import chess.ChessException;
import chess.ChessMacth;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMacth chessMacth = new ChessMacth();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMacth.getPices());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChesPosition(sc);

                boolean[][] possibleMoves = chessMacth.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMacth.getPices(), possibleMoves);

                System.out.print("Target: ");
                ChessPosition target = UI.readChesPosition(sc);

                ChessPiece capturedPiece = chessMacth.performChessMove(source, target);
            }
            catch (ChessException | InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

    }
}
