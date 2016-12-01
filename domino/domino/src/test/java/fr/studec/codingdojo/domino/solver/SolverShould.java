package fr.studec.codingdojo.domino.solver;

import static org.assertj.core.api.Assertions.fail;

import org.junit.Ignore;
import org.junit.Test;

import fr.studec.codingdojo.domino.tiling.Tiling;

public class SolverShould {
    @Ignore
    @Test
    public void failForOddNumberOfCells() {
        // given
        final int N = 100000;
        final TilingSolver algorithm = null; // new TilingSolver(1, 1);

        // when
        final Tiling tiling = algorithm.solve(N);

        // then
        fail("not yet implemented");
    }
}
