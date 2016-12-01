package fr.studec.codingdojo.domino.tiling;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import fr.studec.codingdojo.domino.grid.Grid1;

public class TilingShould {

    @Test
    public void getDominoFromACell() {
        // given
        final Tiling tiling = new Tiling1(new Grid1(6, 6));
        final int cellID = 2;

        // when
        tiling.putDomino(cellID, Direction.RIGHT);

        // then
        final Domino domino = tiling.getDomino(cellID);
        assertThat(domino).isNotNull();
        assertThat(domino.getCells()).contains(cellID);
        assertThat(domino.getCells())
                .contains(Direction.RIGHT.computeAdjacentCell(tiling, cellID));
    }

    @Test
    public void putDomino() {
        // given
        final Tiling tiling = new Tiling1(new Grid1(6, 6));
        final int cellID = 0;

        //when

        //then
        tiling.putDomino(cellID, Direction.RIGHT);
    }
}
