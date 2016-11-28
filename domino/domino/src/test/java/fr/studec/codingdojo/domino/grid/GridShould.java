package fr.studec.codingdojo.domino.grid;

import org.assertj.core.api.Assertions;
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
        Assertions.assertThat(grid.getHeight()).isEqualTo(H);
        Assertions.assertThat(grid.getWidth()).isEqualTo(W);
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
                Assertions.assertThat(grid.computeX(cellId)).isEqualTo(x);
                Assertions.assertThat(grid.computeY(cellId)).isEqualTo(y);
            }
        }
    }

    @Test(expected = OutOfBoundException.class)
    public void throwExceptionWhenConvertingOutOfBoundCellCoordinatesToUniqueID() {
        // given
        final Grid grid = new Grid1(20, 20);

        // when
        grid.cellId(grid.getWidth(), grid.getHeight());

        Assertions.shouldHaveThrown(OutOfBoundException.class);
    }

    @Test
    public void containsBorderCells() {
        // given
        final int w = 12;
        final int h = 14;

        // when
        final Grid grid = new Grid1(w, h);

        // then

        Assertions.assertThat(grid.contains(0)).isTrue();
        Assertions.assertThat(grid.contains(w * h - 1)).isTrue();
    }

    @Test
    public void doesNotContainsOutsideCells() {
        // given
        final int w = 12;
        final int h = 14;

        // when
        final Grid grid = new Grid1(w, h);

        // then

        Assertions.assertThat(grid.contains(-1)).isFalse();
        Assertions.assertThat(grid.contains(w * h)).isFalse();
        Assertions.assertThat(grid.contains(w * h + 1)).isFalse();
    }

    @Test
    public void computeAreaFromWidthAndHeight() {
        // given
        final int h = 12;
        final int w = 15;

        // when
        final Grid grid = new Grid1(w, h);

        // then
        Assertions.assertThat(grid.computeArea()).isEqualTo(w * h);

    }

}
