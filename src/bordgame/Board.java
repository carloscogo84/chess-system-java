package bordgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }


    /* public retornando um objeto do tipo piece e o nome do meto é piece. Recebendo um int linha e coluna.
    Esse metodo retorna a matriz pieces, linha e coluna
     */
    public Piece piece(int rows, int columns){
        return pieces[rows][columns];
    }
    // Sobrecarga do metodo retornando a peça pela posicao
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
    public void placePieces(Piece piece, Position position){
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }


}
