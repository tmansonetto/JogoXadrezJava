package boardgame;

public class Board {

    private Integer rows;
    private Integer columns;
    private Piece[][] pieces;

    public Board(Integer rows, Integer columns) {
        if (rows <1 || columns <1) {
            throw new BoardException("Rows and columns must be greater than 1");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Integer getColumns() {
        return columns;
    }

    public Integer getRows() {
        return rows;
    }


    public Piece piece (int row, int col) {
        if (!positionExists(row, col)) {
            throw new BoardException("Position does not exist");
        }
        return pieces[row][col];
    }
    public Piece piece (Position pos) {
        if (!positionExists(pos)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[pos.getRow()][pos.getColumn()];
}
public void placePiece (Position pos, Piece piece) {
        if (thereIsAPiece(pos)){
            throw new BoardException("Piece already exists" + pos);
        }
        pieces[pos.getRow()][pos.getColumn()] = piece;
        piece.position = pos;
}
private boolean positionExists (int row, int col) {
     return  row >=0 && row < rows && col>=0 && col < columns;
}
public boolean positionExists (Position pos) {
    return positionExists(pos.getRow(), pos.getColumn());
}
public boolean thereIsAPiece (Position pos) {
        if (!positionExists(pos)) {
            throw new BoardException("Position not on the board");
        }
    return piece (pos)!=null;
}
}
