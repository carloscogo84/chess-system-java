package application;

import bordgame.Board;
import bordgame.Position;
import chess.ChessException;
import chess.ChessMacth;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMacth chessMacth = new ChessMacth();
        List<ChessPiece> captured = new ArrayList<>();

        while (!chessMacth.getCheckMate()) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMacth, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChesPosition(sc);

                boolean[][] possibleMoves = chessMacth.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMacth.getPices(), possibleMoves);

                System.out.print("Target: ");
                ChessPosition target = UI.readChesPosition(sc);

                ChessPiece capturedPiece = chessMacth.performChessMove(source, target);
                if (capturedPiece != null){
                    captured.add(capturedPiece);
                }

                if(chessMacth.getPromoted() != null){
                    System.out.print("Enter piece for promotion (B/N/R/Q): ");
                    String type = sc.nextLine().toUpperCase();
                    while (!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")){
                        System.out.print("Invalid value! Enter piece for promotion (B/N/R/Q): ");
                        type = sc.nextLine().toUpperCase();
                    }
                    chessMacth.replacePromotedPiece(type);
                }
            }
            catch (ChessException | InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        UI.clearScreen();
        UI.printMatch(chessMacth, captured);

    }
}
