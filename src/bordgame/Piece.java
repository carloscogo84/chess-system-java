package bordgame;

public class Piece {
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
}
