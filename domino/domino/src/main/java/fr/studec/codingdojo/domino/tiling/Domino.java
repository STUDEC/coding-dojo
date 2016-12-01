package fr.studec.codingdojo.domino.tiling;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Domino {

    public Set<Integer> cells;

    public Domino(int cell1, int cell2) {
        super();
        this.cells = new HashSet<>(Arrays.asList(cell1, cell2));
    }

    public Set<Integer> getCells() {

        return cells;
    }
}
