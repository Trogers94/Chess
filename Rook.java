package chess;

import java.util.List;
import java.util.ArrayList;

public class Rook extends Piece {

    private final int SIZE = 8;
    private final boolean colour;
    private final String name = "R";

    public Rook(boolean colour) {
        this.colour = colour;
    }

    public boolean getColour(){
        return this.colour;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public List<Position> possiblemoves(Piece board[][], Position startpos) {
        List<Position> posmoves = new ArrayList<>();
        
        //checks forward moves
        for (int i = startpos.getY(); i < SIZE-1; i++) {
            if (board[i + 1][startpos.getX()] == null) {
                Position vimove = new Position(i + 1, startpos.getX());
                posmoves.add(vimove);
            } else if (board[i + 1][startpos.getX()].getColour() != board[startpos.getY()][startpos.getX()].getColour()) {
                Position vimove = new Position(i + 1, startpos.getX());
                posmoves.add(vimove);
                break;
            } else {
                break;
            }
        }
        
        // checks backwords moves
        
        for (int i = startpos.getY(); i > 0 ; i--) {
            if (board[i - 1][startpos.getX()] == null) {
                Position vimove = new Position(i - 1, startpos.getX());
                posmoves.add(vimove);
            } else if (board[i - 1][startpos.getX()].getColour() != board[startpos.getY()][startpos.getX()].getColour()) {
                Position vimove = new Position(i - 1, startpos.getX());
                posmoves.add(vimove);
                break;
            } else {
                break;
            }
        }

        for (int j = startpos.getX(); j < SIZE-1; j++) {
            if (board[startpos.getY()][j + 1] == null) {
                Position vimove = new Position(startpos.getY(),j+1);
                posmoves.add(vimove);
            } else if (board[startpos.getY()][j+1].getColour() != board[startpos.getY()][startpos.getX()].getColour()) {
                Position vimove = new Position(startpos.getY(),j+1);
                posmoves.add(vimove);
                break;
            } else {
                break;
            }
        }
        
        for (int j = startpos.getX(); j > 0; j--) {
            if (board[startpos.getY()][j - 1] == null) {
                Position vimove = new Position(startpos.getY(),j - 1);
                posmoves.add(vimove);
            } else if (board[startpos.getY()][j - 1].getColour() != board[startpos.getY()][startpos.getX()].getColour()) {
                Position vimove = new Position(startpos.getY(),j - 1);
                posmoves.add(vimove);
                break;
            } else {
                break;
            }
        }
        return posmoves;
    }

}
