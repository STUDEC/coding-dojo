package fr.studec.codingdojo.domino.grid;

import org.junit.Assert;
import org.junit.Test;

public class GridShould {

    @Test
    public void haveWidthAndHeight() {
        // given
        final int W = 12;
        final int H = 32;
        final Grid grid = new Grid1(W, H);

        // then
        Assert.assertEquals(H, grid.getHeight());
        Assert.assertEquals(W, grid.getWidth());
    }

    @Test
    public void convertCellCoordinatesToUniqueID() {
        // given
        final Grid grid = new Grid1(20, 20);

        for (int x = 0; x < grid.getWidth(); x++) {
            for (int y = 0; y < grid.getHeight(); y++) {
                // when
                final int cellId = grid.cellId(x, y);

                // then
                Assert.assertEquals(x, grid.computeX(cellId));
                Assert.assertEquals(y, grid.computeY(cellId));
            }
        }
    }

    @Test
    public void containsSomeCells() {
        // given
        final int w = 12;
        final int h = 14;

        // when
        final Grid grid = new Grid1(w, h);

        // then
        Assert.assertFalse(grid.contains(-1));
        Assert.assertTrue(grid.contains(0));
        Assert.assertTrue(grid.contains(w * h - 1));
        Assert.assertFalse(grid.contains(w * h));
        Assert.assertFalse(grid.contains(w * h + 1));
    }

    @Test
    public void computeAreaFromWidthAndHeight() {
        // given
        final int h = 12;
        final int w = 15;

        // when
        final Grid grid = new Grid1(w, h);

        // then
        Assert.assertEquals(h * w, grid.computeArea());

    }

}
