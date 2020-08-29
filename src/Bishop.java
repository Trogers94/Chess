package chess;
import java.util.List;
import java.util.ArrayList;

public class Bishop extends Piece {

    private final int SIZE = 8;
    private final boolean colour;
    private final String name = "B";

    public Bishop(boolean colour) {
        this.colour = colour;

    }
    
    public boolean getColour(){
    return this.colour;
    }

    public String getName() {
        return this.name;
    }
    
    public List<Position> possiblemoves(Piece board[][], Position startpos) {
        List<Position> posmoves = new ArrayList<>();
        
        //checks forward moves
        for (int i = 1; i < SIZE; i++) {
            if(startpos.getY() + i < SIZE && startpos.getX() + i < SIZE){
            if (board[startpos.getY()+ i][startpos.getX() + i] == null ) {
                Position vimove = new Position(startpos.getY() + i, startpos.getX() + i);
                posmoves.add(vimove);
            } else if (board[startpos.getY() + i ][startpos.getX() + i].getColour() != board[startpos.getY()][startpos.getX()].getColour()) {
                Position vimove = new Position(startpos.getY() + i, startpos.getX() + i);
                posmoves.add(vimove);
                break;
            } else {
                break;
            }
            }
        }
        
        // checks backwords moves
        for (int i = 1; i < SIZE; i++) {
            if(startpos.getY() - i >= 0 && startpos.getX() - i>= 0){
            if (board[startpos.getY() - i][startpos.getX() - i] == null ) {
                Position vimove = new Position(startpos.getY() - i, startpos.getX() - i);
                posmoves.add(vimove);
            } else if (board[startpos.getY() - i ][startpos.getX() - i].getColour() != board[startpos.getY()][startpos.getX()].getColour()) {
                Position vimove = new Position(startpos.getY() - i, startpos.getX() - i);
                posmoves.add(vimove);
                break;
            } else {
                break;
            }
            }
        }
       
        for (int i = 1; i < SIZE - 1; i++) {
            if(startpos.getY() + i < SIZE && startpos.getX()- i >= 0){
            if (board[startpos.getY()+ i][startpos.getX() - i] == null ) {
                Position vimove = new Position(startpos.getY() + i, startpos.getX() - i);
                posmoves.add(vimove);
            } else if (board[startpos.getY() + i ][startpos.getX() - i].getColour() != board[startpos.getY()][startpos.getX()].getColour()) {
                Position vimove = new Position(startpos.getY() + i, startpos.getX() - i);
                posmoves.add(vimove);
                break;
            } else {
                break;
            }
            }
        }      
        for (int i = 1; i < SIZE - 1; i++) {
            if(startpos.getY() - i >= 0 && startpos.getX() + i < SIZE ){
            if (board[startpos.getY() - i][startpos.getX() + i] == null ) {
                Position vimove = new Position(startpos.getY() - i, startpos.getX() + i);
                posmoves.add(vimove);
            } else if (board[startpos.getY() - i ][startpos.getX() + i].getColour() != board[startpos.getY()][startpos.getX()].getColour()) {
                Position vimove = new Position(startpos.getY() - i, startpos.getX() + i);
                posmoves.add(vimove);
                break;
            } else {
                break;
            }
            }
        }
        return posmoves;
    }
    
}
