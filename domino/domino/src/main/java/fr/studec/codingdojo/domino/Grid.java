package fr.studec.codingdojo.domino;

public class Grid {
    private final int width;
    private final int height;
    private boolean filled;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void fill(int x, int y) {
        filled = true;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isFilled(int x, int y) {
        return filled;
    }

}
