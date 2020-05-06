package chess;

import java.util.List;
import java.util.ArrayList;

public class Pawn extends Piece {

    private final int SIZE = 8;
    private final boolean colour;
    private final String name = "p";

    public Pawn(boolean colour) {
        this.colour = colour;

    }

    public String getName() {
        return this.name;
    }

    public boolean getcolour() {
        return this.colour;
    }

    public List<Position> possiblemoves(Piece board[][], Position startpos) {
        List<Position> posmoves = new ArrayList<>();

        if (board[startpos.getY() + 1][startpos.getX()] == null) {
            Position vimove = new Position(startpos.getY() + 1, startpos.getX());
            posmoves.add(vimove);
        }
        if (board[startpos.getY()+1][startpos.getX()+1] != null && board[startpos.getY() + 1][startpos.getX()+1].getColour() != board[startpos.getY()][startpos.getX()].getColour() ) {
            Position vimove = new Position(startpos.getY() + 1, startpos.getX());
            posmoves.add(vimove);
        }


        return posmoves;
    }

}
