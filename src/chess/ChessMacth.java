package chess;

import bordgame.Board;
import bordgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMacth {
    private Board board;

    public ChessMacth(){
        board = new Board(8, 8);
        initialSetup();
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

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePieces(piece, new ChessPosition(column,row).toPosition());
    }
    private void initialSetup(){
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.WHITE));
    }
}
