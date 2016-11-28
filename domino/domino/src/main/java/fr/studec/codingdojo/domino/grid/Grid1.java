package fr.studec.codingdojo.domino.grid;

import fr.studec.codingdojo.domino.exceptions.OutOfBoundException;

public class Grid1 implements Grid {

    private final int width;

    private final int height;

    public Grid1(final int width, final int height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int computeArea() {
        return width * height;
    }

    @Override
    public int cellId(final int x, final int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            throw new OutOfBoundException();
        }
        return x + y * width;
    }

    @Override
    public int computeX(final int cellId) {
        return cellId - width * computeY(cellId);
    }

    @Override
    public int computeY(final int cellId) {
        return cellId / width;
    }

    @Override
    public boolean contains(final int cellId) {
        return 0 <= cellId && cellId < width * height;
    }

    @Override
    public String toString() {
        String result = "";

        for (int y = height - 1; y >= 0; y--) {
            for (int x = 0; x < width; x++) {
                result += String.format("%5d", cellId(x, y));
            }
            result += "\n";
        }
        return result;

    }

}
