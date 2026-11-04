package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println();
        Scanner input = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source ");
                ChessPosition source = UI.readChessPosition(input);
                System.out.println();
                System.out.print("Destination ");
                ChessPosition destination = UI.readChessPosition(input);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, destination);
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }

        }

    }

}
