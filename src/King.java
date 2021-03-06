package chess;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

    private final boolean colour;
    private final String name = "K";

    public King(boolean colour) {
        this.colour = colour;
    }

    public String getName() {
        return this.name;
    }
    
    public boolean getColour(){
        return this.colour;
    }

        public List<Position> possiblemoves(Piece board[][], Position startpos) {
        List<Position> posmoves = new ArrayList<>();
        
            if (startpos.getY() + 1 <8 && board[startpos.getY() + 1][startpos.getX()] == null) {
                Position vimove = new Position(startpos.getY() + 1, startpos.getX());
                posmoves.add(vimove);
            }
            if (startpos.getY() + 1 <8 && startpos.getY() + 1 <8 && board[startpos.getY() + 1][startpos.getX()+1] == null) {
                Position vimove = new Position(startpos.getY() + 1, startpos.getX()+1);
                posmoves.add(vimove);
            }            
            if (startpos.getX() + 1 <8 && board[startpos.getY()][startpos.getX()+1] == null) {
                Position vimove = new Position(startpos.getY(), startpos.getX()+1);
                posmoves.add(vimove);
            }
            if (startpos.getX() + 1 <8 && startpos.getY() - 1 >=0 &&board[startpos.getY() - 1][startpos.getX()+1] == null) {
                Position vimove = new Position(startpos.getY() - 1, startpos.getX());
                posmoves.add(vimove);
            }            
            if (startpos.getY() - 1 >=0 && board[startpos.getY() - 1][startpos.getX()] == null) {
                Position vimove = new Position(startpos.getY() - 1, startpos.getX());
                posmoves.add(vimove);
            }            
            if (startpos.getY() - 1 >=0 && startpos.getX() - 1 >=0 && board[startpos.getY() - 1][startpos.getX() -1] == null) {
                Position vimove = new Position(startpos.getY() - 1, startpos.getX()-1);
                posmoves.add(vimove);
            }            
            if (startpos.getX() - 1 >=0 && board[startpos.getY()][startpos.getX()-1] == null) {
                Position vimove = new Position(startpos.getY(), startpos.getX()-1);
                posmoves.add(vimove);
            }            
            if (startpos.getY() + 1 <8 && startpos.getX() - 1 >=0 && board[startpos.getY() + 1][startpos.getX()-1] == null) {
                Position vimove = new Position(startpos.getY() + 1, startpos.getX()-1);
                posmoves.add(vimove);
            }
        return posmoves;
    }

    
}
