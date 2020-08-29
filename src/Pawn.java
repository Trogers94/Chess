import java.util.List;
import java.util.ArrayList;

public class Pawn extends Piece {

    private final int SIZE = 8;
    private boolean colour;
    private String name;
    private final int wvalue = 1;
    private final int bvalue = -1;
    public double value[][] = { { 0, 0, 0, 0, 0, 0, 0, 0 },
    		{ 0, 0, 0, -0.6, -0.6, 0, 0, 0 }, {0, 0.75, 0, 0.5, 0.5, 0, 0.75, 0},
			{ 0, 0, 0, 1, 1, 0,0, 0}, {0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0.0, 0.0, 0, 0, 0 } };
    
	
    public double getAdjuster(int a, int b) {
    	if(this.getColour() == true) {
    		return 0;
    	}else {
    		return value[a][b];
    	}
    }
    
    public int getValue() {
    	if(this.getColour() == true) {
    		return wvalue;
    	}else {
    		return bvalue;
    	}
    }

    public Pawn(boolean colour) {
        this.colour = colour;
        if(colour == true) {
        	 name = "P";
        } else {
        	 name = "p";
        }
    }

    public String getName() {
    	return this.name;
    }

    public boolean getColour() {
        return this.colour;
    }

    public List<Position> possiblemoves(Piece aboard[][], Position startpos) {
        List<Position> posmoves = new ArrayList<>();

        if (aboard[startpos.getY()][startpos.getX()].getColour() == false && aboard[startpos.getY() + 1][startpos.getX()] == null) {
            Position vimove = new Position(startpos.getY() + 1, startpos.getX());
            posmoves.add(vimove);
        }
        //captures
        if (aboard[startpos.getY()][startpos.getX()].getColour() == false && startpos.getX() <7 && aboard[startpos.getY() + 1][startpos.getX()+1] != null &&  aboard[startpos.getY() + 1][startpos.getX()+1].getColour() == true) {
            Position vimove = new Position(startpos.getY() + 1, startpos.getX()+1);
            posmoves.add(vimove);
        }
        if (aboard[startpos.getY()][startpos.getX()].getColour() == false && startpos.getX() >0 && aboard[startpos.getY() + 1][startpos.getX()-1] != null && aboard[startpos.getY() + 1][startpos.getX()-1].getColour() == true) {
            Position vimove = new Position(startpos.getY() + 1, startpos.getX()-1);
            posmoves.add(vimove);
        }
        //move 2 spots
        if (aboard[startpos.getY()][startpos.getX()].getColour() == false && aboard[startpos.getY() + 2][startpos.getX()] == null) {
            Position vimove = new Position(startpos.getY() + 2, startpos.getX());
            posmoves.add(vimove);
        }
        
        if (aboard[startpos.getY()][startpos.getX()].getColour() == true && aboard[startpos.getY() - 1][startpos.getX()] == null) {
            Position vimove = new Position(startpos.getY() - 1, startpos.getX());
            posmoves.add(vimove);
        }

        //captures
        if (aboard[startpos.getY()][startpos.getX()].getColour() == true && startpos.getX() <7 && aboard[startpos.getY() - 1][startpos.getX()+1] != null &&  aboard[startpos.getY() - 1][startpos.getX()+1].getColour() == false) {
            Position vimove = new Position(startpos.getY() - 1, startpos.getX()+1);
            posmoves.add(vimove);
        }
        if (aboard[startpos.getY()][startpos.getX()].getColour() == true && startpos.getX() >0 && aboard[startpos.getY() - 1][startpos.getX()-1] != null &&  aboard[startpos.getY() - 1][startpos.getX()-1].getColour() == false) {
            Position vimove = new Position(startpos.getY() - 1, startpos.getX()-1);
            posmoves.add(vimove);
        }
        //2spots
        if (aboard[startpos.getY()][startpos.getX()].getColour() == true && aboard[startpos.getY() - 2][startpos.getX()] == null) {
            Position vimove = new Position(startpos.getY() - 2, startpos.getX());
            posmoves.add(vimove);
        }

        return posmoves;
    }

}
