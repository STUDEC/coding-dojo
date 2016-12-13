#!/usr/bin/env node

// Cell encoding basis => position (1,1) is (100 + 1) = 101
const BASE = 100;

// Utilities

/* test if an array contains the given element */
var contains = (arr, elem) => arr.indexOf(elem) > -1;
/* remove the given elements from the given array, does not modify the initial array */
var remove = (arr, elems) => {
  var result = arr.slice();
  elems.forEach(elem => {
    var index = result.indexOf(elem);
    if (index > -1) { 
      result.splice(index, 1);
    }
  });
  return result;
};
/* tile down from the given position */
var down = (pos) => pos + BASE;
/* tile right from the given position */
var right = (pos) => pos + 1;

// Actual paving solver
var solutions = [];
var solve = function (state) {
  if (state.empty.length == 0) {
    solutions.push(state);
    return;
  }
  var tile1 = state.empty[0];
  [down(tile1), right(tile1)].forEach(tile2 => {
    if (contains(state.empty, tile2)) {
      let tile = [tile1, tile2];
      solve({
        empty: remove(state.empty, tile),
        tiles: state.tiles.concat(tile.join())
      });
    }
  });
};

// Launching the solver on the 
console.time('solving');
solve({
  empty: [
        101,102,103,104,105,
    200,201,202,203,204,205,
    300,301,302,303,304,305,
    400,401,402,403,404,405,
    500,501,502,503,504,505,
    600,601,602,603,604
  ],
  tiles: []
});
console.timeEnd('solving');
console.log('Found ' + solutions.length + ' solutions');
if (solutions.length) {
  console.log(solutions[0]);
}