package gameOfLife;

/**
 * Interface to visual implementation of game.
 * 
 * @author toshko.todorov
 * 
 */
public interface IBoardVisualizer {

	/**
	 * Display current state of board on the screen.
	 */
	public void displayCurrentStateOfBoard();

	/**
	 * Play game in infinity loop
	 */
	public void playGame();

}
