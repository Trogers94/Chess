package chess;

import java.util.ArrayList;
import java.util.List;

public class chessBoard {

    //Booleans to give colour
    private final static boolean WHITE = true;
    private final static boolean BLACK = false;

    //Board parameter
    private final int SIZE = 8;

    //initial board setup
/*   private final Piece[][] board = {
        {new Rook(BLACK), new Knight(BLACK), new Bishop(BLACK), new Queen(BLACK), new King(BLACK), new Bishop(BLACK), new Knight(BLACK), new Rook(BLACK)},
        {new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK)},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(BLACK)},
        {new Rook(WHITE), new Knight(WHITE), new Bishop(WHITE), new Queen(WHITE), new King(WHITE), new Bishop(WHITE), new Knight(WHITE), new Rook(WHITE)}
    }; */
    
       private final Piece[][] board = {
        {new Queen(WHITE), null, null, null, null, null, null, new Rook(BLACK)},
        {null, null, null, null, null , null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, new Bishop(WHITE), null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, new King(WHITE), null, null, null, null},
    }; 

    // initial setup of board.
    //To be used to return name, maybe other uses   
    public Piece getPiece(int i, int j) {
        return this.board[i][j];
    }
   
    //Prints board in console
    //Doesn't print correctly, needs to convert to string (getName, getPiece)
    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == null) {
                    System.out.print(" |");
                } else {
                    System.out.print(board[i][j].getName() + "|");
                }

            }
            System.out.println();
            
        }
    }

    //moves piece from one position to another postion.
    //any piece can move anywhere, needs to check if move is in posmoves
    public void Move(Position fromPos, Position toPos) {
        Piece frompiece = board[fromPos.getY()][fromPos.getX()];
        Piece topiece = board[toPos.getY()][toPos.getX()];

        List<Position> posmoves = new ArrayList<>();
        posmoves = frompiece.possiblemoves(board, fromPos);

        if (posmoves.contains(toPos)) {
            Piece pieceStart = board[fromPos.getY()][fromPos.getX()];
            Piece pieceEnd = board[toPos.getY()][toPos.getX()];

            board[toPos.getY()][toPos.getX()] = pieceStart;
            board[fromPos.getY()][fromPos.getX()] = null;
        } else {
            System.out.println("Invalid Move!");
        }

    }

}
