package chess;

import bordgame.Board;
import bordgame.Piece;

public class ChessPiece extends Piece { // Sub classe de Piece, necessita do construtor
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
