package fr.studec.codingdojo.domino.tiling;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DominoShould {

    @Test
    public void ownTwoCells() {
        // given
        final Domino domino = new Domino(0, 1);

        // then
        assertThat(domino.getCells()).hasSize(2);
    }
}
