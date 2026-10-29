package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece [][] getPieces(){
        ChessPiece [][] pieces = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                    pieces[i][j] = (ChessPiece) board.piece(i, j);
                }
            }
            return  pieces;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(new ChessPosition(row, column).toPosition(), piece);
    }
    private void initialSetup(){
        placeNewPiece( 'b', 6 ,new Rook(board,Color.WHITE));
        placeNewPiece('e',8,new King(board,Color.BLACK));
        placeNewPiece('e',1,new King(board,Color.WHITE));
    }
}
