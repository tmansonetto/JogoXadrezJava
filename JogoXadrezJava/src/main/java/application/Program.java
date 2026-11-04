package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println();
        Scanner input = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source ");
            ChessPosition source = UI.readChessPosition(input);
            System.out.println();
            System.out.print("Destination ");
            ChessPosition destination = UI.readChessPosition(input);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, destination);

        }
    }
}
