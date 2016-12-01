package fr.studec.codingdojo.domino.tiling;

import fr.studec.codingdojo.domino.grid.Grid;

public enum Direction {
    DOWN(0, 1), RIGHT(1, 0);

    private int deltaX;
    private int deltaY;

    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    int computeAdjacentCell(Grid grid, int cellID) {
        final int x = grid.computeX(cellID);
        final int y = grid.computeY(cellID);
        return grid.cellId(x + deltaX, y + deltaY);
    }
}
