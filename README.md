# Chess Game in Java

A console chess game written in Java, organised in layers that separate the generic board logic from the chess rules.

> **Note:** the source code lives on the `master` branch of this repository.

## Features
- Full 8x8 board with all six piece types: King, Queen, Rook, Bishop, Knight and Pawn
- Turn-based play with alternating players (White / Black)
- Highlighting of the possible moves for a selected piece
- Check and checkmate detection; moves that leave your own king in check are rejected
- Special moves: **castling** (king side and queen side), **en passant** and **pawn promotion**
- Captured pieces tracking and clear error handling for invalid moves

## Architecture
```
application   Program (game loop) and UI (console rendering and input)
boardgame     Board, Piece, Position, BoardException  – generic board game layer
chess         ChessMatch, ChessPiece, ChessPosition, Color, ChessException
chess.pieces  King, Queen, Rook, Bishop, Knight, Pawn
```

## Requirements
- JDK 21+
- Maven

## Running
```bash
mvn compile
mvn exec:java -Dexec.mainClass=application.Program
```
Or open the project in IntelliJ IDEA and run `application.Program`.

Moves are typed using standard chess coordinates, for example `e2` followed by `e4`.
