package fr.studec.codingdojo.domino.tiling;

import java.util.HashMap;
import java.util.Map;

import fr.studec.codingdojo.domino.grid.Grid;

public class Tiling1 implements Tiling {

    private final Grid grid;

    private final Map<Integer, Domino> dominos = new HashMap<>();

    public Tiling1(Grid grid) {
        super();
        this.grid = grid;
    }

    @Override
    public int cellId(int x, int y) {
        return grid.cellId(x, y);
    }

    @Override
    public int computeArea() {
        return grid.computeArea();
    }

    @Override
    public int computeX(int cellId) {
        return grid.computeX(cellId);
    }

    @Override
    public int computeY(int cellId) {
        return grid.computeY(cellId);
    }

    @Override
    public boolean contains(int cellId) {
        return grid.contains(cellId);
    }

    @Override
    public Domino getDomino(int cellID) {
        // TODO Auto-generated method stub
        return dominos.get(cellID);
    }

    @Override
    public int getHeight() {
        return grid.getHeight();
    }

    @Override
    public int getWidth() {
        return grid.getWidth();
    }

    @Override
    public void putDomino(int cellID, Direction direction) {
        int adjacentCell = direction.computeAdjacentCell(grid, cellID);
        final Domino domino = new Domino(cellID, adjacentCell);
        dominos.put(cellID, domino);
    }

}
