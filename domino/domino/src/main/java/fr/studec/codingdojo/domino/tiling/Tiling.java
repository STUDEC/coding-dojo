package fr.studec.codingdojo.domino.tiling;

import fr.studec.codingdojo.domino.grid.Grid;

public interface Tiling extends Grid {

    void putDomino(int cellID, Direction right);

    Domino getDomino(int cellID);

}
