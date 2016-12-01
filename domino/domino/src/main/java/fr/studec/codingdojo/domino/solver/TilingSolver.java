package fr.studec.codingdojo.domino.solver;

import fr.studec.codingdojo.domino.tiling.Tiling;

@FunctionalInterface
public interface TilingSolver {
    Tiling solve(int maxIterrations);
}
