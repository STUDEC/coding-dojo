package fr.studec.codingdojo.domino;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestGrid {

    @Test
    public void checkCaseIsEmpty() {
        // given
        final int height = 6;
        final int width = 42;
        final int x = 2;
        final int y = 2;

        // when
        final Grid grid = new Grid(width, height);

        // then
        assertThat(grid.isFilled(x, y)).isFalse();
    }

    @Test
    public void checkGridSize() {
        // given
        final int height = 6;
        final int width = 42;

        // when
        final Grid grid = new Grid(width, height);

        // then
        assertThat(grid.getHeight()).isEqualTo(height);
        assertThat(grid.getWidth()).isEqualTo(width);
    }

}
