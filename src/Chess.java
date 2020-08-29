package chess;

import java.util.Scanner;

public class Chess {

    public static void main(String[] args) {

        //generates new chessboard
        chessBoard Board = new chessBoard();
        
        Board.printBoard();
        while(true){
        Scanner scan = new Scanner(System.in); 
        System.out.print("Piece:");
        String s = scan.next();
        System.out.print("To");
        String t = scan.next();
        
       char s1 = s.charAt(0);
       char s2 = s.charAt(1);
       char t1 = t.charAt(0);
       char t2 = t.charAt(1);
       
       Position from = new Position(s1 - '0', s2 - '0');
       Position to = new Position(t1 - '0', t2 - '0');
       
       boolean col = Board.getPiece(7,3).getColour();
       System.out.println(col);
       Board.Move(from,to);
       Board.printBoard();
    }
    }

}
