package finalProject;
public class AI

{

	// 6 = user storage, 13 = enemy storage

	private boolean hardMode;

	public AI(Boolean difficulty)

	{

		hardMode = difficulty; // difficulty is true if hardMode is selected,

		// false if easy

	}

	public void takeTurn(Holes[] holes)

	{

		if (hardMode == false) // easy mode randomly selects 1 of 6 cells on its
								// side and moves if cell has stones

		{

			int random = (int) (Math.random() * 6);

			int stones = holes[random].getStones();

			for (int loop = random + 1; loop <= holes.length; loop++)

			{

				while (stones > 0)

				{

					if (loop != 6)

					{

						holes[loop].addOneStone();

						stones--;
					}
				}
			}
		} else if (hardMode == true) {
			// still needs to be done
		}
	}
}

// Computer generated player, manually plays the game in the place of another
// player.

// Can be set to easy/hard.

// Easy mode is where the computer randomly selects 1 of the 6 cells on its side

// and moves (if the cell has any stones).

// Continues moving until turn/game ends.

// Hard mode keeps track of more intelligent moves, such as scanning

// the board and seeing what move would bring another turn or capture stones on
// the

// opposite side (prioritize extra moves (if multiple found, prioritize

// the one closest to the AI’s home base, then check again), then capture moves

// (and if none), then regular moves).
