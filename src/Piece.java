package chess;
// Piece class to extend to all pieces

import java.util.ArrayList;
import java.util.List;

public class Piece {

    private final String name = "Piece";
    boolean colour;
                                                                                                                                                                                                                                                                                                                                      
    public String getName() {
        return this.name;
    }
    
    public boolean getColour(){
        return this.colour;
    }
    
        public List<Position> possiblemoves(Piece board[][], Position startpos) {
        List<Position> posmoves = new ArrayList<>();
        return posmoves;
    }
}
