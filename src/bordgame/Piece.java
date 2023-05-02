package bordgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    /* OBS. Passando somente o tabuleiro na hora de criar a peça, pois a posiçāo de uma peça recem criada será
    inicialmente nula, dizendo que a peça nāo foi colocada no tabuleiro ainda.
     */

    public Piece(Board board) {
        this.board = board;
        position = null; // Nāo precisa colocar nada aqui. O java já coloca o valor como nulo
    }

    //Colocar somente o get, para nāo permitir que o tabuleiro seja alterado
    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnypossibleMove(){
        boolean[][] mat = possibleMoves();
        for (int i=0; i< mat.length; i++){
            for (int j=0; j<mat.length; j++){
                if (mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
