package fr.studec.codingdojo.domino.grid;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.shouldHaveThrown;

import org.junit.Test;

import fr.studec.codingdojo.domino.exceptions.OutOfBoundException;

public class GridShould {

    @Test
    public void haveWidthAndHeight() {
        // given
        final int W = 12;
        final int H = 32;
        final Grid grid = new Grid1(W, H);

        // then
        assertThat(grid.getHeight()).isEqualTo(H);
        assertThat(grid.getWidth()).isEqualTo(W);
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
                assertThat(grid.computeX(cellId)).isEqualTo(x);
                assertThat(grid.computeY(cellId)).isEqualTo(y);
            }
        }
    }

    @Test(expected = OutOfBoundException.class)
    public void throwExceptionWhenConvertingOutOfBoundCellCoordinatesToUniqueID() {
        // given
        final Grid grid = new Grid1(20, 20);

        // when
        grid.cellId(grid.getWidth(), grid.getHeight());

        shouldHaveThrown(OutOfBoundException.class);
    }

    @Test
    public void containsBorderCells() {
        // given
        final int w = 12;
        final int h = 14;

        // when
        final Grid grid = new Grid1(w, h);

        // then

        assertThat(grid.contains(0)).isTrue();
        assertThat(grid.contains(w * h - 1)).isTrue();
    }

    @Test
    public void notContainsOutsideCells() {
        // given
        final int w = 12;
        final int h = 14;

        // when
        final Grid grid = new Grid1(w, h);

        // then

        assertThat(grid.contains(-1)).isFalse();
        assertThat(grid.contains(w * h)).isFalse();
        assertThat(grid.contains(w * h + 1)).isFalse();
    }

    @Test
    public void computeAreaFromWidthAndHeight() {
        // given
        final int h = 12;
        final int w = 15;

        // when
        final Grid grid = new Grid1(w, h);

        // then
        assertThat(grid.computeArea()).isEqualTo(w * h);
    }

}
