package fr.studec.codingdojo.domino;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.studec.codingdojo.domino.grid.GridShould;
import fr.studec.codingdojo.domino.solver.SolverShould;
import fr.studec.codingdojo.domino.tiling.TilingShould;

@RunWith(Suite.class)
@SuiteClasses({
    GridShould.class, TilingShould.class, SolverShould.class
})
public class TilingTestSuite {

}
