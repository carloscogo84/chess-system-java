package chess;

import bordgame.Board;

public class ChessMacth {
    private Board board;

    public ChessMacth(){
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPices(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i< board.getRows(); i++){
            for(int j=0; j< board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j); // Downcasting para interpretar como uma peça de xadrez
            }
        }
        return mat;
    }
}
